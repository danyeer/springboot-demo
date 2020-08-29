package com.ddzb.coppermall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PmsProductBatch implements Serializable {
    private Long id;

    private Long productId;

    private Long userId;

    private String userNickname;

    @ApiModelProperty(value = "下单人手机号")
    private String userPhone;

    @ApiModelProperty(value = "企业名称")
    private String userEnterprisename;

    @ApiModelProperty(value = "0初始 1被选中 2竞价会员撤回")
    private Integer status;

    @ApiModelProperty(value = "报价")
    private BigDecimal money;

    @ApiModelProperty(value = "备注")
    private String note;

    @ApiModelProperty(value = "添加时间")
    private Date createTime;

    @ApiModelProperty(value = "定金比例 0:0% 1:10% 2:30% 3:40% 4:100%")
    private Integer depositRatio;

    @ApiModelProperty(value = "定金支付方式 1->在线担保支付；2->在线支付；3->线下结算；4->线下线上均可")
    private Integer depositPayment;

    @ApiModelProperty(value = "数量")
    private BigDecimal numbers;

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

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDepositRatio() {
        return depositRatio;
    }

    public void setDepositRatio(Integer depositRatio) {
        this.depositRatio = depositRatio;
    }

    public Integer getDepositPayment() {
        return depositPayment;
    }

    public void setDepositPayment(Integer depositPayment) {
        this.depositPayment = depositPayment;
    }

    public BigDecimal getNumbers() {
        return numbers;
    }

    public void setNumbers(BigDecimal numbers) {
        this.numbers = numbers;
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
        sb.append(", userNickname=").append(userNickname);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userEnterprisename=").append(userEnterprisename);
        sb.append(", status=").append(status);
        sb.append(", money=").append(money);
        sb.append(", note=").append(note);
        sb.append(", createTime=").append(createTime);
        sb.append(", depositRatio=").append(depositRatio);
        sb.append(", depositPayment=").append(depositPayment);
        sb.append(", numbers=").append(numbers);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}