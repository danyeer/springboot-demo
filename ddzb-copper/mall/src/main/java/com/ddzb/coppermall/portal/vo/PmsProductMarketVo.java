package com.ddzb.coppermall.portal.vo;

import com.ddzb.coppermall.model.PmsProduct;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PmsProductMarketVo{

    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "主图(单张）")
    private String pic;

    @ApiModelProperty(value = "缩略图主图(单张）")
    private String picThum;

    @ApiModelProperty(value = "标题")
    private String titles;

    @ApiModelProperty(value = "起拍价/单价 0为议价")
    private BigDecimal price;

    @ApiModelProperty(value = "销量")
    private Integer sale;


}
