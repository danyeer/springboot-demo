package com.ddzb.coppermall.portal.dto;

import com.ddzb.coppermall.portal.validator.ObjectNotNull;
import com.ddzb.coppermall.portal.validator.validatorGroups.DeleteDictionaryDelete;
import com.ddzb.coppermall.portal.validator.validatorGroups.InsertDictionaryCreate;
import com.ddzb.coppermall.portal.validator.validatorGroups.SelectDictionaryUpdateDetail;
import com.ddzb.coppermall.portal.validator.validatorGroups.UpdateDictionaryUpdate;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;

@Data
public class SysDictionaryParam {

    @ApiModelProperty(value = "主键id")
    @PositiveOrZero(groups = {UpdateDictionaryUpdate.class, DeleteDictionaryDelete.class, SelectDictionaryUpdateDetail.class}, message = "消息类型选择错误")
    @ObjectNotNull(groups = {UpdateDictionaryUpdate.class, DeleteDictionaryDelete.class, SelectDictionaryUpdateDetail.class}, message = "消息类型选择错误")
    private Long id;

    @ApiModelProperty(value = "编码")
    @NotEmpty(groups = {InsertDictionaryCreate.class, UpdateDictionaryUpdate.class}, message = "编码不能为空")
    private String code;

    @ApiModelProperty(value = "类型名称")
    @NotEmpty(groups = {InsertDictionaryCreate.class, UpdateDictionaryUpdate.class}, message = "类型名称不能为空")
    private String name;

    @ApiModelProperty(value = "图标")
    private String icon;

    @ApiModelProperty(value = "备注")
    private String note;
    @ApiModelProperty(value = "父节点 如：01")
    private String parentCode;
    @ApiModelProperty(value = "排序")
    private Integer sort;

    private Integer pageNum;
    private Integer pageSize;
}
