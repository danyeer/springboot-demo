package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PmsProductBatchInsertParam {
    @ApiModelProperty(value = "productId",required = true)
    private Long productId;

    @ApiModelProperty(value = "报价金额",required = true)
    private BigDecimal money;

    @ApiModelProperty(value = "报价数量",required = true)
    private BigDecimal numbers;

    @ApiModelProperty(value = "类型 1->竞价 2->现货 3->招标",required = true)
    private Integer type;


}
