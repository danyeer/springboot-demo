package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OmsOrderSaveParam {

    @ApiModelProperty(value = "报价id",required = true)
    private Long id;

    @ApiModelProperty(value = "产品id",required = true)
    private Long productId;

    @ApiModelProperty(value = "数量",required = true)
    private BigDecimal numbers;

    @ApiModelProperty(value = "合同链接",required = true)
    private String contractUrl;

    @ApiModelProperty(value = "订单类型 1->竞价 2->现货 3->招标",required = true)
    private Integer type;

    @ApiModelProperty(value = "价格",required = true)
    private BigDecimal price;

}
