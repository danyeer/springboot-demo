package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
public class SysDictionaryQueryParam {

    @ApiModelProperty(value = "编码")
    private String code;

    @ApiModelProperty(value = "类型名称2！")
    private String name;

    @ApiModelProperty(value = "父节点 如：01")
    private String parentCode;

    private Integer pageNum;
    private Integer pageSize;
}
