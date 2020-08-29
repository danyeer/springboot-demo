package com.ddzb.coppermall.portal.vo;

import com.ddzb.coppermall.model.PmsProduct;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PmsProductAuctionVo extends PmsProduct {

    @ApiModelProperty(value = "状态 0->敬请期待 1->进行 2->过期")
    private Integer auctionStatus;

    @ApiModelProperty(value = "最新报价")
    private BigDecimal money;


}
