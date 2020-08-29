package com.ddzb.coppermall.portal.dto;

import com.ddzb.coppermall.portal.validator.ObjectNotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UmsMemberForgetPassParam {

    @ApiModelProperty(value = "账户")
    @NotEmpty(message = "账户不能为空")
    private String username;

    @ApiModelProperty(value = "手机号")
    @NotEmpty(message = "手机号不能为空")
    private String phone;
    @ApiModelProperty(value = "验证码")
    @NotEmpty(message = "验证码不能为空")
    private String authCode;

    @ApiModelProperty(value = "新修改密码")
    @NotEmpty(message = "新密码不能为空")
    private String newPassword;
}
