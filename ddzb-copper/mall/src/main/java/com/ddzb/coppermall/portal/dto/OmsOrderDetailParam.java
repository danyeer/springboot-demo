package com.ddzb.coppermall.portal.dto;

import com.ddzb.coppermall.portal.validator.ObjectNotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class OmsOrderDetailParam {

    @ApiModelProperty(value = "主ID" ,required = true)
    @ObjectNotNull(message = "主ID不能为空")
    private Long id;

    @ApiModelProperty(value = "类型 1->竞价 2->现货 3->招标",required = true)
    @ObjectNotNull(message = "类型不能为空")
    private Integer type;

    @ApiModelProperty(value = "身份类型 1->供货 2->采购" ,required = true)
    @ObjectNotNull(message = "身份类型不能为空")
    private Integer type2;

}
