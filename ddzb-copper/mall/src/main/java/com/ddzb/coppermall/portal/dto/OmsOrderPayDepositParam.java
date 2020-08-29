package com.ddzb.coppermall.portal.dto;

import com.ddzb.coppermall.portal.validator.ObjectNotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OmsOrderPayDepositParam {

    @ApiModelProperty(value = "订单ID", required = true)
    @ObjectNotNull(message = "主ID不能为空")
    private Long id;

    @ApiModelProperty(value = "实付定金金额", required = true)
    @ObjectNotNull(message = "定金金额不能为空")
    private BigDecimal depositDown;

    @ApiModelProperty(value = "定金支付方式 1->在线担保支付；2->在线支付；3->线下结算", required = true)
    @ObjectNotNull(message = "定金支付方式不能为空")
    private Integer depositPayment;

    @ApiModelProperty(value = "交易密码，非线下结算为必填")
    private String payPassword;

    @ApiModelProperty(value = "定金凭证")
    private String depositImg;


}
