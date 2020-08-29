package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PmsProductMarketParam {

    @ApiModelProperty(value = "父级分类id")
    private String productCategoryParentId;

    @ApiModelProperty(value = "品名(二级分类)id")
    private String productCategoryId;

    @ApiModelProperty(value = "牌号code")
    private String dictionary1Code;

    @ApiModelProperty(value = "交收地id")
    private Long deliveryPid;

    @ApiModelProperty(value = "品牌id")
    private Long brandId;

    @ApiModelProperty(value = "排序 1->默认； 2->价格" ,required = true)
    private Integer orderBy;

    @ApiModelProperty(required = true)
    private Integer pageNum;

    @ApiModelProperty(required = true)
    private Integer pageSize;
}
