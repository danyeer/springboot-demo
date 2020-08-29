package com.ddzb.coppermall.portal.vo;

import com.ddzb.coppermall.model.PmsProduct;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PmsProductAuctionDetailVo extends PmsProduct {

    @ApiModelProperty(value = "状态 0->敬请期待 1->进行 2->过期")
    private Integer auctionStatus;

    @ApiModelProperty(value = "一级分类")
    private String productCategoryParentName;


    @ApiModelProperty(value = "注册资本")
    private String businessRegistered;

    @ApiModelProperty(value = "主营")
    private String businessMainBusiness;

    @ApiModelProperty(value = "公司简介")
    private String businessDesc;

    @ApiModelProperty(value = "公司地址全")
    private String businessAddress;

    @ApiModelProperty(value = "联系电话")
    private String businessPhone;

    @ApiModelProperty(value = "联系人")
    private String businessName;
}
