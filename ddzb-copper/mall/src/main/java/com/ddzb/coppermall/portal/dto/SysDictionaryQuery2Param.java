package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class SysDictionaryQuery2Param {
    @ApiModelProperty(value = "父节点 如：10->牌号;11->生产工艺;12->形状")
    @NotEmpty(message = "节点为空")
    private String parentCode;
}
