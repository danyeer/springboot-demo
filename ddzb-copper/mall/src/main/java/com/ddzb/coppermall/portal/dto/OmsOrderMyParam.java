package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class OmsOrderMyParam {

    @ApiModelProperty(value = "订单状态 1签约中 待A签约 2 待B付款 3买家已付款 待卖家发货 4卖家已发货 待买家收货 5 买家已收货并上传验收结果 待卖家确认验收结果  6 待买家付尾款  7 已完成  8 申诉 -1买家拒绝签约 -2卖家拒绝签约 -3验收不通过 0删除订单")
    private Integer status;

    @ApiModelProperty(value = "类型 1->竞价 2->现货 3->招标",required = true)
    private Integer type;

    @ApiModelProperty(value = "标题")
    private String titles;

    @ApiModelProperty(value = "品名Id")
    private Long productCategoryId;

    @ApiModelProperty(value = "品牌Id")
    private Long brandId;

    @ApiModelProperty(value = "牌号code")
    private String dictionary1Code;

    @ApiModelProperty(value = "成交日期-开始")
    private String startTime;

    @ApiModelProperty(value = "成交日期-截止")
    private String endTime;

    @ApiModelProperty(value = "供货/采购商 企业名称")
    private String userEnterprisename;

    @ApiModelProperty(required = true)
    private Integer pageNum;

    @ApiModelProperty(required = true)
    private Integer pageSize;


    private Long userId;
}
