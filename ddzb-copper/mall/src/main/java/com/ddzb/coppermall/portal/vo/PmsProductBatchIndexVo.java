package com.ddzb.coppermall.portal.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PmsProductBatchIndexVo {
    @ApiModelProperty(value = "订单类型 1->竞价 2->现货 3->招标")
    private Integer type;
    @ApiModelProperty(value = "品名（产品名称）")
    private String productCategoryName;
    @ApiModelProperty(value = "品牌名称")
    private String brandName;
    @ApiModelProperty(value = "价格")
    private BigDecimal price;
    @ApiModelProperty(value = "下单人")
    private String userPhone;
    @ApiModelProperty(value = "时间")
    private Date createTime;

    @ApiModelProperty(value = "数量")
    private BigDecimal numbers;

}
