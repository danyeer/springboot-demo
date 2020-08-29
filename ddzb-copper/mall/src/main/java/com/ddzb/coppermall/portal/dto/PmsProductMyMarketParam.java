package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class PmsProductMyMarketParam {

    @ApiModelProperty(value = "标题")
    private String titles;

    @ApiModelProperty(value = "父级分类id")
    private String productCategoryParentId;

    @ApiModelProperty(value = "品名(二级分类)id")
    private String productCategoryId;

    @ApiModelProperty(value = "牌号code")
    private String dictionary1Code;

    @ApiModelProperty(value = "品牌id")
    private Long brandId;

    @ApiModelProperty(value = "状态 1->进行；2->售罄")
    private Integer auctionStatus;

    @ApiModelProperty(value = "发布日期-开始")
    private String startTime;
    @ApiModelProperty(value = "发布日期-截止")
    private String endTime;

    @ApiModelProperty(required = true)
    private Integer pageNum;

    @ApiModelProperty(required = true)
    private Integer pageSize;


    private Long userId;
}
