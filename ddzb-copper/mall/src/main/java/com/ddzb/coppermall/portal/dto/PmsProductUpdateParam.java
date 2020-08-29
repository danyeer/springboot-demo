package com.ddzb.coppermall.portal.dto;

import com.ddzb.coppermall.portal.validator.ObjectNotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class PmsProductUpdateParam {

    @ApiModelProperty(value = "主ID" ,required = true)
    @ObjectNotNull(message = "主ID不能为空")
    private Long id;

    @ApiModelProperty(value = "交易类型1->竞价 2->现货 3->招标" ,required = true)
    @ObjectNotNull(message = "交易类型不能为空")
    private Integer type;

    @ApiModelProperty(value = "品牌ID",required = true)
    @ObjectNotNull(message = "品牌ID不能为空")
    private Long brandId;

    @ApiModelProperty(value = "品牌名称",required = true)
    @NotEmpty(message = "品牌名称不能为空")
    private String brandName;

    @ApiModelProperty(value = "（品名）ID",required = true)
    @ObjectNotNull(message = "品名ID不能为空")
    private Long productCategoryId;

    @ApiModelProperty(value = "（品名）名称",required = true)
    @NotEmpty(message = "（品名）不能为空")
    private String productCategoryName;

    @ApiModelProperty(value = "标题",required = true)
    @NotEmpty(message = "品牌名称不能为空")
    private String titles;


    @ApiModelProperty(value = "牌号code",required = true)
    @NotEmpty(message = "牌号code不能为空")
    private String dictionary1Code;

    @ApiModelProperty(value = "牌号name",required = true)
    @NotEmpty(message = "牌号name不能为空")
    private String dictionary1Name;

    @ApiModelProperty(value = "生产工艺code",required = true)
    @NotEmpty(message = "生产工艺code不能为空")
    private String dictionary2Code;

    @ApiModelProperty(value = "生产工艺name",required = true)
    @NotEmpty(message = "生产工艺name不能为空")
    private String dictionary2Name;

    @ApiModelProperty(value = "形状code",required = true)
    @NotEmpty(message = "形状code不能为空")
    private String dictionary3Code;

    @ApiModelProperty(value = "形状name",required = true)
    @NotEmpty(message = "形状name不能为空")
    private String dictionary3Name;

    @ApiModelProperty(value = "起拍价/单价 0为议价",required = true)
    @ObjectNotNull(message = "起拍价/单价不能为空")
    private BigDecimal price;

    @ApiModelProperty(value = "用途")
    private String description;

    @ApiModelProperty(value = "数量库存",required = true)
    @ObjectNotNull(message = "数量不能为空")
    private BigDecimal stock;

    @ApiModelProperty(value = "起订数量")
//    @ObjectNotNull(message = "起订数量不能为空")
    private BigDecimal startingStock;

    @ApiModelProperty(value = "交收地详细地址",required = true)
    @NotEmpty(message = "交收地详细地址不能为空")
    private String deliveryAddress;

    @ApiModelProperty(value = "交收地 省id",required = true)
    @ObjectNotNull(message = "交收地 省id不能为空")
    private Long deliveryPid;

    @ApiModelProperty(value = "交收地 市id",required = true)
    @ObjectNotNull(message = "交收地 市id不能为空")
    private Long deliveryCid;

    @ApiModelProperty(value = "交收地 区id",required = true)
    @ObjectNotNull(message = "交收地 区id不能为空")
    private Long deliveryOid;

    @ApiModelProperty(value = "交收地 省name",required = true)
    @NotEmpty(message = "交收地 省name不能为空")
    private String deliveryPname;

    @ApiModelProperty(value = "交收地 市name",required = true)
    @NotEmpty(message = "交收地 市name不能为空")
    private String deliveryCname;

    @ApiModelProperty(value = "交收地 区name",required = true)
    @NotEmpty(message = "交收地 区name不能为空")
    private String deliveryOname;



    @ApiModelProperty(value = "交付方式 1->买家自提 2->送货",required = true)
    @ObjectNotNull(message = "交付方式不能为空")
    private Integer deliveryType;

    @ApiModelProperty(value = "商品直径外径，默认为毫米")
    private BigDecimal diameter;

    @ApiModelProperty(value = "商品壁厚，默认为毫米")
    private BigDecimal walls;

    @ApiModelProperty(value = "商品宽度，默认为毫米")
    private BigDecimal widths;

    @ApiModelProperty(value = "商品长度，默认为毫米")
    private BigDecimal lengths;

    @ApiModelProperty(value = "签约方式 1->线下签约；2-> 电子合同",required = true)
    @ObjectNotNull(message = "签约方式不能为空")
    private Integer signingType;


    @ApiModelProperty(value = "定金 百分",required = true)
    @ObjectNotNull(message = "定金 百分不能为空")
    private Integer deposit;

    @ApiModelProperty(value = "定金支付方式 1->在线担保支付；2->在线支付；3->线下结算；4->线下线上均可",required = true)
    @ObjectNotNull(message = "定金支付方式不能为空")
    private Integer depositPayment;

    @ApiModelProperty(value = "尾款支付天数",required = true)
    @ObjectNotNull(message = "尾款支付天数不能为空")
    private Integer finalDays;

    @ApiModelProperty(value = "尾款支付方式 1->线上；2->线下；3->线上线下均可",required = true)
    @ObjectNotNull(message = "尾款支付方式不能为空")
    private Integer finalPayment;

    @ApiModelProperty(value = "交付天数(付款后xx天，为0请参考日期区间字段)")
    private Integer deliveryDays;

    @ApiModelProperty(value = "交付开始时间")
    private Date deliveryStartTime;

    @ApiModelProperty(value = "交付结束时间")
    private Date deliveryEndTime;

    @ApiModelProperty(value = "发票 1->增值税；2->专用；3->无",required = true)
    @ObjectNotNull(message = "发票不能为空")
    private Integer invoice;

    @ApiModelProperty(value = "合同模板")
    private String contractTemplate;

    @ApiModelProperty(value = "拍卖开始时间")
    private Date auctionStartTime;

    @ApiModelProperty(value = "拍卖结束时间")
    private Date auctionEndTime;

    @ApiModelProperty(value = "产品详情网页内容")
    private String detailHtml;

    @ApiModelProperty(value = "缩略图")
    private String picThum;

    @ApiModelProperty(value = "主图(单张）")
    private String pic;

    @ApiModelProperty(value = "上线状态：0->下线；1->上线",required = true)
    @ObjectNotNull(message = "上线状态不能为空")
    private Integer publishStatus;



}
