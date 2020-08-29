package com.ddzb.coppermall.portal.vo;

import com.ddzb.coppermall.model.OmsOrder;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单详情
 */
@Data
public class OmsOrderDetailVo extends OmsOrder {


    @ApiModelProperty(value = "标题")
    private String titles;

    @ApiModelProperty(value = "商品直径外径，默认为毫米")
    private BigDecimal diameter;

    @ApiModelProperty(value = "商品壁厚，默认为毫米")
    private BigDecimal walls;

    @ApiModelProperty(value = "商品宽度，默认为毫米")
    private BigDecimal widths;

    @ApiModelProperty(value = "商品长度，默认为毫米")
    private BigDecimal lengths;

    @ApiModelProperty(value = "品牌名称")
    private String brandName;

    @ApiModelProperty(value = "品名（商品分类名称）")
    private String productCategoryName;

    @ApiModelProperty(value = "牌号name")
    private String dictionary1Name;


    @ApiModelProperty(value = "供货商")
    private String userEnterprisename2;

    @ApiModelProperty(value = "签约方式 1->线下签约；2-> 电子合同")
    private Integer signingType;

    @ApiModelProperty(value = "交付方式 1->买家自提 2->送货")
    private Integer deliveryType;

    @ApiModelProperty(value = "定金 百分比")
    private Integer deposit;

    @ApiModelProperty(value = "定金支付方式 1->在线担保支付；2->在线支付；3->线下结算；4->线下线上均可")
    private Integer depositPayment;

    @ApiModelProperty(value = "尾款支付天数")
    private Integer finalDays;

    @ApiModelProperty(value = "尾款支付方式 1->线上；2->线下；3->线上线下均可")
    private Integer finalPayment;

    @ApiModelProperty(value = "交付天数(付款后xx天，为0请参考日期区间字段)")
    private Integer deliveryDays;

    @ApiModelProperty(value = "交付开始时间")
    private Date deliveryStartTime;

    @ApiModelProperty(value = "交付结束时间")
    private Date deliveryEndTime;


}
