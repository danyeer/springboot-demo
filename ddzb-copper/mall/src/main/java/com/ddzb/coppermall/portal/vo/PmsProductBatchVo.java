package com.ddzb.coppermall.portal.vo;

import com.ddzb.coppermall.model.PmsProductBatch;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PmsProductBatchVo extends PmsProductBatch {
    @ApiModelProperty(value = "最高 1->是 0->否")
    private Integer isMax;
    @ApiModelProperty(value = "企业地址")
    private String address;
    @ApiModelProperty(value = "签约方式 1->线下签约；2-> 电子合同")
    private Integer signingType;

    @ApiModelProperty(value = "商品状态 1->正常；2-> 结束")
    private Integer productStatus;
}
