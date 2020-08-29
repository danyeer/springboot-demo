package com.ddzb.coppermall.portal.service;

import com.ddzb.coppermall.common.api.CommonResult;
import com.ddzb.coppermall.portal.dto.*;
import com.ddzb.coppermall.portal.vo.OmsOrderDetailVo;
import com.ddzb.coppermall.portal.vo.OmsOrderMyVo;

import java.util.List;

public interface OmsOrderService {
    CommonResult saveOrder(OmsOrderSaveParam param);

    /**
     * 我的供货订单
     * @param param
     * @return
     */
    List<OmsOrderMyVo> getMyOrderList(OmsOrderMyParam param);
    /**
     * 我的采购订单
     * @param param
     * @return
     */
    List<OmsOrderMyVo> getMyOrderList2(OmsOrderMyParam param);

    OmsOrderDetailVo getOrderDetailById(OmsOrderDetailParam param);

    /**
     * 签约
     * @param param
     * @return
     */
    CommonResult signUpById(PmsProductIdParam param);

    /**
     * 付定金
     * @param param
     * @return
     */
    CommonResult payDeposit(OmsOrderPayDepositParam param);

    /**
     * 发货
     * @param param
     * @return
     */
    CommonResult deliverGoods(OmsOrderDeliverGoodsParam param);

    /**
     * 确认收货
     * @param param
     * @return
     */
    CommonResult confirmGoods(OmsOrderConfirmGoodsParam param);

    /**
     * 验货确认
     * @param param
     * @return
     */
    CommonResult inspectionGoods(PmsProductIdParam param);

    /**
     * 支付尾款
     * @param param
     * @return
     */
    CommonResult payBalance(OmsOrderPayBalanceParam param);
}
