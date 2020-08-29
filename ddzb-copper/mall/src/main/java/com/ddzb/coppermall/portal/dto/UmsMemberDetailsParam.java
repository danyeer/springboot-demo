package com.ddzb.coppermall.portal.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
public class UmsMemberDetailsParam {

    @NotEmpty(message = "法人姓名不能为空")
    @ApiModelProperty(value = "法人姓名",required = true)
    private String name;

    @ApiModelProperty(value = "法人身份证号码",required = true)
    @NotEmpty(message = "法人姓名不能为空")
    private String cardcode;

    @ApiModelProperty(value = "信用代码",required = true)
    private String creditcode;

    @ApiModelProperty(value = "企业全称",required = true)
    private String enterprisename;

    @ApiModelProperty(value = "企业执照",required = true)
    private String enterpriselicense;

    @ApiModelProperty(value = "主营name")
    private String mainBusiness;

    @ApiModelProperty(value = "办公电话")
    private String phone;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "省")
    private Long province;

    @ApiModelProperty(value = "市")
    private Long city;

    @ApiModelProperty(value = "区县")
    private Long county;

    @ApiModelProperty(value = "省name")
    private String pname;

    @ApiModelProperty(value = "城市name")
    private String cname;

    @ApiModelProperty(value = "区name")
    private String oname;

    @ApiModelProperty(value = "管理员姓名",required = true)
    @NotEmpty(message = "管理员姓名不能为空")
    private String nickname;

    @ApiModelProperty(value = "管理员身份证号",required = true)
    @NotEmpty(message = "管理员身份证号不能为空")
    private String cardno;

    @ApiModelProperty(value = "注册资本")
    private String registered;
}
