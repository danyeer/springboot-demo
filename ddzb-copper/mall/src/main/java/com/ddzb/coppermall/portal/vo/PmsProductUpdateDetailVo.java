package com.ddzb.coppermall.portal.vo;

import com.ddzb.coppermall.model.PmsProduct;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PmsProductUpdateDetailVo extends PmsProduct {

    @ApiModelProperty(value = "一级分类")
    private String productCategoryParentName;

    @ApiModelProperty(value = "一级分类")
    private Long productCategoryParentId;

}
