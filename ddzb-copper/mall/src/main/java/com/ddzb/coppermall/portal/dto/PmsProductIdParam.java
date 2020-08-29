package com.ddzb.coppermall.portal.dto;

import com.ddzb.coppermall.portal.validator.ObjectNotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PmsProductIdParam {

    @ApiModelProperty(value = "主ID" ,required = true)
    @ObjectNotNull(message = "主ID不能为空")
    private Long id;

}
