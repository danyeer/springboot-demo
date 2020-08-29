package com.ddzb.coppermall.portal.service;

import com.ddzb.coppermall.common.api.CommonResult;
import com.ddzb.coppermall.model.UmsMember;
import com.ddzb.coppermall.portal.component.SecurityUserHelper;
import com.ddzb.coppermall.portal.dto.*;

public interface UmsUserMemberService {
    /**
     * 根据用户名获取
     */
    UmsMember getByUserAccount(String account);

    CommonResult generateAuthCode(String telephone) throws Exception;

    CommonResult register(UmsMemberRegisterParam param);

    CommonResult login(UmsMemberLoginParam param) throws Exception;

    /**
     * 基本信息（detail）
     *
     * @param id
     * @return
     */
    CommonResult queryUserInfo();

    CommonResult nameVerification(UmsMemberNameParam param);

    CommonResult updatePass(UmsMemberPassParam param);

    CommonResult updateMember(UmsMemberUpdateParam param);

    CommonResult updateMemberCode(UmsMemberUpdateCodeParam param);

    CommonResult updateMemberAddress(UmsMemberUpdateAddressParam param);

    CommonResult updateMemberPhone(UmsMemberUpdatePhoneParam param);

    CommonResult authMember(UmsMemberDetailsParam param);

    CommonResult forgetPass(UmsMemberForgetPassParam param);

    /**
     * 会员中心
     *
     * @return
     */
    CommonResult getMemberCenter(Integer type);

    /**
     * 判断用户是否认证
     * @return
     */
    CommonResult authBoolean();
}
