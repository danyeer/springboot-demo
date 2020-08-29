package com.ddzb.coppermall.portal.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PmsProductMyAuctionVo {

    private Long id;

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

    @ApiModelProperty(value = "当前价（最新报价）")
    private BigDecimal money;

    @ApiModelProperty(value = "数量库存")
    private Integer stock;


    @ApiModelProperty(value = "拍卖开始时间（竞价时间）")
    private Date auctionStartTime;

    @ApiModelProperty(value = "拍卖结束时间（竞价时间）")
    private Date auctionEndTime;

    @ApiModelProperty(value = "出价次数")
    private Integer priceNums;

    @ApiModelProperty(value = "发布时间")
    private Date createTime;

    @ApiModelProperty(value = "上线状态：0->下线；1->上线")
    private Integer publishStatus;

    @ApiModelProperty(value = "状态 0->敬请期待 1->进行 2->过期")
    private Integer auctionStatus;


}
