package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PmsProductBatchUpdateParam {

    @ApiModelProperty(value = "id",required = true)
    private Long id;

    @ApiModelProperty(value = "报价金额",required = true)
    private BigDecimal money;

    @ApiModelProperty(value = "报价数量",required = true)
    private BigDecimal numbers;


}
