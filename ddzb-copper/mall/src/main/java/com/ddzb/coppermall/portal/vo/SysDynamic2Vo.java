package com.ddzb.coppermall.portal.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 公告
 */
@Data
public class SysDynamic2Vo {

    private Long id;

    @ApiModelProperty(value = "标题")
    private String title;
}
