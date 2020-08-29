package com.ddzb.coppermall.portal.vo;

import com.ddzb.coppermall.model.PmsProductBatch;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PmsProductBatchMyVo extends PmsProductBatch {


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

    @ApiModelProperty(value = "起拍价/单价 0为议价")
    private BigDecimal price;

    @ApiModelProperty(value = "拍卖开始时间（竞价时间）")
    private Date auctionStartTime;

    @ApiModelProperty(value = "拍卖结束时间（竞价时间）")
    private Date auctionEndTime;

    @ApiModelProperty(value = "当前价（最新报价）")
    private BigDecimal money2;

    @ApiModelProperty(value = "竞价状态 1->进行中 2->结束")
    private Integer productStatus;

    @ApiModelProperty(value = "最高 1->是 0->否")
    private Integer isMax;

    @ApiModelProperty(value = "签约方式 1->线下签约；2-> 电子合同")
    private Integer signingType;
}
