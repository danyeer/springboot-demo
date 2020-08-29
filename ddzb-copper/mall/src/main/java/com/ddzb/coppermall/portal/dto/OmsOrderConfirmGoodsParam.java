package com.ddzb.coppermall.portal.dto;

import com.ddzb.coppermall.portal.validator.ObjectNotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OmsOrderConfirmGoodsParam {

    @ApiModelProperty(value = "订单ID", required = true)
    @ObjectNotNull(message = "主ID不能为空")
    private Long id;

    @ApiModelProperty(value = "最终单价", required = true)
    @ObjectNotNull(message = "最终单价不能为空")
    private BigDecimal finalPrice;

    @ApiModelProperty(value = "最终数量", required = true)
    @ObjectNotNull(message = "最终数量不能为空")
    private BigDecimal finalNumbers;

    @ApiModelProperty(value = "实际货款", required = true)
    @ObjectNotNull(message = "实际货款不能为空")
    private BigDecimal finalDeposit;

    @ApiModelProperty(value = "验货凭证")
    private String finalImg;

    @ApiModelProperty(value = "验货描述")
    private String finalNote;

    @ApiModelProperty(value = "非空为修改")
    private String type;

}
