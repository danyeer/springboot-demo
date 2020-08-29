package com.ddzb.coppermall.portal.vo;

import com.ddzb.coppermall.model.UmsMemberDetails;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UmsMemberDetailsVo extends UmsMemberDetails {
    @ApiModelProperty(value = "管理员姓名/昵称")
    public String nickname;

    @ApiModelProperty(value = "管理员phone")
    public String userPhone;

    @ApiModelProperty(value = "管理员身份证")
    public String userCardno;


}
