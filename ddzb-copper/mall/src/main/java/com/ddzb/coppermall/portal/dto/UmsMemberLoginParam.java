package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
@Data
public class UmsMemberLoginParam {

    @ApiModelProperty(value = "账户")
    @NotEmpty(message = "账户不能为空")
    private String username;
    @ApiModelProperty(value = "密码")
    @NotEmpty(message = "密码不能为空")
    private String password;
}
