package com.ddzb.coppermall.portal.dto;

import com.ddzb.coppermall.portal.validator.ObjectNotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
@Data
public class UmsMemberUpdateParam {

//    @ApiModelProperty(value = "账户")
//    @NotEmpty(message = "账户不能为空")
//    private String username;

    @ApiModelProperty(value = "身份证号")
    @NotEmpty(message = "身份证号不能为空")
    private String cardno;

    @ApiModelProperty(value = "昵称/姓名")
    @NotEmpty(message = "昵称/姓名不能为空")
    private String nickname;

    @ApiModelProperty(value = "手机号")
    @NotEmpty(message = "手机号不能为空")
    private String phone;
    @ApiModelProperty(value = "验证码")
    @NotEmpty(message = "验证码不能为空")
    private String authCode;
}
