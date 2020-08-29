package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PmsProductAuctionBatchParam {

    @ApiModelProperty(value = "productId",required = true)
    private Long productId;

    @ApiModelProperty(value = "类型 1->竞价 3->招标")
    private Integer type;

    @ApiModelProperty(required = true)
    private Integer pageNum;

    @ApiModelProperty(required = true)
    private Integer pageSize;
}
