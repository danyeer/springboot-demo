package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PmsProductMarketIndexParam {

    @ApiModelProperty(value = "父级分类id" ,required = true)
    private String productCategoryParentId;

    @ApiModelProperty(required = true)
    private Integer pageNum;

    @ApiModelProperty(required = true)
    private Integer pageSize;
}
