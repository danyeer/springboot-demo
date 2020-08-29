package com.ddzb.coppermall.portal.vo;

import com.ddzb.coppermall.model.PmsProductBatch;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PmsProductAuctionBatchVo extends PmsProductBatch {
    @ApiModelProperty(value = "最高 1->是 0->否")
    private Integer isMax;
}
