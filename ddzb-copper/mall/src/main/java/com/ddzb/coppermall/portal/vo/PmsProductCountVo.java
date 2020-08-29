package com.ddzb.coppermall.portal.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PmsProductCountVo {

    @ApiModelProperty(value = "总计")
    private Integer totals;

    @ApiModelProperty(value = "进行中")
    private Integer haveInHand;

    @ApiModelProperty(value = "已结束")
    private Integer finished;
}
