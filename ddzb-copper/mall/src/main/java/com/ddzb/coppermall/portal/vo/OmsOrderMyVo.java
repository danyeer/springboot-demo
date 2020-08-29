package com.ddzb.coppermall.portal.vo;

import com.ddzb.coppermall.model.OmsOrder;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 我的订单
 */
@Data
public class OmsOrderMyVo {

    private Long id;

    @ApiModelProperty(value = "订单编号")
    private String osn;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "订单数量 吨")
    private BigDecimal numbers;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "订单状态 1签约中 待A签约 2 待B付款 3 待买家付款 -1买家拒绝签约 -2卖家拒绝签约 4买家已付款 待卖家发货 5卖家已发货 待买家收货 6 买家已收货并上传验收结果 待卖家确认验收结果   7待买家付尾款  8 已完成  9申诉 -3验收不通过 0删除订单")
    private Integer status;


    @ApiModelProperty(value = "标题")
    private String titles;

    @ApiModelProperty(value = "主图-缩略")
    private String picThum;
    @ApiModelProperty(value = "主图")
    private String pic;

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

    @ApiModelProperty(value = "手机号码")
    private String userPhone;
    @ApiModelProperty(value = "企业名称")
    private String userEnterprisename;

    @ApiModelProperty(value = "对应的企业名称")
    private String userEnterprisename2;

    @ApiModelProperty(value = "合同链接地址")
    private String contractUrl;

    @ApiModelProperty(value = "定金支付方式 1->在线担保支付；2->在线支付；3->线下结算；4->线下线上均可")
    private Integer depositPayment;

    @ApiModelProperty(value = "定金 百分比")
    private Integer deposit;



    @ApiModelProperty(value = "发货日期")
    private Date deliveryDate;

    @ApiModelProperty(value = "发货凭证")
    private String deliveryImg;

    @ApiModelProperty(value = "发票")
    private String invoiceImg;


    @ApiModelProperty(value = "最终单价")
    private BigDecimal finalPrice;

    @ApiModelProperty(value = "最终数量")
    private BigDecimal finalNumbers;

    @ApiModelProperty(value = "实际货款")
    private BigDecimal finalDeposit;

    @ApiModelProperty(value = "验货凭证")
    private String finalImg;

    @ApiModelProperty(value = "验货描述")
    private String finalNote;


}
