package com.ddzb.coppermall.portal.service;

import com.ddzb.coppermall.common.api.CommonPage;
import com.ddzb.coppermall.common.api.CommonResult;
import com.ddzb.coppermall.model.PmsBrand;
import com.ddzb.coppermall.portal.dto.*;
import com.ddzb.coppermall.portal.vo.*;

import java.util.List;

/**
 * 商品管理（竞价 招标 现货）
 */
public interface PmsProductService {

    /**
     * 竞价拍卖 列表
     * @param param
     * @return
     */
    CommonResult<CommonPage<PmsProductAuctionVo>> getAuctionList(PmsProductAuctionParam param);

    CommonResult getCategoryList();

    CommonResult getCategoryTwoList(Long parentId);

    List<PmsBrand> getBrandList();

    List<PmsProductDeliveryVo> getDeliveryList(Integer type);
    /**
     * 竞价拍卖 详情
     * @param id
     * @return
     */
    PmsProductAuctionDetailVo getAuctionDetailById(Long id);
    /**
     * 竞价拍卖 出价列表
     * @param param
     * @return
     */
    List<PmsProductAuctionBatchVo> getAuctionPriceList(PmsProductAuctionBatchParam param);

    List<PmsProductAuctionBatchVo> getAuctionPriceByUserIdList(PmsProductAuctionBatchParam param);

    CommonResult<CommonPage<PmsProductAuctionVo>> getAuctionIndexList(PmsProductIndexParam param);

    List<PmsProductMarketVo> getMarketIndexList(PmsProductMarketIndexParam param);

    List<PmsProductMarketVo> getMarketList(PmsProductMarketParam param);

    /**
     * 交易动态（首页）
     * @return
     */
    List<PmsProductBatchIndexVo> PmsProductBatchIndexVo(PageParam param);

    /**
     *
     * @param param
     * @return
     */
    CommonResult setPrice(PmsProductBatchInsertParam param);

    PmsProductMarketDetailVo getMarketDetailById(Long id);

    /**
     * 我的发布 --- 竞价 招标
     * @param param
     * @return
     */
    List<PmsProductMyAuctionVo> getMyAuctionList(PmsProductMyAuctionParam param);

    List<PmsProductMyMarketVo> getMyMarketList(PmsProductMyMarketParam param);

    /**
     * 上线下线
     * @param param
     * @return
     */
    CommonResult setPublishStatus(PmsProductSetPublishStatusParam param);

    CommonResult setDeleteStatus(PmsProductIdParam param);

    /**
     *撤销报价
     * @param param
     * @return
     */
    CommonResult setDeletePrice(PmsProductIdParam param);

    /**
     * 发布
     * @param param
     * @return
     */
    CommonResult saveProduct(PmsProductSaveParam param);

    CommonResult updateProduct(PmsProductUpdateParam param);

    /**
     * 详情 修改时调用
     * @param id
     * @return
     */
    PmsProductUpdateDetailVo getUpdateDetailById(Long id);

    List<PmsProductBatchVo> getPriceByProductIdList(PmsProductBatchParam param);

    List<PmsProductBatchMyVo> getMyPriceByProductIdList(PmsProductBatchMyParam param);

    List<PmsProductBatchMyMarketVo> getMymarketPriceByProductIdList(PmsProductBatchMyParam param);

    /**
     * 修改价格报价
     * @param param
     * @return
     */
    CommonResult updatePrice(PmsProductBatchUpdateParam param);
}
