package com.ddzb.coppermall.portal.dao;

import com.ddzb.coppermall.common.api.CommonResult;
import com.ddzb.coppermall.portal.dto.*;
import com.ddzb.coppermall.portal.vo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsProductDao {

    List<PmsProductAuctionVo> queryAuctionList(@Param("param") PmsProductAuctionParam param);

    List<PmsProductDeliveryVo> queryDeliveryList(Integer type);

    PmsProductAuctionDetailVo queryAuctionDetailById(Long id);

    List<PmsProductAuctionVo> queryAuctionIndexList(@Param("param") PmsProductIndexParam param);

    List<PmsProductMarketVo> getMarketIndexList(@Param("param") PmsProductMarketIndexParam param);

    List<PmsProductMarketVo> getMarketList(@Param("param") PmsProductMarketParam param);

    PmsProductMarketDetailVo queryMarketDetailById(Long id);

    PmsProductCountVo queryProductCount(Long userId);

    PmsProductCountVo queryProductCount2(Long id);

    /**
     * 我的发布 -竞价 找标
     * @param param
     * @return
     */
    List<PmsProductMyAuctionVo> queryMyAuctionList(@Param("param") PmsProductMyAuctionParam param);

    List<PmsProductMyMarketVo> queryMyMarketList(@Param("param") PmsProductMyMarketParam param);

    PmsProductUpdateDetailVo queryUpdateDetailById(Long id);
}
