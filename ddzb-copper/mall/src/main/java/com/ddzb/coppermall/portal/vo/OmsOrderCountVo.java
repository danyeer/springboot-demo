package com.ddzb.coppermall.portal.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class OmsOrderCountVo {

    @ApiModelProperty(value = "待A(供货商/采购商)签约")
    private Integer signing1;

    @ApiModelProperty(value = "待B付定金")
    private Integer signing2;

    @ApiModelProperty(value = "待发货（买家已付款 待卖家发货）")
    private Integer signing3;

    @ApiModelProperty(value = "待收货（卖家已发货 待买家收货）")
    private Integer signing4;

    @ApiModelProperty(value = "待确认验收（买家已收货并上传验收结果 待卖家确认验收结果）")
    private Integer signing5;

    @ApiModelProperty(value = "待付尾款(待买家付尾款)")
    private Integer signing6;

}
