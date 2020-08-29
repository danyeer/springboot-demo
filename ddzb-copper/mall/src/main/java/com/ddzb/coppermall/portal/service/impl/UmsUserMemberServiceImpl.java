package com.ddzb.coppermall.portal.service.impl;

import com.ddzb.coppermall.common.api.CommonResult;
import com.ddzb.coppermall.mapper.SysOperationLogMapper;
import com.ddzb.coppermall.mapper.UmsMemberDetailsMapper;
import com.ddzb.coppermall.mapper.UmsMemberMapper;
import com.ddzb.coppermall.model.*;
import com.ddzb.coppermall.portal.bo.UserInfoDetails;
import com.ddzb.coppermall.portal.component.SecurityUserHelper;
import com.ddzb.coppermall.portal.config.ConstantConfig;
import com.ddzb.coppermall.portal.dao.OmsOrderDao;
import com.ddzb.coppermall.portal.dao.PmsProductDao;
import com.ddzb.coppermall.portal.dao.UmsMemberDao;
import com.ddzb.coppermall.portal.dto.*;
import com.ddzb.coppermall.portal.service.RedisService;
import com.ddzb.coppermall.portal.service.UmsUserMemberService;
import com.ddzb.coppermall.portal.util.HttpPostUtil;
import com.ddzb.coppermall.portal.util.JwtTokenUtil;
import com.ddzb.coppermall.portal.util.VerifyCodeUtil;
import com.ddzb.coppermall.portal.vo.OmsOrderCountVo;
import com.ddzb.coppermall.portal.vo.PmsProductCountVo;
import com.ddzb.coppermall.portal.vo.UmsMemberCenterVo;
import com.ddzb.coppermall.portal.vo.UmsMemberDetailsVo;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.*;

@Service
public class UmsUserMemberServiceImpl implements UmsUserMemberService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UmsUserMemberServiceImpl.class);

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Autowired
    private UmsMemberDetailsMapper umsMemberDetailsMapper;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private UmsMemberDao umsMemberDao;

    @Autowired
    private OmsOrderDao omsOrderDao;

    @Autowired
    private PmsProductDao pmsProductDao;


    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private RedisService redisService;

    @Autowired
    private SysOperationLogMapper operationLogMapper;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Value("${redis.key.prefix.authCode}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;
    @Value("${redis.key.expire.authCode}")
    private Long AUTH_CODE_EXPIRE_SECONDS;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    SecurityUserHelper securityUserHelper;

    @Override
    public UmsMember getByUserAccount(String account) {
        UmsMemberExample example = new UmsMemberExample();
        example.createCriteria().andUsernameEqualTo(account);
        List<UmsMember> userinfoList = umsMemberMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userinfoList)) {
            return userinfoList.get(0);
        }
        return null;
    }

    @Override
    public CommonResult generateAuthCode(String telephone) throws Exception {
//        if (!VerifyCodeUtil.checkMobile(telephone)) {
//            return CommonResult.failed("手机号码格式错误");
//        }
//        StringBuilder sb = new StringBuilder();
//        Random random = new Random();
//        for (int i = 0; i < 4; i++) {
//            sb.append(random.nextInt(10));
//        }
//        //验证码绑定手机号并存储到redis
//        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + telephone, sb.toString());
//        redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE + telephone, AUTH_CODE_EXPIRE_SECONDS);
//        HttpPostUtil.sendMessageTemp(telephone, ConstantConfig.JSM4092903_0022, "@1@=" + sb);

        //测试
        String code = "1111";
        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + telephone, code);
        redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE + telephone, AUTH_CODE_EXPIRE_SECONDS);

        return CommonResult.success(code, "发送成功");
    }

    @Override
    public CommonResult register(UmsMemberRegisterParam param) {
        //验证码验证
        String authCode = param.getAuthCode();
        String phone = param.getPhone();
        String rCode = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + phone);
        if (StringUtils.isEmpty(rCode))
            return CommonResult.failed("验证码不存在");
        if (!rCode.equals(authCode))
            return CommonResult.failed("验证码不正确");

        UmsMember umsMember = new UmsMember();
        BeanUtils.copyProperties(param, umsMember);
        //查询是否有相同用户名的用户
        UmsMemberExample example = new UmsMemberExample();
        example.createCriteria().andPhoneEqualTo(umsMember.getUsername());
        List<UmsMember> umsMembersList = umsMemberMapper.selectByExample(example);
        if (umsMembersList.size() > 0) {
            return null;
        }
        umsMember.setCreateTime(new Date());
        umsMember.setStatus(1);
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(param.getPassword());
        umsMember.setPassword(encodePassword);
        int count = umsMemberMapper.insertSelective(umsMember);
        if (count > 0)
            return CommonResult.success("注册成功");
        return CommonResult.failed();
    }

    @Override
    public CommonResult login(UmsMemberLoginParam param) throws Exception {
        UserDetails userDetails = userDetailsService.loadUserByUsername(param.getUsername());
        if (!passwordEncoder.matches(param.getPassword(), userDetails.getPassword())) {
            throw new BadCredentialsException("密码不正确");
        }
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtTokenUtil.generateToken(userDetails);
        if (!StringUtils.isEmpty(token)) {
            Map<String, String> tokenMap = new HashMap<>();
            UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();
            UmsMemberDetailsVo memberDetailsVo = umsMemberDao.selectUserInfo(sysUserDetails.getSysUserinfo().getId());
            if (memberDetailsVo == null || StringUtils.isEmpty(memberDetailsVo.getEnterprisename()))
                tokenMap.put("auth", "0");
            else tokenMap.put("auth", "1");

            tokenMap.put("token", token);
            tokenMap.put("tokenHead", tokenHead);

            return CommonResult.success(tokenMap);
        }
        return CommonResult.failed();
    }

    @Override
    public CommonResult queryUserInfo() {
        //获取当前用户信息
        UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();
        if (sysUserDetails == null)
            return CommonResult.failed("用户未登录");
        UmsMemberDetailsVo memberDetailsVo = umsMemberDao.selectUserInfo(sysUserDetails.getSysUserinfo().getId());
        if (memberDetailsVo == null || StringUtils.isEmpty(memberDetailsVo.getEnterprisename()))
            return CommonResult.failed("用户未认证");
        else
            return CommonResult.success(memberDetailsVo);
    }

    @Override
    public CommonResult nameVerification(UmsMemberNameParam param) {
        Map<String, String> result = new HashMap<>();
        UmsMemberExample example = new UmsMemberExample();
        UmsMemberExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(param.getUsername());
        if (param.getId() != null) {
            criteria.andIdNotEqualTo(param.getId());
        }
        if (umsMemberMapper.countByExample(example) > 0)
            result.put("error", "用户名不能重复");
        else
            result.put("success", "成功");
        return CommonResult.success(result);
    }

    @Override
    public CommonResult updatePass(UmsMemberPassParam param) {
        String oldPass = param.getOldPassword();
        String newPass = param.getNewPassword();

        if (oldPass.equals(newPass)) {
            LOGGER.warn("修改密码异常:{}", "新密码与旧密码相同");
            return CommonResult.validateFailed("新密码与旧密码相同");
        }
        //获取当前用户信息
        UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();
        //判断旧密码
        if (!passwordEncoder.matches(oldPass, sysUserDetails.getPassword())) {
            LOGGER.warn("修改密码异常:{}", "原密码不正确");
            return CommonResult.validateFailed("原密码不正确");
        }
        UmsMember userinfo = new UmsMember();
        userinfo.setId(sysUserDetails.getSysUserinfo().getId());
        userinfo.setPassword(passwordEncoder.encode(newPass));
        int count = umsMemberMapper.updateByPrimaryKeySelective(userinfo);
        if (count > 0)
            return CommonResult.success("修改成功");
        else
            return CommonResult.failed();
    }

    @Override
    public CommonResult forgetPass(UmsMemberForgetPassParam param) {
        String username = param.getUsername();
        String phone = param.getPhone();
        String authCode = param.getAuthCode();
        String newPass = param.getNewPassword();
        //验证码验证
        String rCode = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + phone);
        if (StringUtils.isEmpty(rCode))
            return CommonResult.failed("验证码不存在");
        if (!rCode.equals(authCode))
            return CommonResult.failed("验证码不正确");

        UmsMember member = null;
        UmsMemberExample example = new UmsMemberExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UmsMember> userinfoList = umsMemberMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userinfoList)) {
            member = userinfoList.get(0);
        } else
            return CommonResult.failed("用户不存在");
        UmsMember userinfo = new UmsMember();
        userinfo.setId(member.getId());
        userinfo.setPassword(passwordEncoder.encode(newPass));
        int count = umsMemberMapper.updateByPrimaryKeySelective(userinfo);
        if (count > 0)
            return CommonResult.success("修改成功");
        else
            return CommonResult.failed();
    }

    @Override
    public CommonResult updateMember(UmsMemberUpdateParam param) {
        //获取当前用户信息
        UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();
        if (sysUserDetails == null)
            return CommonResult.failed("用户未登录");
        //验证码验证
        String authCode = param.getAuthCode();
        String phone = param.getPhone();
        String rCode = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + phone);
        if (StringUtils.isEmpty(rCode))
            return CommonResult.failed("验证码不存在");
        if (!rCode.equals(authCode))
            return CommonResult.failed("验证码不正确");

        //查询是手机号是否使用
        UmsMemberExample example = new UmsMemberExample();
        UmsMemberExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo(param.getPhone());
        criteria.andIdNotEqualTo(sysUserDetails.getSysUserinfo().getId());

        List<UmsMember> umsMembersList = umsMemberMapper.selectByExample(example);
        if (umsMembersList.size() > 0) {
            return CommonResult.failed("手机号码已经被使用");
        }

        UmsMember umsMember = new UmsMember();
        BeanUtils.copyProperties(param, umsMember);
        umsMember.setId(sysUserDetails.getSysUserinfo().getId());
        int count = umsMemberMapper.updateByPrimaryKeySelective(umsMember);
        if (count > 0)
            return CommonResult.success("更新成功");
        else return CommonResult.failed();
    }

    @Override
    public CommonResult updateMemberCode(UmsMemberUpdateCodeParam param) {
        UmsMemberDetails details = new UmsMemberDetails();
        BeanUtils.copyProperties(param, details);
        details.setModifyTime(new Date());
        return updateBean(details);
    }

    @Override
    public CommonResult updateMemberAddress(UmsMemberUpdateAddressParam param) {
        UmsMemberDetails details = new UmsMemberDetails();
        BeanUtils.copyProperties(param, details);
        details.setModifyTime(new Date());
        return updateBean(details);
    }

    @Override
    public CommonResult updateMemberPhone(UmsMemberUpdatePhoneParam param) {
        UmsMemberDetails details = new UmsMemberDetails();
        BeanUtils.copyProperties(param, details);
        details.setModifyTime(new Date());
        return updateBean(details);
    }

    @Override
    public CommonResult authMember(UmsMemberDetailsParam param) {
        //获取当前用户信息
//        LOGGER.error(securityUserHelper.getCurrentPrincipal()+"");
        UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();

        if (sysUserDetails == null)
            return CommonResult.failed("用户未登录");
        UmsMember member = new UmsMember();
        member.setId(sysUserDetails.getSysUserinfo().getId());
        member.setCardno(param.getCardno());
        member.setNickname(param.getNickname());
        int count = umsMemberMapper.updateByPrimaryKeySelective(member);

        UmsMemberDetails details = new UmsMemberDetails();
        BeanUtils.copyProperties(param, details);
        details.setCreateTime(new Date());
        details.setUserId(sysUserDetails.getSysUserinfo().getId());
        int count2 = umsMemberDetailsMapper.insertSelective(details);
        if (count2 > 0)
            return CommonResult.success("认证成功");
        else
            return CommonResult.failed();
    }


    private CommonResult updateBean(UmsMemberDetails details) {
        //获取当前用户信息
        UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();
        if (sysUserDetails == null)
            return CommonResult.failed("用户未登录");

        UmsMemberDetailsExample example = new UmsMemberDetailsExample();
        example.createCriteria().andUserIdEqualTo(sysUserDetails.getSysUserinfo().getId());

        int count = umsMemberDetailsMapper.updateByExampleSelective(details, example);
        if (count > 0)
            return CommonResult.success("更新成功");
        else return CommonResult.failed();
    }

    @Override
    public CommonResult getMemberCenter(Integer type) {

        //获取当前用户信息
        UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();
        if (sysUserDetails == null)
            return CommonResult.failed("用户未登录");
        UmsMemberCenterVo centerVo = new UmsMemberCenterVo();

        Long id = sysUserDetails.getSysUserinfo().getId();
        String username = sysUserDetails.getSysUserinfo().getUsername();
        centerVo.setUsername(username);

        //获取认证信息
        UmsMemberDetailsExample example = new UmsMemberDetailsExample();
        UmsMemberDetailsExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(id);
        List<UmsMemberDetails> details = umsMemberDetailsMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(details)) {
            UmsMemberDetails d = details.get(0);
            centerVo.setEnterprisename(d.getEnterprisename());
        }

//        订单
        OmsOrderCountVo orderCountVo;
        if (type == 2) {
            orderCountVo = omsOrderDao.queryOrderCount(id);
        } else {
            orderCountVo = omsOrderDao.queryOrderCount2(id);
        }
        centerVo.setOrderCount(orderCountVo);

//        我的发布
        PmsProductCountVo productCountVo;
        if (type == 2) {
            productCountVo = pmsProductDao.queryProductCount2(id);
        } else {
            productCountVo = pmsProductDao.queryProductCount(id);
        }
        centerVo.setProductCountVo(productCountVo);

//        消息列表
        PageHelper.startPage(1, 10);
        SysOperationLogExample example2 = new SysOperationLogExample();
        SysOperationLogExample.Criteria criteria1 = example2.createCriteria();
        criteria1.andUserIdEqualTo(id);
        List<SysOperationLog> list = operationLogMapper.selectByExample(example2);
        centerVo.setLogList(list);

        return CommonResult.success(centerVo);
    }

    @Override
    public CommonResult authBoolean() {
        //获取当前用户信息
        UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();
        if (sysUserDetails == null)
            return CommonResult.failed("用户未登录");
        UmsMemberDetailsVo memberDetailsVo = umsMemberDao.selectUserInfo(sysUserDetails.getSysUserinfo().getId());
        if (memberDetailsVo == null || StringUtils.isEmpty(memberDetailsVo.getEnterprisename()))
            return CommonResult.success(false);
        else
            return CommonResult.success(true);
    }
}
