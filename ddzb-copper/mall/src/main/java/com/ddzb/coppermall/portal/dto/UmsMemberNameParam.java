package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
@Data
public class UmsMemberNameParam {

    @ApiModelProperty(value = "账户")
    @NotEmpty(message = "账户不能为空")
    private String username;

    @ApiModelProperty(value = "修改验证 需要Id")
    private Long id;
}
