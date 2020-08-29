package com.ddzb.coppermall.portal.controller;

import com.ddzb.coppermall.common.api.CommonPage;
import com.ddzb.coppermall.common.api.CommonResult;
import com.ddzb.coppermall.portal.dto.*;
import com.ddzb.coppermall.portal.service.OmsOrderService;
import com.ddzb.coppermall.portal.vo.OmsOrderDetailVo;
import com.ddzb.coppermall.portal.vo.OmsOrderMyVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 订单
 */
@RestController
@RequestMapping("/order")
@Api(tags = "05订单", description = "交易订单")
public class OmsOrderController {
    @Autowired
    OmsOrderService omsOrderService;

    @ApiOperation("01-价格-成交(生成订单)")
    @RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
    public CommonResult saveOrder(@RequestBody @Validated OmsOrderSaveParam param) {
        return omsOrderService.saveOrder(param);

    }


    @ApiOperation("02-我的供货订单")
    @RequestMapping(value = "/getMyOrderList1", method = RequestMethod.POST)
    public CommonResult<CommonPage<OmsOrderMyVo>> getMyOrderList1(@RequestBody @Validated OmsOrderMyParam param) {

        List<OmsOrderMyVo> list = omsOrderService.getMyOrderList(param);
        return CommonResult.success(CommonPage.restPage(list));

    }

    @ApiOperation("03-我的采购订单")
    @RequestMapping(value = "/getMyOrderList2", method = RequestMethod.POST)
    public CommonResult<CommonPage<OmsOrderMyVo>> getMyOrderList2(@RequestBody @Validated OmsOrderMyParam param) {

        List<OmsOrderMyVo> list = omsOrderService.getMyOrderList2(param);
        return CommonResult.success(CommonPage.restPage(list));

    }

    @ApiOperation("04-订单详情")
    @RequestMapping(value = "/getOrderDetailById", method = RequestMethod.POST)
    public CommonResult<OmsOrderDetailVo> getOrderDetailById(@RequestBody @Validated OmsOrderDetailParam param) {

        OmsOrderDetailVo detail = omsOrderService.getOrderDetailById(param);
        return CommonResult.success(detail);

    }

    @ApiOperation("05-订单签约")
    @RequestMapping(value = "/signUpById", method = RequestMethod.POST)
    public CommonResult signUpById(@RequestBody @Validated PmsProductIdParam param) {
        return omsOrderService.signUpById(param);

    }

    @ApiOperation("06-付定金")
    @RequestMapping(value = "/payDeposit", method = RequestMethod.POST)
    public CommonResult payDeposit(@RequestBody @Validated OmsOrderPayDepositParam param) {
        return omsOrderService.payDeposit(param);

    }

    @ApiOperation("07-发货")
    @RequestMapping(value = "/deliverGoods", method = RequestMethod.POST)
    public CommonResult deliverGoods(@RequestBody @Validated OmsOrderDeliverGoodsParam param) {
        return omsOrderService.deliverGoods(param);

    }

    @ApiOperation("08-确认收货")
    @RequestMapping(value = "/confirmGoods", method = RequestMethod.POST)
    public CommonResult confirmGoods(@RequestBody @Validated OmsOrderConfirmGoodsParam param) {
        return omsOrderService.confirmGoods(param);

    }

    @ApiOperation("09-验货")
    @RequestMapping(value = "/inspectionGoods", method = RequestMethod.POST)
    public CommonResult inspectionGoods(@RequestBody @Validated PmsProductIdParam param) {
        return omsOrderService.inspectionGoods(param);

    }

    @ApiOperation("10-付尾款")
    @RequestMapping(value = "/payBalance", method = RequestMethod.POST)
    public CommonResult payBalance(@RequestBody @Validated OmsOrderPayBalanceParam param) {
        return omsOrderService.payBalance(param);

    }

}
