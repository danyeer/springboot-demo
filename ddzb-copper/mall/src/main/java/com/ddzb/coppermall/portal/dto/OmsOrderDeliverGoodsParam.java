package com.ddzb.coppermall.portal.dto;

import com.ddzb.coppermall.portal.validator.ObjectNotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class OmsOrderDeliverGoodsParam {
    @ApiModelProperty(value = "订单ID", required = true)
    @ObjectNotNull(message = "主ID不能为空")
    private Long id;

    @ApiModelProperty(value = "发货日期", required = true)
    @ObjectNotNull(message = "发货日期不能为空")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date deliveryDate;

    @ApiModelProperty(value = "发货凭证")
    private String deliveryImg;

    @ApiModelProperty(value = "发票")
    private String invoiceImg;

    @ApiModelProperty(value = "非空为修改")
    private String type;

}
