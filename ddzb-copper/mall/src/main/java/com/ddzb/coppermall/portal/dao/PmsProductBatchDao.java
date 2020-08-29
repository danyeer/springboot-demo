package com.ddzb.coppermall.portal.dao;

import com.ddzb.coppermall.portal.dto.PmsProductBatchMyParam;
import com.ddzb.coppermall.portal.dto.PmsProductBatchParam;
import com.ddzb.coppermall.portal.dto.PmsProductMyAuctionParam;
import com.ddzb.coppermall.portal.vo.*;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface PmsProductBatchDao {
    List<PmsProductAuctionBatchVo> queryAuctionPriceList(Long productId,Long userId,Integer type);
    List<PmsProductBatchIndexVo> queryBatchIndexList();

    BigDecimal queryBatchPriceMax(Long productId, Long userId,Integer type);

    List<PmsProductBatchVo> queryPriceByProductIdList(@Param("param") PmsProductBatchParam param);

    List<PmsProductBatchMyVo> queryMyPriceByProductIdList(@Param("param") PmsProductBatchMyParam param);

    List<PmsProductBatchMyMarketVo> queryMymarketPriceByProductIdList(@Param("param") PmsProductBatchMyParam param);
}
