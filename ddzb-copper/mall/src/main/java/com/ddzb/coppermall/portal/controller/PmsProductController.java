package com.ddzb.coppermall.portal.controller;

import com.ddzb.coppermall.common.api.CommonPage;
import com.ddzb.coppermall.common.api.CommonResult;
import com.ddzb.coppermall.model.PmsBrand;
import com.ddzb.coppermall.portal.dto.*;
import com.ddzb.coppermall.portal.service.PmsProductService;
import com.ddzb.coppermall.portal.service.SysDynamicInfoService;
import com.ddzb.coppermall.portal.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@Api(tags = "04商品", description = "竞价、现货、招标")
public class PmsProductController {

    @Autowired
    PmsProductService pmsProductService;

    @Autowired
    SysDynamicInfoService sysDynamicInfoService;

    @ApiOperation("00-获取一级分类")
    @RequestMapping(value = "/getCategoryList", method = RequestMethod.GET)
    public CommonResult getCategoryList() {
        return pmsProductService.getCategoryList();
    }

    @ApiOperation("01-根据一级分类获取二级分类")
    @RequestMapping(value = "/getCategoryTwoList", method = RequestMethod.GET)
    public CommonResult getCategoryTwoList(@RequestParam Long parentId) {
        return pmsProductService.getCategoryTwoList(parentId);
    }

    @ApiOperation("02-获取品牌")
    @RequestMapping(value = "/getBrandList", method = RequestMethod.GET)
    public CommonResult getBrandList() {
        List<PmsBrand> list = pmsProductService.getBrandList();
        return CommonResult.success(list);
    }

    @ApiOperation("03-获取交收地")
    @RequestMapping(value = "/getDeliveryList", method = RequestMethod.GET)
    public CommonResult getDeliveryList(@RequestParam Integer type) {
        List<PmsProductDeliveryVo> list = pmsProductService.getDeliveryList(type);
        return CommonResult.success(list);
    }


    @ApiOperation("04-竞拍/招标-列表(首页)")
    @RequestMapping(value = "/getAuctionIndexList", method = RequestMethod.POST)
    public CommonResult<CommonPage<PmsProductAuctionVo>> getAuctionIndexList(@RequestBody @Validated PmsProductIndexParam param) {

        return pmsProductService.getAuctionIndexList(param);

    }

    @ApiOperation("05-竞拍/招标-列表")
    @RequestMapping(value = "/getAuctionList", method = RequestMethod.POST)
    public CommonResult<CommonPage<PmsProductAuctionVo>> getAuctionList(@RequestBody @Validated PmsProductAuctionParam param) {

        return pmsProductService.getAuctionList(param);

    }

    @ApiOperation("06-竞拍/招标-详情")
    @RequestMapping(value = "/getAuctionDetailById", method = RequestMethod.POST)
    public CommonResult<PmsProductAuctionDetailVo> getAuctionDetailById(@RequestParam Long id) {
        PmsProductAuctionDetailVo detailVo = pmsProductService.getAuctionDetailById(id);
        return CommonResult.success(detailVo);

    }


    @ApiOperation("07-竞拍/招标-出价最新列表")
    @RequestMapping(value = "/getAuctionPriceList", method = RequestMethod.POST)
    public CommonResult<CommonPage<PmsProductAuctionBatchVo>> getAuctionPriceList(@RequestBody @Validated PmsProductAuctionBatchParam param) {

        List<PmsProductAuctionBatchVo> list = pmsProductService.getAuctionPriceList(param);
        return CommonResult.success(CommonPage.restPage(list));

    }

    @ApiOperation("08-竞拍/招标-出价列表(当前用户)")
    @RequestMapping(value = "/getAuctionPriceByUserIdList", method = RequestMethod.POST)
    public CommonResult<CommonPage<PmsProductAuctionBatchVo>> getAuctionPriceByUserIdList(@RequestBody @Validated PmsProductAuctionBatchParam param) {

        List<PmsProductAuctionBatchVo> list = pmsProductService.getAuctionPriceByUserIdList(param);
        return CommonResult.success(CommonPage.restPage(list));

    }

    @ApiOperation("09-现货商城-列表(首页)")
    @RequestMapping(value = "/getMarketIndexList", method = RequestMethod.POST)
    public CommonResult<CommonPage<PmsProductMarketVo>> getMarketIndexList(@RequestBody @Validated PmsProductMarketIndexParam param) {
        List<PmsProductMarketVo> list = pmsProductService.getMarketIndexList(param);
        return CommonResult.success(CommonPage.restPage(list));

    }

    @ApiOperation("10-现货商城-列表")
    @RequestMapping(value = "/getMarketList", method = RequestMethod.POST)
    public CommonResult<CommonPage<PmsProductMarketVo>> getMarketList(@RequestBody @Validated PmsProductMarketParam param) {
        List<PmsProductMarketVo> list = pmsProductService.getMarketList(param);
        return CommonResult.success(CommonPage.restPage(list));

    }

//    @ApiOperation("11-交易动态(首页)")
//    @RequestMapping(value = "/getPriceIndexList", method = RequestMethod.POST)
//    public CommonResult<CommonPage<PmsProductBatchIndexVo>> getPriceIndexList(@RequestBody @Validated PageParam param) {
//        List<PmsProductBatchIndexVo> list = pmsProductService.PmsProductBatchIndexVo(param);
//        return CommonResult.success(CommonPage.restPage(list));
//
//    }

    @ApiOperation("12-交易动态(首页-含行业视点、平台公告)")
    @RequestMapping(value = "/getIndexList", method = RequestMethod.POST)
    public CommonResult<IndexVo> getIndexList(@RequestBody @Validated PageParam param) {
        IndexVo indexVo = new IndexVo();
        List<PmsProductBatchIndexVo> list = pmsProductService.PmsProductBatchIndexVo(param);
        indexVo.setPriceList(list);

        param.setPageSize(3);
        //        媒体
        List<SysDynamic1Vo> list1 = sysDynamicInfoService.getDynamic1List(param);
        indexVo.setList1(list1);
        param.setPageSize(5);
        //公告
        List<SysDynamic2Vo> list2 = sysDynamicInfoService.getDynamic2List(param);
        indexVo.setList2(list2);
        return CommonResult.success(indexVo);

    }


    @ApiOperation("13-竞拍/现货/招标-出价报价")
    @RequestMapping(value = "/setPrice", method = RequestMethod.POST)
    public CommonResult setPrice(@RequestBody @Validated PmsProductBatchInsertParam param) {

        return pmsProductService.setPrice(param);

    }

    @ApiOperation("14-现货商城-详情")
    @RequestMapping(value = "/getMarketDetailById", method = RequestMethod.POST)
    public CommonResult<PmsProductMarketDetailVo> getMarketDetailById(@RequestParam Long id) {
        PmsProductMarketDetailVo detailVo = pmsProductService.getMarketDetailById(id);
        return CommonResult.success(detailVo);

    }


    @ApiOperation("15-我的竞拍/招标-列表")
    @RequestMapping(value = "/getMyAuctionList", method = RequestMethod.POST)
    public CommonResult<CommonPage<PmsProductMyAuctionVo>> getMyAuctionList(@RequestBody @Validated PmsProductMyAuctionParam param) {
        List<PmsProductMyAuctionVo> list = pmsProductService.getMyAuctionList(param);
        return CommonResult.success(CommonPage.restPage(list));

    }

    @ApiOperation("16-我的现货-列表")
    @RequestMapping(value = "/getMyMarketList", method = RequestMethod.POST)
    public CommonResult<CommonPage<PmsProductMyMarketVo>> getMyMarketList(@RequestBody @Validated PmsProductMyMarketParam param) {
        List<PmsProductMyMarketVo> list = pmsProductService.getMyMarketList(param);
        return CommonResult.success(CommonPage.restPage(list));

    }


    @ApiOperation("17-上下线")
    @RequestMapping(value = "/setPublishStatus", method = RequestMethod.POST)
    public CommonResult setPublishStatus(@RequestBody @Validated PmsProductSetPublishStatusParam param) {
        return pmsProductService.setPublishStatus(param);

    }

    @ApiOperation("18-删除（要求：没有报名才可撤单）")
    @RequestMapping(value = "/setDeleteStatus", method = RequestMethod.POST)
    public CommonResult setDeleteStatus(@RequestBody @Validated PmsProductIdParam param) {
        return pmsProductService.setDeleteStatus(param);

    }

    @ApiOperation("19-竞拍/现货/招标-撤销报价")
    @RequestMapping(value = "/setDeletePrice", method = RequestMethod.POST)
    public CommonResult setDeletePrice(@RequestBody @Validated PmsProductIdParam param) {

        return pmsProductService.setDeletePrice(param);

    }


    @ApiOperation("20-竞拍/现货- 发布")
    @RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
    public CommonResult saveProduct(@RequestBody @Validated PmsProductSaveParam param) {
        return pmsProductService.saveProduct(param);

    }

    @ApiOperation("21-竞拍/现货- 修改")
    @RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
    public CommonResult updateProduct(@RequestBody @Validated PmsProductUpdateParam param) {
        return pmsProductService.updateProduct(param);

    }

    @ApiOperation("22-竞拍/现货-详情（修改时调用）")
    @RequestMapping(value = "/getUpdateDetailById", method = RequestMethod.POST)
    public CommonResult<PmsProductUpdateDetailVo> getUpdateDetailById(@RequestParam Long id) {
        PmsProductUpdateDetailVo detailVo = pmsProductService.getUpdateDetailById(id);
        return CommonResult.success(detailVo);

    }

    @ApiOperation("23-出价详情列表(当前商品用户-成交时使用)")
    @RequestMapping(value = "/getPriceByProductIdList", method = RequestMethod.POST)
    public CommonResult<CommonPage<PmsProductBatchVo>> getPriceByProductIdList(@RequestBody @Validated PmsProductBatchParam param) {

        List<PmsProductBatchVo> list = pmsProductService.getPriceByProductIdList(param);
        return CommonResult.success(CommonPage.restPage(list));

    }

    @ApiOperation("24-我的(竞拍/招标)报价列表(当前用户含商品信息)")
    @RequestMapping(value = "/getMyPriceByProductIdList", method = RequestMethod.POST)
    public CommonResult<CommonPage<PmsProductBatchMyVo>> getMyPriceByProductIdList(@RequestBody @Validated PmsProductBatchMyParam param) {

        List<PmsProductBatchMyVo> list = pmsProductService.getMyPriceByProductIdList(param);
        return CommonResult.success(CommonPage.restPage(list));

    }

    @ApiOperation("25-我的(现货)报价列表(当前用户含商品信息)")
    @RequestMapping(value = "/getMymarketPriceByProductIdList", method = RequestMethod.POST)
    public CommonResult<CommonPage<PmsProductBatchMyMarketVo>> getMymarketPriceByProductIdList(@RequestBody @Validated PmsProductBatchMyParam param) {

        List<PmsProductBatchMyMarketVo> list = pmsProductService.getMymarketPriceByProductIdList(param);
        return CommonResult.success(CommonPage.restPage(list));

    }


    @ApiOperation("13-2-现货-修改报价")
    @RequestMapping(value = "/updatePrice", method = RequestMethod.POST)
    public CommonResult updatePrice(@RequestBody @Validated PmsProductBatchUpdateParam param) {

        return pmsProductService.updatePrice(param);

    }


}
