package com.ddzb.coppermall.portal.vo;

import com.ddzb.coppermall.model.SysOperationLog;
import com.ddzb.coppermall.model.UmsMemberDetails;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 会员中心
 */
@Data
public class UmsMemberCenterVo {
    @ApiModelProperty(value = "管理员账户")
    public String username;

    @ApiModelProperty(value = "企业全称")
    private String enterprisename;

    //    订单
    @ApiModelProperty(value = "订单数量列表")
    private OmsOrderCountVo orderCount;

    //    我的发布
    @ApiModelProperty(value = "我的发布数量列表")
    private PmsProductCountVo productCountVo;

    @ApiModelProperty(value = "最新消息列表")
    private List<SysOperationLog> logList;

}
