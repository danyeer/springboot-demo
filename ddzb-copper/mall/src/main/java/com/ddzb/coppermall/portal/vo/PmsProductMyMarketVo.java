package com.ddzb.coppermall.portal.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class PmsProductMyMarketVo {
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

    @ApiModelProperty(value = "单价（元/吨）")
    private BigDecimal price;


    @ApiModelProperty(value = "数量库存")
    private Integer stock;


    @ApiModelProperty(value = "发布时间")
    private Date createTime;

    @ApiModelProperty(value = "上线状态：0->下线；1->上线")
    private Integer publishStatus;

    @ApiModelProperty(value = "状态 1->进行 2->售罄")
    private Integer auctionStatus;

    @ApiModelProperty(value = "已售数量")
    private Integer soldStock;
}
