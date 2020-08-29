package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 我的报价
 */
@Data
public class PmsProductBatchMyParam {

    @ApiModelProperty(value = "竞价状态 1->进行中 2->结束",required = true)
    private Integer productStatus;

    @ApiModelProperty(value = "类型 1->竞价 3->招标",required = true)
    private Integer type;

    @ApiModelProperty(value = "标题")
    private String titles;

    @ApiModelProperty(value = "品名Id")
    private Long productCategoryId;

    @ApiModelProperty(value = "品牌Id")
    private Long brandId;

    @ApiModelProperty(value = "牌号code")
    private String dictionary1Code;

    @ApiModelProperty(value = "发布日期-开始")
    private String startTime;

    @ApiModelProperty(value = "发布日期-截止")
    private String endTime;

    @ApiModelProperty(value = "采购/供货商 企业名称")
    private String userEnterprisename;

    @ApiModelProperty(required = true)
    private Integer pageNum;

    @ApiModelProperty(required = true)
    private Integer pageSize;


    private Long userId;
}
