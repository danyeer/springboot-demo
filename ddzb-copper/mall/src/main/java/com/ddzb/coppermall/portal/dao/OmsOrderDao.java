package com.ddzb.coppermall.portal.dao;

import com.ddzb.coppermall.portal.dto.OmsOrderDetailParam;
import com.ddzb.coppermall.portal.dto.OmsOrderMyParam;
import com.ddzb.coppermall.portal.vo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmsOrderDao {
    List<OmsOrderIndexVo> queryOrderIndexList();

    OmsOrderCountVo queryOrderCount(Long id);
    OmsOrderCountVo queryOrderCount2(Long id);

    List<OmsOrderMyVo> queryMyOrderList(@Param("param") OmsOrderMyParam param);

    List<OmsOrderMyVo> queryMyOrderList2(@Param("param") OmsOrderMyParam param);

    OmsOrderDetailVo queryOrderDetailById(@Param("param") OmsOrderDetailParam param);
}
