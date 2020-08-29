package com.ddzb.coppermall.portal.service.impl;

import com.ddzb.coppermall.common.api.CommonResult;
import com.ddzb.coppermall.mapper.OmsOrderMapper;
import com.ddzb.coppermall.mapper.PmsProductBatchMapper;
import com.ddzb.coppermall.mapper.PmsProductMapper;
import com.ddzb.coppermall.mapper.UmsMemberDetailsMapper;
import com.ddzb.coppermall.model.*;
import com.ddzb.coppermall.portal.bo.UserInfoDetails;
import com.ddzb.coppermall.portal.component.SecurityUserHelper;
import com.ddzb.coppermall.portal.dao.OmsOrderDao;
import com.ddzb.coppermall.portal.dto.*;
import com.ddzb.coppermall.portal.service.OmsOrderService;
import com.ddzb.coppermall.portal.util.StringFormatUtils;
import com.ddzb.coppermall.portal.vo.OmsOrderDetailVo;
import com.ddzb.coppermall.portal.vo.OmsOrderMyVo;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class OmsOrderServiceImpl implements OmsOrderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OmsOrderServiceImpl.class);

    @Autowired
    SecurityUserHelper securityUserHelper;

    @Autowired
    OmsOrderMapper omsOrderMapper;

    @Autowired
    PmsProductMapper pmsProductMapper;

    @Autowired
    PmsProductBatchMapper pmsProductBatchMapper;

    @Autowired
    OmsOrderDao omsOrderDao;

    @Autowired
    UmsMemberDetailsMapper umsMemberDetailsMapper;

    @Override
    public CommonResult saveOrder(OmsOrderSaveParam param) {
        String msg = "";
        //获取当前用户信息
//        UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();
//        if (sysUserDetails == null) {
//            msg = "未登录";
//            LOGGER.error("订单插入异常:{}", msg);
//            return CommonResult.failed(msg);
//        }

        //获取认证信息
//        UmsMemberDetailsExample example2 = new UmsMemberDetailsExample();
//        UmsMemberDetailsExample.Criteria criteria2 = example2.createCriteria();
//        criteria2.andUserIdEqualTo(userId);
//        List<UmsMemberDetails> details = umsMemberDetailsMapper.selectByExample(example2);
//        if (CollectionUtils.isEmpty(details)) {
//            msg = "企业未认证";
//            LOGGER.error("插入异常:{}", msg);
//            return CommonResult.failed(msg);
//        }
        //报价信息
        PmsProductBatch pmsProductBatch = pmsProductBatchMapper.selectByPrimaryKey(param.getId());
        if (pmsProductBatch == null) {
            msg = "报价信息错误";
            LOGGER.error("订单插入异常:{}", msg);
            return CommonResult.failed(msg);
        }
        Long userId = pmsProductBatch.getUserId();
        String phone = pmsProductBatch.getUserPhone();
        String userEnterprisename = pmsProductBatch.getUserEnterprisename();
        //判断库存
        Long productId = param.getProductId();
        PmsProduct pmsProduct = pmsProductMapper.selectByPrimaryKey(productId);
        if (pmsProduct == null) {
            msg = "商品信息错误";
            LOGGER.error("订单插入异常:{}", msg);
            return CommonResult.failed(msg);
        }
        if (pmsProduct.getType() == 2) {
            //现货
            if (pmsProduct.getTransactionStatus() != 0) {
                msg = "现货商品状态信息错误";
                LOGGER.error("订单插入异常:{}", msg);
                return CommonResult.failed(msg);
            }
        } else {
            //
            if (pmsProduct.getTransactionStatus() != 1) {
                msg = "商品状态信息错误";
                LOGGER.error("订单插入异常:{}", msg);
                return CommonResult.failed(msg);
            }
            //判断时间范围
//            if(pmsProduct.getAuctionStartTime())
        }

//        乐观版本号
        Integer version = pmsProduct.getVersion() == null ? 0 : pmsProduct.getVersion();
        BigDecimal stock = pmsProduct.getStock();
        BigDecimal nums = param.getNumbers();
        if ((stock.subtract(nums)).compareTo(new BigDecimal(0)) == -1) {
            msg = "商品库存不足";
            LOGGER.error("订单插入异常:{}", msg);
            return CommonResult.failed(msg);
        }

        //更新商品库存及状态
        PmsProduct updateP = new PmsProduct();
        updateP.setVersion(version + 1);
        updateP.setSoldStock(pmsProduct.getSoldStock().add(nums));//售量加
        updateP.setStock(stock.subtract(nums));//库存减
        if (pmsProduct.getType() != 2)
            updateP.setTransactionStatus(2);//生成订单

        PmsProductExample example = new PmsProductExample();
        PmsProductExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(productId);
        criteria.andVersionEqualTo(version);
        int count = pmsProductMapper.updateByExampleSelective(updateP, example);
        if (count > 0) {
            //更新成交价格
            PmsProductBatch batch = new PmsProductBatch();
            batch.setId(param.getId());
            batch.setStatus(1);
            pmsProductBatchMapper.updateByPrimaryKeySelective(batch);

            //订单插入
            OmsOrder order = new OmsOrder();
            BeanUtils.copyProperties(param, order);
            order.setCreateTime(new Date());
            order.setUserId(userId);
            order.setUserPhone(phone);
            order.setUserEnterprisename(userEnterprisename);
            order.setOsn(StringFormatUtils.getSn("o"));
            order.setStatus(1);
            int count2 = omsOrderMapper.insertSelective(order);
            if (count2 > 0)
                return CommonResult.success();
        }

        return CommonResult.failed();
    }

    @Override
    public List<OmsOrderMyVo> getMyOrderList(OmsOrderMyParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        //获取当前用户信息
        UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();
        Long id = sysUserDetails.getSysUserinfo().getId();
        param.setUserId(id);
        return omsOrderDao.queryMyOrderList(param);
    }

    @Override
    public List<OmsOrderMyVo> getMyOrderList2(OmsOrderMyParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        //获取当前用户信息
        UserInfoDetails sysUserDetails = (UserInfoDetails) securityUserHelper.getCurrentPrincipal();
        Long id = sysUserDetails.getSysUserinfo().getId();
        param.setUserId(id);
        return omsOrderDao.queryMyOrderList2(param);
    }

    @Override
    public OmsOrderDetailVo getOrderDetailById(OmsOrderDetailParam param) {
        return omsOrderDao.queryOrderDetailById(param);
    }

    @Override
    public CommonResult signUpById(PmsProductIdParam param) {
        OmsOrder omsOrder = omsOrderMapper.selectByPrimaryKey(param.getId());
        if (omsOrder == null) {
            LOGGER.error("签约异常:{}", "订单信息不存在");
            return CommonResult.failed("订单信息异常");
        }
        if (omsOrder.getStatus() != 1) {
            LOGGER.error("签约异常:{}", "签约状态异常");
            return CommonResult.failed("签约状态异常");
        }

        OmsOrder order = new OmsOrder();
        order.setId(param.getId());
        order.setStatus(2);//已签约
        order.setContractTime(new Date());//签约时间
        int count = omsOrderMapper.updateByPrimaryKeySelective(order);
        if (count > 0)
            return CommonResult.success(count);
        return CommonResult.failed();
    }

    @Override
    public CommonResult payDeposit(OmsOrderPayDepositParam param) {
        //当前只有线下模式 不要验证支付模块
        OmsOrder omsOrder = omsOrderMapper.selectByPrimaryKey(param.getId());
        if (omsOrder == null) {
            LOGGER.error("付定金异常:{}", "订单信息不存在");
            return CommonResult.failed("订单信息异常");
        }
        if (omsOrder.getStatus() != 2) {
            LOGGER.error("付定金异常:{}", "状态异常");
            return CommonResult.failed("状态异常");
        }

        OmsOrder order = new OmsOrder();
        order.setId(param.getId());
        order.setStatus(3);//
        order.setDepositUpdateTime(new Date());//
        order.setDepositDown(param.getDepositDown());
        order.setDepositPayment(param.getDepositPayment());

        if (!StringUtils.isEmpty(param.getDepositImg()))
            order.setDepositImg(param.getDepositImg());

        int count = omsOrderMapper.updateByPrimaryKeySelective(order);
        if (count > 0)
            return CommonResult.success(count);
        return CommonResult.failed();
    }

    @Override
    public CommonResult deliverGoods(OmsOrderDeliverGoodsParam param) {
        OmsOrder omsOrder = omsOrderMapper.selectByPrimaryKey(param.getId());
        if (omsOrder == null) {
            LOGGER.error("发货异常:{}", "订单信息不存在");
            return CommonResult.failed("订单信息异常");
        }
        if (StringUtils.isEmpty(param.getType())) {
            if (omsOrder.getStatus() != 3) {
                LOGGER.error("发货异常:{}", "状态异常");
                return CommonResult.failed("状态异常");
            }
        } else {
            if (omsOrder.getStatus() != 4) {
                LOGGER.error("修改发货异常:{}", "状态异常");
                return CommonResult.failed("状态异常");
            }
        }

        OmsOrder order = new OmsOrder();
        BeanUtils.copyProperties(param, order);
//        order.setId(param.getId());
        order.setStatus(4);//
//        order.setDeliveryDate(param.getDeliveryDate());//
        order.setDeliveryUpdateTime(new Date());

        int count = omsOrderMapper.updateByPrimaryKeySelective(order);
        if (count > 0)
            return CommonResult.success(count);
        return CommonResult.failed();
    }

    @Override
    public CommonResult confirmGoods(OmsOrderConfirmGoodsParam param) {
        OmsOrder omsOrder = omsOrderMapper.selectByPrimaryKey(param.getId());
        if (omsOrder == null) {
            LOGGER.error("收货异常:{}", "订单信息不存在");
            return CommonResult.failed("订单信息异常");
        }
        if (StringUtils.isEmpty(param.getType())) {
            if (omsOrder.getStatus() != 4) {
                LOGGER.error("收货异常:{}", "状态异常");
                return CommonResult.failed("状态异常");
            }
        } else {
            if (omsOrder.getStatus() != 5) {
                LOGGER.error("修改收货异常:{}", "状态异常");
                return CommonResult.failed("状态异常");
            }
        }

        OmsOrder order = new OmsOrder();
        order.setId(param.getId());
        order.setStatus(5);//
        order.setFinalDeposit(param.getFinalDeposit());//
        order.setFinalNumbers(param.getFinalNumbers());
        order.setFinalPrice(param.getFinalPrice());
        order.setFinalUpdateTime(new Date());
        //计算尾款 实际货款-实付定金
        order.setBalanceAmount(order.getFinalDeposit().subtract(omsOrder.getDepositDown()));


        if (!StringUtils.isEmpty(param.getFinalImg()))
            order.setFinalImg(param.getFinalImg());

        if (!StringUtils.isEmpty(param.getFinalNote()))
            order.setFinalNote(param.getFinalNote());

        int count = omsOrderMapper.updateByPrimaryKeySelective(order);
        if (count > 0)
            return CommonResult.success(count);
        return CommonResult.failed();
    }

    @Override
    public CommonResult inspectionGoods(PmsProductIdParam param) {
        OmsOrder omsOrder = omsOrderMapper.selectByPrimaryKey(param.getId());
        if (omsOrder == null) {
            LOGGER.error("验货异常:{}", "订单信息不存在");
            return CommonResult.failed("订单信息异常");
        }
        if (omsOrder.getStatus() != 5) {
            LOGGER.error("验货异常:{}", "状态异常");
            return CommonResult.failed("状态异常");
        }

        OmsOrder order = new OmsOrder();
        order.setId(param.getId());
        order.setStatus(6);//
        order.setFinalConfirmUpdateTime(new Date());


        int count = omsOrderMapper.updateByPrimaryKeySelective(order);
        if (count > 0)
            return CommonResult.success(count);
        return CommonResult.failed();
    }

    @Override
    public CommonResult payBalance(OmsOrderPayBalanceParam param) {
        OmsOrder omsOrder = omsOrderMapper.selectByPrimaryKey(param.getId());
        if (omsOrder == null) {
            LOGGER.error("尾款支付异常:{}", "订单信息不存在");
            return CommonResult.failed("订单信息异常");
        }
        if (omsOrder.getStatus() != 6) {
            LOGGER.error("尾款支付异常:{}", "状态异常");
            return CommonResult.failed("状态异常");
        }

        OmsOrder order = new OmsOrder();
        order.setId(param.getId());
        order.setStatus(7);//
        order.setBalancePayment(param.getBalancePayment());
        order.setBalanceUpdateTime(new Date());

        if (!StringUtils.isEmpty(param.getBalanceImg()))
            order.setBalanceImg(param.getBalanceImg());


        int count = omsOrderMapper.updateByPrimaryKeySelective(order);
        if (count > 0)
            return CommonResult.success(count);
        return CommonResult.failed();
    }
}
