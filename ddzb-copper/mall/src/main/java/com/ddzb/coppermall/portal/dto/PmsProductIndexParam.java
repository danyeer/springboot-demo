package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PmsProductIndexParam {

    @ApiModelProperty(value = "交易类型 1->竞价 3->招标",required = true)
    private Integer type;

    @ApiModelProperty(value = "父级分类id" ,required = true)
    private String productCategoryParentId;

    @ApiModelProperty(required = true)
    private Integer pageNum;

    @ApiModelProperty(required = true)
    private Integer pageSize;
}
