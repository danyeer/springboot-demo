package com.ddzb.coppermall.portal.dto;

import com.ddzb.coppermall.portal.validator.ObjectNotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UmsMemberPassParam {

    @ApiModelProperty(value = "旧修改密码")
    @ObjectNotNull(message = "旧密码不能为空")
    private String oldPassword;

    @ApiModelProperty(value = "新修改密码")
    @ObjectNotNull(message = "新密码不能为空")
    private String newPassword;
}
