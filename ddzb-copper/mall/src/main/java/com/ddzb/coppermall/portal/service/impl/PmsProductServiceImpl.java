package com.ddzb.coppermall.portal.service.impl;

import com.ddzb.coppermall.common.api.CommonPage;
import com.ddzb.coppermall.common.api.CommonResult;
import com.ddzb.coppermall.mapper.*;
import com.ddzb.coppermall.model.*;
import com.ddzb.coppermall.portal.bo.UserInfoDetails;
import com.ddzb.coppermall.portal.component.SecurityUserHelper;
import com.ddzb.coppermall.portal.dao.PmsProductBatchDao;
import com.ddzb.coppermall.portal.dao.PmsProductDao;
import com.ddzb.coppermall.portal.dto.*;
import com.ddzb.coppermall.portal.service.PmsProductService;
import com.ddzb.coppermall.portal.util.StringFormatUtils;
import com.ddzb.coppermall.portal.vo.*;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 */
@Service
public class PmsProductServiceImpl implements PmsProductService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsProductServiceImpl.class);

    @Autowired
    PmsProductDao pmsProductDao;
    @Autowired
    PmsProductCategoryMapper pmsProductCategoryMapper;
    @Autowired
    PmsBrandMapper pmsBrandMapper;
    @Autowired
    PmsProductBatchMapper pmsProductBatchMapper;

    @Autowired
    PmsProductBatchDao pmsProductBatchDao;

    @Autowired
    PmsProductMapper pmsProductMapper;

    @Autowired
    UmsMemberDetailsMapper umsMemberDetailsMapper;

    @Autowired
    SecurityUserHelper securityUserHelper;

    @Override
    public CommonResult<CommonPage<PmsProductAuctionVo>> getAuctionList(PmsProductAuctionParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<PmsProductAuctionVo> list = pmsProductDao.queryAuctionList(param);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Override
    public CommonResult getCategoryList() {
        PmsProductCategoryExample example = new PmsProductCategoryExample();
        PmsProductCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andLevelEqualTo(1);
        List<PmsProductCategory> list = pmsProductCategoryMapper.selectByExample(example);
        return CommonResult.success(list);
    }

    @Override
    public CommonResult getCategoryTwoList(Long parentId) {
        PmsProductCategoryExample example = new PmsProductCategoryExample();
        PmsProductCategoryExample.Criteria criteria = example.createCriteria();
        criteria.andLevelEqualTo(2);
        criteria.andParentIdEqualTo(parentId);
        List<PmsProductCategory> list = pmsProductCategoryMapper.selectByExample(example);
        return CommonResult.success(list);
    }

    @Override
    public List<PmsBrand> getBrandList() {
        PmsBrandExample example = new PmsBrandExample();
        example.createCriteria().andStatusEqualTo(1);
        return pmsBrandMapper.selectByExample(example);
    }

    @Override
    public List<PmsProductDeliveryVo> getDeliveryList(Integer type) {
        return pmsProductDao.queryDeliveryList(type);
    }

    @Override
    public PmsProductAuctionDetailVo getAuctionDetailById(Long id) {
        return pmsProductDao.queryAuctionDetailById(id);
    }

    @Override
    public List<PmsProductAuctionBatchVo> getAuctionPriceList(PmsProductAuctionBatchParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<PmsProductAuctionBatchVo> list = pmsProductBatchDao.queryAuctionPriceList(param.getProductId(), null, param.getType());
        return list;
    }

    @Override
    public List<PmsProductAuctionBatchVo> getAuctionPriceByUserIdList(PmsProductAuctionBatchParam param) {
        //获取当前用户信息
        UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<PmsProductAuctionBatchVo> list = pmsProductBatchDao.queryAuctionPriceList(param.getProductId(), sysUserDetails.getSysUserinfo().getId(), null);
        return list;
    }

    @Override
    public CommonResult<CommonPage<PmsProductAuctionVo>> getAuctionIndexList(PmsProductIndexParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<PmsProductAuctionVo> list = pmsProductDao.queryAuctionIndexList(param);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @Override
    public List<PmsProductMarketVo> getMarketIndexList(PmsProductMarketIndexParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<PmsProductMarketVo> list = pmsProductDao.getMarketIndexList(param);
        return list;
    }

    @Override
    public List<PmsProductMarketVo> getMarketList(PmsProductMarketParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<PmsProductMarketVo> list = pmsProductDao.getMarketList(param);
        return list;
    }

    @Override
    public List<PmsProductBatchIndexVo> PmsProductBatchIndexVo(PageParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        List<PmsProductBatchIndexVo> list = pmsProductBatchDao.queryBatchIndexList();
        return list;
    }

    @Override
    public CommonResult setPrice(PmsProductBatchInsertParam param) {

        String msg = "";

        PmsProduct pmsProduct = pmsProductMapper.selectByPrimaryKey(param.getProductId());
        if (pmsProduct == null) {
            msg = "报价商品不存在";
            LOGGER.error("报价异常:{}", msg);
            return CommonResult.failed(msg);
        }
        if (pmsProduct.getTransactionStatus() == -1 || pmsProduct.getTransactionStatus() == 2) {
            msg = "报价商品异常";
            LOGGER.error("报价异常:{}", msg);
            return CommonResult.failed(msg);
        }
        //判断库存
        if (pmsProduct.getStock().compareTo(new BigDecimal(0)) != 1) {
            msg = "报价商品库存不足";
            LOGGER.error("报价异常:{}", msg);
            return CommonResult.failed(msg);
        }

        //获取当前用户信息
        UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();
        Long id = sysUserDetails.getSysUserinfo().getId();
        String phone = sysUserDetails.getSysUserinfo().getPhone();
        String nickname = sysUserDetails.getSysUserinfo().getNickname();

        if(id == pmsProduct.getUserId()){
            msg = "不能报价自己的商品";
            LOGGER.error("报价异常:{}", msg);
            return CommonResult.failed(msg);
        }

        //获取认证信息
        UmsMemberDetailsExample example = new UmsMemberDetailsExample();
        UmsMemberDetailsExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(id);
        List<UmsMemberDetails> details = umsMemberDetailsMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(details)) {
            msg = "企业未认证";
            LOGGER.error("报价异常:{}", msg);
            return CommonResult.failed(msg);
        }


        //判断报价是否
        BigDecimal mm = pmsProductBatchDao.queryBatchPriceMax(param.getProductId(), id, param.getType());
        if (mm != null && param.getType() == 1)//拍卖-高 采购-低
            if (param.getMoney().compareTo(mm) == 1) {
                //高 不操作
            } else {
                msg = "拍卖价格低于之前报价，可撤销后重新报价";
                LOGGER.error("报价异常:{}", msg);
                return CommonResult.failed(msg);
            }
        else if (mm != null && param.getType() == 3)//拍卖-高 采购-低
            if (param.getMoney().compareTo(mm) == 1 || param.getMoney().compareTo(mm) == 0) {
                //高
                return CommonResult.failed("采购价格高于之前报价，可撤销后重新报价");
            }

        PmsProductBatch bean = new PmsProductBatch();
        BeanUtils.copyProperties(param, bean);
        bean.setCreateTime(new Date());
        bean.setStatus(0);//初始化
        bean.setUserId(id);
        bean.setUserPhone(phone);
        bean.setUserNickname(nickname);
        bean.setUserEnterprisename(details.get(0).getEnterprisename());
        int count = pmsProductBatchMapper.insertSelective(bean);
        if (count > 0) {
            if (param.getType() != 2) {
                //更新产品状态
                PmsProduct product = new PmsProduct();
                product.setId(param.getProductId());
                product.setTransactionStatus(1);//已报名
                int count2 = pmsProductMapper.updateByPrimaryKeySelective(product);
            }
            return CommonResult.success("操作成功");
        }
        return CommonResult.failed();
    }

    @Override
    public PmsProductMarketDetailVo getMarketDetailById(Long id) {
        return pmsProductDao.queryMarketDetailById(id);
    }

    @Override
    public List<PmsProductMyAuctionVo> getMyAuctionList(PmsProductMyAuctionParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        //获取当前用户信息
        UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();
        Long id = sysUserDetails.getSysUserinfo().getId();
        param.setUserId(id);
        List<PmsProductMyAuctionVo> list = pmsProductDao.queryMyAuctionList(param);
        return list;
    }

    @Override
    public List<PmsProductMyMarketVo> getMyMarketList(PmsProductMyMarketParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        //获取当前用户信息
        UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();
        Long id = sysUserDetails.getSysUserinfo().getId();
        param.setUserId(id);
        List<PmsProductMyMarketVo> list = pmsProductDao.queryMyMarketList(param);
        return list;
    }

    @Override
    public CommonResult setPublishStatus(PmsProductSetPublishStatusParam param) {
        PmsProduct product = new PmsProduct();
        product.setId(param.getId());
        product.setPublishStatus(param.getPublishStatus());
        int count = pmsProductMapper.updateByPrimaryKeySelective(product);
        if (count > 0)
            return CommonResult.success("操作成功");
        else return CommonResult.failed();
    }

    @Override
    public CommonResult setDeleteStatus(PmsProductIdParam param) {
        PmsProduct result = pmsProductMapper.selectByPrimaryKey(param.getId());
        if (result == null)
            return CommonResult.failed("商品不存在");
        if (result.getTransactionStatus() != 0) {
            return CommonResult.failed("商品状态不正确");
        }
        PmsProduct product = new PmsProduct();
        product.setId(param.getId());
        product.setDeleteStatus(0);
        int count = pmsProductMapper.updateByPrimaryKeySelective(product);
        if (count > 0)
            return CommonResult.success("操作成功");
        else return CommonResult.failed();
    }

    @Override
    public CommonResult setDeletePrice(PmsProductIdParam param) {
        PmsProductBatch pmsProductBatch = pmsProductBatchMapper.selectByPrimaryKey(param.getId());
        if (pmsProductBatch != null)
            if (pmsProductBatch.getStatus() != 0) {
                return CommonResult.failed();
            } else {
                //删除
                int count = pmsProductBatchMapper.deleteByPrimaryKey(param.getId());
                if (count > 0) {
                    //查询是否最后一条
                    PmsProductBatchExample example = new PmsProductBatchExample();
                    PmsProductBatchExample.Criteria criteria = example.createCriteria();
                    criteria.andProductIdEqualTo(pmsProductBatch.getProductId());
                    List<PmsProductBatch> pmsProductBatchList = pmsProductBatchMapper.selectByExample(example);
                    if (CollectionUtils.isEmpty(pmsProductBatchList)) {
                        //修改product状态
//                        PmsProduct pmsProduct = pmsProductMapper.selectByPrimaryKey(pmsProductBatch.getProductId());
                        PmsProduct pmsProduct = new PmsProduct();
                        pmsProduct.setId(pmsProductBatch.getProductId());
                        pmsProduct.setTransactionStatus(0);//状态写回
                        int count2 = pmsProductMapper.updateByPrimaryKeySelective(pmsProduct);
                        if (count2 > 0)
                            return CommonResult.success();

                    } else
                        return CommonResult.success();

                }
            }
        return CommonResult.failed();
    }

    @Override
    public CommonResult saveProduct(PmsProductSaveParam param) {
        String msg = "";
        //获取当前用户信息
        UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();
        if (sysUserDetails == null) {
            msg = "未登录";
            LOGGER.error("插入异常:{}", msg);
            return CommonResult.failed(msg);
        }
        Long id = sysUserDetails.getSysUserinfo().getId();
        String username = sysUserDetails.getSysUserinfo().getUsername();
        String userPhone = sysUserDetails.getSysUserinfo().getPhone();

        //获取认证信息
        UmsMemberDetailsExample example = new UmsMemberDetailsExample();
        UmsMemberDetailsExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(id);
        List<UmsMemberDetails> details = umsMemberDetailsMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(details)) {
            msg = "企业未认证";
            LOGGER.error("插入异常:{}", msg);
            return CommonResult.failed(msg);
        }
        PmsProduct product = new PmsProduct();
        BeanUtils.copyProperties(param, product);
        product.setCreateTime(new Date());
        product.setUserId(id);
        product.setUserPhone(userPhone);
        product.setUserName(username);
        product.setUserEnterprisename(details.get(0).getEnterprisename());
        product.setProductSn(StringFormatUtils.generateTime());//编号
        product.setDeleteStatus(1);
        product.setVerifyStatus(1);
        product.setTransactionStatus(0);//初始化状态
        product.setSoldStock(new BigDecimal(0));
        product.setVersion(0);
        int count = pmsProductMapper.insertSelective(product);
        if (count > 0)
            return CommonResult.success();
        return CommonResult.failed();

    }

    @Override
    public CommonResult updateProduct(PmsProductUpdateParam param) {
        PmsProduct product = pmsProductMapper.selectByPrimaryKey(param.getId());
        if (product == null) {
            LOGGER.error("商品修改异常:{}", "商品不存在");
            return CommonResult.failed("商品不存在");
        }
//        if (product.getType() != param.getType()) {
//            LOGGER.error("商品修改异常:{}", "商品类型不匹配");
//            return CommonResult.failed("商品类型不匹配");
//        }
        PmsProduct productUpdate = new PmsProduct();
        BeanUtils.copyProperties(param, productUpdate);
        int count = pmsProductMapper.updateByPrimaryKeySelective(productUpdate);
        if (count > 0)
            return CommonResult.success();
        return CommonResult.failed();
    }

    @Override
    public PmsProductUpdateDetailVo getUpdateDetailById(Long id) {
        return pmsProductDao.queryUpdateDetailById(id);
    }

    @Override
    public List<PmsProductBatchVo> getPriceByProductIdList(PmsProductBatchParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        return pmsProductBatchDao.queryPriceByProductIdList(param);
    }

    @Override
    public List<PmsProductBatchMyVo> getMyPriceByProductIdList(PmsProductBatchMyParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        //获取当前用户信息
        UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();
        Long id = sysUserDetails.getSysUserinfo().getId();
        param.setUserId(id);
        return pmsProductBatchDao.queryMyPriceByProductIdList(param);
    }

    @Override
    public List<PmsProductBatchMyMarketVo> getMymarketPriceByProductIdList(PmsProductBatchMyParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        //获取当前用户信息
        UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();
        Long id = sysUserDetails.getSysUserinfo().getId();
        param.setUserId(id);
        return pmsProductBatchDao.queryMymarketPriceByProductIdList(param);
    }

    @Override
    public CommonResult updatePrice(PmsProductBatchUpdateParam param) {
        String msg = "";

        PmsProductBatch pmsProductBatch = pmsProductBatchMapper.selectByPrimaryKey(param.getId());
        if (pmsProductBatch == null) {
            msg = "信息不存在";
            LOGGER.error("报价异常:{}", msg);
            return CommonResult.failed(msg);
        }
        if (pmsProductBatch.getStatus() != 0) {
            msg = "报价信息异常";
            LOGGER.error("报价异常:{}", msg);
            return CommonResult.failed(msg);
        }

        PmsProduct pmsProduct = pmsProductMapper.selectByPrimaryKey(pmsProductBatch.getProductId());
        if (pmsProduct == null) {
            msg = "报价商品不存在";
            LOGGER.error("报价异常:{}", msg);
            return CommonResult.failed(msg);
        }
        if (pmsProduct.getTransactionStatus() == -1 || pmsProduct.getTransactionStatus() == 2) {
            msg = "报价商品异常";
            LOGGER.error("报价异常:{}", msg);
            return CommonResult.failed(msg);
        }
        //判断库存
        if (pmsProduct.getStock().compareTo(new BigDecimal(0)) != 1) {
            msg = "报价商品库存不足";
            LOGGER.error("报价异常:{}", msg);
            return CommonResult.failed(msg);
        }

        PmsProductBatch bean = new PmsProductBatch();
        BeanUtils.copyProperties(param, bean);
        bean.setCreateTime(new Date());
        int count = pmsProductBatchMapper.updateByPrimaryKeySelective(bean);
        if (count > 0) {
            return CommonResult.success("操作成功");
        }
        return CommonResult.failed();
    }

}
