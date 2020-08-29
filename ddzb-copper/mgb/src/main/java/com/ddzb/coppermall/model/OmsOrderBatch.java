package com.ddzb.coppermall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OmsOrderBatch implements Serializable {
    private Long id;

    @ApiModelProperty(value = "订单id")
    private Long orderId;

    @ApiModelProperty(value = "批次号")
    private Integer batchNo;

    @ApiModelProperty(value = "申请金额")
    private BigDecimal applyMoney;

    @ApiModelProperty(value = "申请数量")
    private BigDecimal applyNumbers;

    @ApiModelProperty(value = "申请交收日期")
    private Date applyTime;

    private String applyPname;

    private String appplyCname;

    private String appplyOname;

    @ApiModelProperty(value = "交收地详细地址")
    private String appplyAddress;

    @ApiModelProperty(value = "实际验收数量")
    private BigDecimal realNumbers;

    @ApiModelProperty(value = "扣钱")
    private BigDecimal realBacks;

    @ApiModelProperty(value = "备注")
    private String note;

    @ApiModelProperty(value = "货运单图片")
    private String images;

    @ApiModelProperty(value = "验货单")
    private String images2;

    @ApiModelProperty(value = "线下支付 付款单据")
    private String images3;

    @ApiModelProperty(value = "1申请交收  2同意交收并付款 3已发货  4收货验货，卖家提交申请验收单 5确认验收 -2拒绝交收 -4拒绝验收")
    private Integer stauts;

    @ApiModelProperty(value = "是否最后一批次 0否  1是")
    private Integer isLast;

    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;

    @ApiModelProperty(value = "货款流水号")
    private String paymentMargin;

    @ApiModelProperty(value = "定金")
    private Double depositAmount;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(Integer batchNo) {
        this.batchNo = batchNo;
    }

    public BigDecimal getApplyMoney() {
        return applyMoney;
    }

    public void setApplyMoney(BigDecimal applyMoney) {
        this.applyMoney = applyMoney;
    }

    public BigDecimal getApplyNumbers() {
        return applyNumbers;
    }

    public void setApplyNumbers(BigDecimal applyNumbers) {
        this.applyNumbers = applyNumbers;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getApplyPname() {
        return applyPname;
    }

    public void setApplyPname(String applyPname) {
        this.applyPname = applyPname;
    }

    public String getAppplyCname() {
        return appplyCname;
    }

    public void setAppplyCname(String appplyCname) {
        this.appplyCname = appplyCname;
    }

    public String getAppplyOname() {
        return appplyOname;
    }

    public void setAppplyOname(String appplyOname) {
        this.appplyOname = appplyOname;
    }

    public String getAppplyAddress() {
        return appplyAddress;
    }

    public void setAppplyAddress(String appplyAddress) {
        this.appplyAddress = appplyAddress;
    }

    public BigDecimal getRealNumbers() {
        return realNumbers;
    }

    public void setRealNumbers(BigDecimal realNumbers) {
        this.realNumbers = realNumbers;
    }

    public BigDecimal getRealBacks() {
        return realBacks;
    }

    public void setRealBacks(BigDecimal realBacks) {
        this.realBacks = realBacks;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getImages2() {
        return images2;
    }

    public void setImages2(String images2) {
        this.images2 = images2;
    }

    public String getImages3() {
        return images3;
    }

    public void setImages3(String images3) {
        this.images3 = images3;
    }

    public Integer getStauts() {
        return stauts;
    }

    public void setStauts(Integer stauts) {
        this.stauts = stauts;
    }

    public Integer getIsLast() {
        return isLast;
    }

    public void setIsLast(Integer isLast) {
        this.isLast = isLast;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getPaymentMargin() {
        return paymentMargin;
    }

    public void setPaymentMargin(String paymentMargin) {
        this.paymentMargin = paymentMargin;
    }

    public Double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(Double depositAmount) {
        this.depositAmount = depositAmount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", applyMoney=").append(applyMoney);
        sb.append(", applyNumbers=").append(applyNumbers);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", applyPname=").append(applyPname);
        sb.append(", appplyCname=").append(appplyCname);
        sb.append(", appplyOname=").append(appplyOname);
        sb.append(", appplyAddress=").append(appplyAddress);
        sb.append(", realNumbers=").append(realNumbers);
        sb.append(", realBacks=").append(realBacks);
        sb.append(", note=").append(note);
        sb.append(", images=").append(images);
        sb.append(", images2=").append(images2);
        sb.append(", images3=").append(images3);
        sb.append(", stauts=").append(stauts);
        sb.append(", isLast=").append(isLast);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", paymentMargin=").append(paymentMargin);
        sb.append(", depositAmount=").append(depositAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}