package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UmsMemberUpdateCodeParam {
    @ApiModelProperty(value = "主营业务",required = true)
    @NotEmpty(message = "主营业务")
    private String mainBusiness;
}
