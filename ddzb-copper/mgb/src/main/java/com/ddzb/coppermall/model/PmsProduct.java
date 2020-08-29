package com.ddzb.coppermall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PmsProduct implements Serializable {
    private Long id;

    @ApiModelProperty(value = "发布用户ID")
    private Long userId;

    @ApiModelProperty(value = "用户账户")
    private String userName;

    private String userPhone;

    @ApiModelProperty(value = "企业名称")
    private String userEnterprisename;

    private Long brandId;

    private Long productCategoryId;

    @ApiModelProperty(value = "品牌名称")
    private String brandName;

    @ApiModelProperty(value = "商品分类名称")
    private String productCategoryName;

    @ApiModelProperty(value = "标题")
    private String titles;

    @ApiModelProperty(value = "缩略图")
    private String picThum;

    @ApiModelProperty(value = "主图(单张）")
    private String pic;

    @ApiModelProperty(value = "货号")
    private String productSn;

    @ApiModelProperty(value = "删除状态：1->未删除；0->已删除")
    private Integer deleteStatus;

    @ApiModelProperty(value = "上线状态：0->下线；1->上线")
    private Integer publishStatus;

    @ApiModelProperty(value = "审核状态：0->未审核；1->审核通过")
    private Integer verifyStatus;

    @ApiModelProperty(value = "交易状态：-1->撤单；0->初始；1->已报名；2->生成订单")
    private Integer transactionStatus;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "牌号code")
    private String dictionary1Code;

    @ApiModelProperty(value = "牌号name")
    private String dictionary1Name;

    @ApiModelProperty(value = "生产工艺code")
    private String dictionary2Code;

    @ApiModelProperty(value = "生产工艺name")
    private String dictionary2Name;

    @ApiModelProperty(value = "形状code")
    private String dictionary3Code;

    @ApiModelProperty(value = "形状name")
    private String dictionary3Name;

    @ApiModelProperty(value = "起拍价/单价 0为议价")
    private BigDecimal price;

    @ApiModelProperty(value = "用途")
    private String description;

    @ApiModelProperty(value = "数量库存")
    private BigDecimal stock;

    @ApiModelProperty(value = "库存预警值")
    private BigDecimal lowStock;

    @ApiModelProperty(value = "单位")
    private String unit;

    @ApiModelProperty(value = "起订数量")
    private BigDecimal startingStock;

    @ApiModelProperty(value = "详细地址")
    private String deliveryAddress;

    @ApiModelProperty(value = "交收地 省id")
    private Long deliveryPid;

    @ApiModelProperty(value = "交收地 市id")
    private Long deliveryCid;

    @ApiModelProperty(value = "交收地 区id")
    private Long deliveryOid;

    @ApiModelProperty(value = "交收地 省name")
    private String deliveryPname;

    @ApiModelProperty(value = "交收地 市name")
    private String deliveryCname;

    @ApiModelProperty(value = "交收地 区name")
    private String deliveryOname;

    @ApiModelProperty(value = "交付方式 1->买家自提 2->送货")
    private Integer deliveryType;

    @ApiModelProperty(value = "商品直径外径，默认为毫米")
    private BigDecimal diameter;

    @ApiModelProperty(value = "商品壁厚，默认为毫米")
    private BigDecimal walls;

    @ApiModelProperty(value = "商品宽度，默认为毫米")
    private BigDecimal widths;

    @ApiModelProperty(value = "商品长度，默认为毫米")
    private BigDecimal lengths;

    @ApiModelProperty(value = "签约方式 1->线下签约；2-> 电子合同")
    private Integer signingType;

    @ApiModelProperty(value = "定金 百分")
    private Integer deposit;

    @ApiModelProperty(value = "定金支付方式 1->在线担保支付；2->在线支付；3->线下结算；4->线下线上均可")
    private Integer depositPayment;

    @ApiModelProperty(value = "尾款支付天数")
    private Integer finalDays;

    @ApiModelProperty(value = "尾款支付方式 1->线上；2->线下；3->线上线下均可")
    private Integer finalPayment;

    @ApiModelProperty(value = "交付天数(付款后xx天，为0请参考日期区间字段)")
    private Integer deliveryDays;

    @ApiModelProperty(value = "交付开始时间")
    private Date deliveryStartTime;

    @ApiModelProperty(value = "交付结束时间")
    private Date deliveryEndTime;

    @ApiModelProperty(value = "发票 1->增值税；2->专用；3->无")
    private Integer invoice;

    @ApiModelProperty(value = "合同模板")
    private String contractTemplate;

    private String keywords;

    private String note;

    private String detailTitle;

    @ApiModelProperty(value = "交易类型 1->竞价 2->现货 3->招标")
    private Integer type;

    @ApiModelProperty(value = "拍卖开始时间")
    private Date auctionStartTime;

    @ApiModelProperty(value = "拍卖结束时间")
    private Date auctionEndTime;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "已售量")
    private BigDecimal soldStock;

    @ApiModelProperty(value = "乐观版本号")
    private Integer version;

    private String detailDesc;

    @ApiModelProperty(value = "产品详情网页内容")
    private String detailHtml;

    @ApiModelProperty(value = "移动端网页详情")
    private String detailMobileHtml;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getPicThum() {
        return picThum;
    }

    public void setPicThum(String picThum) {
        this.picThum = picThum;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public Integer getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(Integer transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDictionary1Code() {
        return dictionary1Code;
    }

    public void setDictionary1Code(String dictionary1Code) {
        this.dictionary1Code = dictionary1Code;
    }

    public String getDictionary1Name() {
        return dictionary1Name;
    }

    public void setDictionary1Name(String dictionary1Name) {
        this.dictionary1Name = dictionary1Name;
    }

    public String getDictionary2Code() {
        return dictionary2Code;
    }

    public void setDictionary2Code(String dictionary2Code) {
        this.dictionary2Code = dictionary2Code;
    }

    public String getDictionary2Name() {
        return dictionary2Name;
    }

    public void setDictionary2Name(String dictionary2Name) {
        this.dictionary2Name = dictionary2Name;
    }

    public String getDictionary3Code() {
        return dictionary3Code;
    }

    public void setDictionary3Code(String dictionary3Code) {
        this.dictionary3Code = dictionary3Code;
    }

    public String getDictionary3Name() {
        return dictionary3Name;
    }

    public void setDictionary3Name(String dictionary3Name) {
        this.dictionary3Name = dictionary3Name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    public BigDecimal getLowStock() {
        return lowStock;
    }

    public void setLowStock(BigDecimal lowStock) {
        this.lowStock = lowStock;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getStartingStock() {
        return startingStock;
    }

    public void setStartingStock(BigDecimal startingStock) {
        this.startingStock = startingStock;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Long getDeliveryPid() {
        return deliveryPid;
    }

    public void setDeliveryPid(Long deliveryPid) {
        this.deliveryPid = deliveryPid;
    }

    public Long getDeliveryCid() {
        return deliveryCid;
    }

    public void setDeliveryCid(Long deliveryCid) {
        this.deliveryCid = deliveryCid;
    }

    public Long getDeliveryOid() {
        return deliveryOid;
    }

    public void setDeliveryOid(Long deliveryOid) {
        this.deliveryOid = deliveryOid;
    }

    public String getDeliveryPname() {
        return deliveryPname;
    }

    public void setDeliveryPname(String deliveryPname) {
        this.deliveryPname = deliveryPname;
    }

    public String getDeliveryCname() {
        return deliveryCname;
    }

    public void setDeliveryCname(String deliveryCname) {
        this.deliveryCname = deliveryCname;
    }

    public String getDeliveryOname() {
        return deliveryOname;
    }

    public void setDeliveryOname(String deliveryOname) {
        this.deliveryOname = deliveryOname;
    }

    public Integer getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(Integer deliveryType) {
        this.deliveryType = deliveryType;
    }

    public BigDecimal getDiameter() {
        return diameter;
    }

    public void setDiameter(BigDecimal diameter) {
        this.diameter = diameter;
    }

    public BigDecimal getWalls() {
        return walls;
    }

    public void setWalls(BigDecimal walls) {
        this.walls = walls;
    }

    public BigDecimal getWidths() {
        return widths;
    }

    public void setWidths(BigDecimal widths) {
        this.widths = widths;
    }

    public BigDecimal getLengths() {
        return lengths;
    }

    public void setLengths(BigDecimal lengths) {
        this.lengths = lengths;
    }

    public Integer getSigningType() {
        return signingType;
    }

    public void setSigningType(Integer signingType) {
        this.signingType = signingType;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getDepositPayment() {
        return depositPayment;
    }

    public void setDepositPayment(Integer depositPayment) {
        this.depositPayment = depositPayment;
    }

    public Integer getFinalDays() {
        return finalDays;
    }

    public void setFinalDays(Integer finalDays) {
        this.finalDays = finalDays;
    }

    public Integer getFinalPayment() {
        return finalPayment;
    }

    public void setFinalPayment(Integer finalPayment) {
        this.finalPayment = finalPayment;
    }

    public Integer getDeliveryDays() {
        return deliveryDays;
    }

    public void setDeliveryDays(Integer deliveryDays) {
        this.deliveryDays = deliveryDays;
    }

    public Date getDeliveryStartTime() {
        return deliveryStartTime;
    }

    public void setDeliveryStartTime(Date deliveryStartTime) {
        this.deliveryStartTime = deliveryStartTime;
    }

    public Date getDeliveryEndTime() {
        return deliveryEndTime;
    }

    public void setDeliveryEndTime(Date deliveryEndTime) {
        this.deliveryEndTime = deliveryEndTime;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public String getContractTemplate() {
        return contractTemplate;
    }

    public void setContractTemplate(String contractTemplate) {
        this.contractTemplate = contractTemplate;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDetailTitle() {
        return detailTitle;
    }

    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getAuctionStartTime() {
        return auctionStartTime;
    }

    public void setAuctionStartTime(Date auctionStartTime) {
        this.auctionStartTime = auctionStartTime;
    }

    public Date getAuctionEndTime() {
        return auctionEndTime;
    }

    public void setAuctionEndTime(Date auctionEndTime) {
        this.auctionEndTime = auctionEndTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getSoldStock() {
        return soldStock;
    }

    public void setSoldStock(BigDecimal soldStock) {
        this.soldStock = soldStock;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public String getDetailHtml() {
        return detailHtml;
    }

    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml;
    }

    public String getDetailMobileHtml() {
        return detailMobileHtml;
    }

    public void setDetailMobileHtml(String detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userEnterprisename=").append(userEnterprisename);
        sb.append(", brandId=").append(brandId);
        sb.append(", productCategoryId=").append(productCategoryId);
        sb.append(", brandName=").append(brandName);
        sb.append(", productCategoryName=").append(productCategoryName);
        sb.append(", titles=").append(titles);
        sb.append(", picThum=").append(picThum);
        sb.append(", pic=").append(pic);
        sb.append(", productSn=").append(productSn);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", publishStatus=").append(publishStatus);
        sb.append(", verifyStatus=").append(verifyStatus);
        sb.append(", transactionStatus=").append(transactionStatus);
        sb.append(", sort=").append(sort);
        sb.append(", dictionary1Code=").append(dictionary1Code);
        sb.append(", dictionary1Name=").append(dictionary1Name);
        sb.append(", dictionary2Code=").append(dictionary2Code);
        sb.append(", dictionary2Name=").append(dictionary2Name);
        sb.append(", dictionary3Code=").append(dictionary3Code);
        sb.append(", dictionary3Name=").append(dictionary3Name);
        sb.append(", price=").append(price);
        sb.append(", description=").append(description);
        sb.append(", stock=").append(stock);
        sb.append(", lowStock=").append(lowStock);
        sb.append(", unit=").append(unit);
        sb.append(", startingStock=").append(startingStock);
        sb.append(", deliveryAddress=").append(deliveryAddress);
        sb.append(", deliveryPid=").append(deliveryPid);
        sb.append(", deliveryCid=").append(deliveryCid);
        sb.append(", deliveryOid=").append(deliveryOid);
        sb.append(", deliveryPname=").append(deliveryPname);
        sb.append(", deliveryCname=").append(deliveryCname);
        sb.append(", deliveryOname=").append(deliveryOname);
        sb.append(", deliveryType=").append(deliveryType);
        sb.append(", diameter=").append(diameter);
        sb.append(", walls=").append(walls);
        sb.append(", widths=").append(widths);
        sb.append(", lengths=").append(lengths);
        sb.append(", signingType=").append(signingType);
        sb.append(", deposit=").append(deposit);
        sb.append(", depositPayment=").append(depositPayment);
        sb.append(", finalDays=").append(finalDays);
        sb.append(", finalPayment=").append(finalPayment);
        sb.append(", deliveryDays=").append(deliveryDays);
        sb.append(", deliveryStartTime=").append(deliveryStartTime);
        sb.append(", deliveryEndTime=").append(deliveryEndTime);
        sb.append(", invoice=").append(invoice);
        sb.append(", contractTemplate=").append(contractTemplate);
        sb.append(", keywords=").append(keywords);
        sb.append(", note=").append(note);
        sb.append(", detailTitle=").append(detailTitle);
        sb.append(", type=").append(type);
        sb.append(", auctionStartTime=").append(auctionStartTime);
        sb.append(", auctionEndTime=").append(auctionEndTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", soldStock=").append(soldStock);
        sb.append(", version=").append(version);
        sb.append(", detailDesc=").append(detailDesc);
        sb.append(", detailHtml=").append(detailHtml);
        sb.append(", detailMobileHtml=").append(detailMobileHtml);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}