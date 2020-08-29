package com.ddzb.coppermall.portal.vo;

import com.ddzb.coppermall.model.PmsProductBatch;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PmsProductBatchMyMarketVo extends PmsProductBatch {


    @ApiModelProperty(value = "标题")
    private String titles;

    @ApiModelProperty(value = "品牌名称")
    private String brandName;

    @ApiModelProperty(value = "品名（商品分类名称）")
    private String productCategoryName;

    @ApiModelProperty(value = "牌号name")
    private String dictionary1Name;

    @ApiModelProperty(value = "商品直径外径，默认为毫米")
    private BigDecimal diameter;

    @ApiModelProperty(value = "商品壁厚，默认为毫米")
    private BigDecimal walls;

    @ApiModelProperty(value = "商品宽度，默认为毫米")
    private BigDecimal widths;

    @ApiModelProperty(value = "商品长度，默认为毫米")
    private BigDecimal lengths;

    @ApiModelProperty(value = "单价 0为议价")
    private BigDecimal price;

    @ApiModelProperty(value = "竞价状态 1->进行中 2->售罄")
    private Integer productStatus;

    @ApiModelProperty(value = "签约方式 1->线下签约；2-> 电子合同")
    private Integer signingType;


    @ApiModelProperty(value = "起订量")
    private BigDecimal startingStock;

    @ApiModelProperty(value = "库存量")
    private BigDecimal stock;
}
