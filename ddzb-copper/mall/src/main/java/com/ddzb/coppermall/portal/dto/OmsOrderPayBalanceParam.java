package com.ddzb.coppermall.portal.dto;

import com.ddzb.coppermall.portal.validator.ObjectNotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class OmsOrderPayBalanceParam {
    @ApiModelProperty(value = "订单ID", required = true)
    @ObjectNotNull(message = "主ID不能为空")
    private Long id;

    @ApiModelProperty(value = "尾款支付方式 1->在线支付；2->线下结算", required = true)
    @ObjectNotNull(message = "尾款支付方式不能为空")
    private Integer balancePayment;

    @ApiModelProperty(value = "交易密码，非线下结算为必填")
    private String payPassword;

    @ApiModelProperty(value = "尾款凭证")
    private String balanceImg;
}
