package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
@Data
public class UmsMemberUpdatePhoneParam {

    @ApiModelProperty(value = "phone",required = true)
    @NotEmpty(message = "phone不能为空")
    private String phone;
}
