package com.ddzb.coppermall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OmsOrder implements Serializable {
    private Long id;

    @ApiModelProperty(value = "产品id")
    private Long productId;

    @ApiModelProperty(value = "对方用户id")
    private Long userId;

    @ApiModelProperty(value = "对方联系电话")
    private String userPhone;

    @ApiModelProperty(value = "对方企业名称")
    private String userEnterprisename;

    @ApiModelProperty(value = "订单编号")
    private String osn;

    @ApiModelProperty(value = "订单数量 吨")
    private BigDecimal numbers;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "订单状态 1签约中 待A签约 2 待B付款 3买家已付款 待卖家发货 4卖家已发货 待买家收货 5 买家已收货并上传验收结果 待卖家确认验收结果  6 待买家付尾款  7 已完成  8 申诉 -1买家拒绝签约 -2卖家拒绝签约 -3验收不通过 0删除订单")
    private Integer status;

    @ApiModelProperty(value = "是否申诉 0否 1是")
    private Integer isbad;

    @ApiModelProperty(value = "合同编号")
    private String contractSn;

    @ApiModelProperty(value = "合同路径")
    private String contractFile;

    @ApiModelProperty(value = "合同链接地址")
    private String contractUrl;

    @ApiModelProperty(value = "签约时间")
    private Date contractTime;

    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;

    @ApiModelProperty(value = "是否收到发票 0否 1收到")
    private Integer isbill;

    @ApiModelProperty(value = "备注--操作")
    private String note;

    @ApiModelProperty(value = "订单类型 1->竞价 2->现货 3->招标")
    private Integer type;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "实付定金金额")
    private BigDecimal depositDown;

    @ApiModelProperty(value = "定金凭证")
    private String depositImg;

    @ApiModelProperty(value = "定金支付方式 1->在线担保支付；2->在线支付；3->线下结算")
    private Integer depositPayment;

    @ApiModelProperty(value = "实付定金操作时间")
    private Date depositUpdateTime;

    @ApiModelProperty(value = "发货日期")
    private Date deliveryDate;

    @ApiModelProperty(value = "发货凭证")
    private String deliveryImg;

    @ApiModelProperty(value = "发货操作时间")
    private Date deliveryUpdateTime;

    @ApiModelProperty(value = "发票链接")
    private String invoiceImg;

    @ApiModelProperty(value = "最终单价")
    private BigDecimal finalPrice;

    @ApiModelProperty(value = "最终数量")
    private BigDecimal finalNumbers;

    @ApiModelProperty(value = "实际货款")
    private BigDecimal finalDeposit;

    @ApiModelProperty(value = "验货凭证")
    private String finalImg;

    @ApiModelProperty(value = "验货描述")
    private String finalNote;

    @ApiModelProperty(value = "最终确认收货操作时间")
    private Date finalUpdateTime;

    @ApiModelProperty(value = "最终确认验收操作时间")
    private Date finalConfirmUpdateTime;

    @ApiModelProperty(value = "尾款金额")
    private BigDecimal balanceAmount;

    @ApiModelProperty(value = "尾款凭证")
    private String balanceImg;

    @ApiModelProperty(value = "尾款支付操作时间")
    private Date balanceUpdateTime;

    @ApiModelProperty(value = "尾款支付方式 1->在线支付；2->线下结算")
    private Integer balancePayment;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEnterprisename() {
        return userEnterprisename;
    }

    public void setUserEnterprisename(String userEnterprisename) {
        this.userEnterprisename = userEnterprisename;
    }

    public String getOsn() {
        return osn;
    }

    public void setOsn(String osn) {
        this.osn = osn;
    }

    public BigDecimal getNumbers() {
        return numbers;
    }

    public void setNumbers(BigDecimal numbers) {
        this.numbers = numbers;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsbad() {
        return isbad;
    }

    public void setIsbad(Integer isbad) {
        this.isbad = isbad;
    }

    public String getContractSn() {
        return contractSn;
    }

    public void setContractSn(String contractSn) {
        this.contractSn = contractSn;
    }

    public String getContractFile() {
        return contractFile;
    }

    public void setContractFile(String contractFile) {
        this.contractFile = contractFile;
    }

    public String getContractUrl() {
        return contractUrl;
    }

    public void setContractUrl(String contractUrl) {
        this.contractUrl = contractUrl;
    }

    public Date getContractTime() {
        return contractTime;
    }

    public void setContractTime(Date contractTime) {
        this.contractTime = contractTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getIsbill() {
        return isbill;
    }

    public void setIsbill(Integer isbill) {
        this.isbill = isbill;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDepositDown() {
        return depositDown;
    }

    public void setDepositDown(BigDecimal depositDown) {
        this.depositDown = depositDown;
    }

    public String getDepositImg() {
        return depositImg;
    }

    public void setDepositImg(String depositImg) {
        this.depositImg = depositImg;
    }

    public Integer getDepositPayment() {
        return depositPayment;
    }

    public void setDepositPayment(Integer depositPayment) {
        this.depositPayment = depositPayment;
    }

    public Date getDepositUpdateTime() {
        return depositUpdateTime;
    }

    public void setDepositUpdateTime(Date depositUpdateTime) {
        this.depositUpdateTime = depositUpdateTime;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryImg() {
        return deliveryImg;
    }

    public void setDeliveryImg(String deliveryImg) {
        this.deliveryImg = deliveryImg;
    }

    public Date getDeliveryUpdateTime() {
        return deliveryUpdateTime;
    }

    public void setDeliveryUpdateTime(Date deliveryUpdateTime) {
        this.deliveryUpdateTime = deliveryUpdateTime;
    }

    public String getInvoiceImg() {
        return invoiceImg;
    }

    public void setInvoiceImg(String invoiceImg) {
        this.invoiceImg = invoiceImg;
    }

    public BigDecimal getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(BigDecimal finalPrice) {
        this.finalPrice = finalPrice;
    }

    public BigDecimal getFinalNumbers() {
        return finalNumbers;
    }

    public void setFinalNumbers(BigDecimal finalNumbers) {
        this.finalNumbers = finalNumbers;
    }

    public BigDecimal getFinalDeposit() {
        return finalDeposit;
    }

    public void setFinalDeposit(BigDecimal finalDeposit) {
        this.finalDeposit = finalDeposit;
    }

    public String getFinalImg() {
        return finalImg;
    }

    public void setFinalImg(String finalImg) {
        this.finalImg = finalImg;
    }

    public String getFinalNote() {
        return finalNote;
    }

    public void setFinalNote(String finalNote) {
        this.finalNote = finalNote;
    }

    public Date getFinalUpdateTime() {
        return finalUpdateTime;
    }

    public void setFinalUpdateTime(Date finalUpdateTime) {
        this.finalUpdateTime = finalUpdateTime;
    }

    public Date getFinalConfirmUpdateTime() {
        return finalConfirmUpdateTime;
    }

    public void setFinalConfirmUpdateTime(Date finalConfirmUpdateTime) {
        this.finalConfirmUpdateTime = finalConfirmUpdateTime;
    }

    public BigDecimal getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(BigDecimal balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public String getBalanceImg() {
        return balanceImg;
    }

    public void setBalanceImg(String balanceImg) {
        this.balanceImg = balanceImg;
    }

    public Date getBalanceUpdateTime() {
        return balanceUpdateTime;
    }

    public void setBalanceUpdateTime(Date balanceUpdateTime) {
        this.balanceUpdateTime = balanceUpdateTime;
    }

    public Integer getBalancePayment() {
        return balancePayment;
    }

    public void setBalancePayment(Integer balancePayment) {
        this.balancePayment = balancePayment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", userId=").append(userId);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userEnterprisename=").append(userEnterprisename);
        sb.append(", osn=").append(osn);
        sb.append(", numbers=").append(numbers);
        sb.append(", createTime=").append(createTime);
        sb.append(", status=").append(status);
        sb.append(", isbad=").append(isbad);
        sb.append(", contractSn=").append(contractSn);
        sb.append(", contractFile=").append(contractFile);
        sb.append(", contractUrl=").append(contractUrl);
        sb.append(", contractTime=").append(contractTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", isbill=").append(isbill);
        sb.append(", note=").append(note);
        sb.append(", type=").append(type);
        sb.append(", price=").append(price);
        sb.append(", depositDown=").append(depositDown);
        sb.append(", depositImg=").append(depositImg);
        sb.append(", depositPayment=").append(depositPayment);
        sb.append(", depositUpdateTime=").append(depositUpdateTime);
        sb.append(", deliveryDate=").append(deliveryDate);
        sb.append(", deliveryImg=").append(deliveryImg);
        sb.append(", deliveryUpdateTime=").append(deliveryUpdateTime);
        sb.append(", invoiceImg=").append(invoiceImg);
        sb.append(", finalPrice=").append(finalPrice);
        sb.append(", finalNumbers=").append(finalNumbers);
        sb.append(", finalDeposit=").append(finalDeposit);
        sb.append(", finalImg=").append(finalImg);
        sb.append(", finalNote=").append(finalNote);
        sb.append(", finalUpdateTime=").append(finalUpdateTime);
        sb.append(", finalConfirmUpdateTime=").append(finalConfirmUpdateTime);
        sb.append(", balanceAmount=").append(balanceAmount);
        sb.append(", balanceImg=").append(balanceImg);
        sb.append(", balanceUpdateTime=").append(balanceUpdateTime);
        sb.append(", balancePayment=").append(balancePayment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}