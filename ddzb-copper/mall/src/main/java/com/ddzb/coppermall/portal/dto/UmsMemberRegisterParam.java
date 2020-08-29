package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UmsMemberRegisterParam {
    @ApiModelProperty(value = "账户")
    @NotEmpty(message = "账户不能为空")
    private String username;
    @ApiModelProperty(value = "密码")
    @NotEmpty(message = "密码不能为空")
    private String password;
    @ApiModelProperty(value = "手机号")
    @NotEmpty(message = "手机号不能为空")
    private String phone;
    @ApiModelProperty(value = "验证码")
    @NotEmpty(message = "验证码不能为空")
    private String authCode;
}
