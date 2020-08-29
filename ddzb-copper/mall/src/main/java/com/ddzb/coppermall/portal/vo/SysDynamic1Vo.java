package com.ddzb.coppermall.portal.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * 媒体
 */
@Data
public class SysDynamic1Vo {

    private Long id;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "封面图片")
    private String images;

    @ApiModelProperty(value = "摘要")
    private String abstracts;
}
