package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class PmsProductMyAuctionParam {

    @ApiModelProperty(value = "交易类型 1->竞价 3->招标",required = true)
    private Integer type;

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

    @ApiModelProperty(value = "状态 1->敬请期待 2->进行 3->过期")
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
