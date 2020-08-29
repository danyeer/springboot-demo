package com.ddzb.coppermall.portal.dto;

import com.ddzb.coppermall.portal.validator.ObjectNotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PmsProductSetPublishStatusParam {

    @ApiModelProperty(value = "主ID" ,required = true)
    @ObjectNotNull(message = "主ID不能为空")
    private Long id;

    @ApiModelProperty(value = "0->下线；1->上线",required = true)
    @ObjectNotNull(message = "状态不能为空")
    private Integer publishStatus;
}
