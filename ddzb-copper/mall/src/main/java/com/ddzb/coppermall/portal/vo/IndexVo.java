package com.ddzb.coppermall.portal.vo;

import com.ddzb.coppermall.common.api.CommonPage;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class IndexVo {
    @ApiModelProperty(value = "交易动态")
    List<PmsProductBatchIndexVo> priceList;

    @ApiModelProperty(value = "行业视点")
    List<SysDynamic1Vo> list1;
    @ApiModelProperty(value = "平台公告")
    List<SysDynamic2Vo> list2;
}
