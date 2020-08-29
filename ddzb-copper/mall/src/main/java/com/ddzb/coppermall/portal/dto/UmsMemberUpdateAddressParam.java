package com.ddzb.coppermall.portal.dto;

import com.ddzb.coppermall.portal.validator.ObjectNotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UmsMemberUpdateAddressParam {
    @ApiModelProperty(value = "详细地址", required = true)
    @NotEmpty(message = "详细地址不能为空")
    private String address;

    @ApiModelProperty(value = "省name", required = true)
    @NotEmpty(message = "省name不能为空")
    private String pname;

    @ApiModelProperty(value = "市name", required = true)
    @NotEmpty(message = "市name不能为空")
    private String cname;

    @ApiModelProperty(value = "区name", required = true)
    @NotEmpty(message = "区name不能为空")
    private String oname;

    @ApiModelProperty(value = "省ID", required = true)
    @ObjectNotNull(message = "省ID不能为空")
    private Long province;

    @ApiModelProperty(value = "市ID", required = true)
    @ObjectNotNull(message = "市ID不能为空")
    private Long city;

    @ApiModelProperty(value = "区ID", required = true)
    @ObjectNotNull(message = "区ID不能为空")
    private Long county;
}
