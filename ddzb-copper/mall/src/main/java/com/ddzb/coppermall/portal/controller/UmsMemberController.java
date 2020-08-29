package com.ddzb.coppermall.portal.controller;

import com.ddzb.coppermall.common.api.CommonResult;
import com.ddzb.coppermall.portal.bo.UserInfoDetails;
import com.ddzb.coppermall.portal.component.SecurityUserHelper;
import com.ddzb.coppermall.portal.dto.*;
import com.ddzb.coppermall.portal.service.UmsUserMemberService;
import com.ddzb.coppermall.portal.vo.UmsMemberCenterVo;
import com.ddzb.coppermall.portal.vo.UmsMemberDetailsVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
@Api(tags = "03账户管理", description = "账户管理")
public class UmsMemberController {


    @Autowired
    UmsUserMemberService memberService;

    @ApiOperation("01-获取验证码")
    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
    public CommonResult getAuthCode(@RequestParam String telephone) {
        try {
            return memberService.generateAuthCode(telephone);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed();
        }
    }

    @ApiOperation("02-注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public CommonResult register(@RequestBody @Validated UmsMemberRegisterParam param) {
        return memberService.register(param);
    }

    @ApiOperation(value = "03-登录以后返回token ")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CommonResult login(@RequestBody @Validated UmsMemberLoginParam param) {
        try {
            return memberService.login(param);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResult.failed(e.getMessage());
        }
    }

    @ApiOperation("04-获取基本信息")
    @RequestMapping(value = "/getUserInfo", method = RequestMethod.POST)
    public CommonResult<UmsMemberDetailsVo> getUserInfo() {
        return memberService.queryUserInfo();
    }


    @ApiOperation(value = "05-验证用户名存在")
    @RequestMapping(value = "/nameVerification", method = RequestMethod.POST)
    public CommonResult nameVerification(@RequestBody @Validated UmsMemberNameParam param) {
        return memberService.nameVerification(param);
    }

    @ApiOperation(value = "06-修改密码")
    @RequestMapping(value = "/updatePass", method = RequestMethod.POST)
    public CommonResult updatePass(@RequestBody @Validated UmsMemberPassParam param) {
        return memberService.updatePass(param);

    }

    @ApiOperation(value = "07-更换管理员信息")
    @RequestMapping(value = "/updateMember", method = RequestMethod.POST)
    public CommonResult updateMember(@RequestBody @Validated UmsMemberUpdateParam param) {
        return memberService.updateMember(param);

    }

    @ApiOperation(value = "08-更新主营业务")
    @RequestMapping(value = "/updateMemberCode", method = RequestMethod.POST)
    public CommonResult updateMemberCode(@RequestBody @Validated UmsMemberUpdateCodeParam param) {
        return memberService.updateMemberCode(param);

    }

    @ApiOperation(value = "09-更新办公地址")
    @RequestMapping(value = "/updateMemberAddress", method = RequestMethod.POST)
    public CommonResult updateMemberAddress(@RequestBody @Validated UmsMemberUpdateAddressParam param) {
        return memberService.updateMemberAddress(param);

    }

    @ApiOperation(value = "10-更新办公电话")
    @RequestMapping(value = "/updateMemberPhone", method = RequestMethod.POST)
    public CommonResult updateMemberPhone(@RequestBody @Validated UmsMemberUpdatePhoneParam param) {
        return memberService.updateMemberPhone(param);

    }

    @ApiOperation(value = "11-认证")
    @RequestMapping(value = "/authMember", method = RequestMethod.POST)
    public CommonResult authMember(@RequestBody @Validated UmsMemberDetailsParam param) {
        return memberService.authMember(param);

    }


    @ApiOperation(value = "12-忘记密码")
    @RequestMapping(value = "/forgetPass", method = RequestMethod.POST)
    public CommonResult forgetPass(@RequestBody @Validated UmsMemberForgetPassParam param) {
        return memberService.forgetPass(param);
    }

    @ApiOperation(value = "13-获取会员中心;参数： type 1->供货商 2->采购商")
    @RequestMapping(value = "/getMemberCenter", method = RequestMethod.POST)
    public CommonResult<UmsMemberCenterVo> getMemberCenter(@RequestParam Integer type) {
        return memberService.getMemberCenter(type);
    }

    @ApiOperation(value = "14-判断用户是否认证")
    @RequestMapping(value = "/authBoolean", method = RequestMethod.POST)
    public CommonResult authBoolean() {
        return memberService.authBoolean();

    }

}
