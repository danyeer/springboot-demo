package com.ddzb.coppermall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UmsMemberDetails implements Serializable {
    private Long id;

    private Long userId;

    @ApiModelProperty(value = "法人姓名")
    private String name;

    @ApiModelProperty(value = "法人身份证号码")
    private String cardcode;

    @ApiModelProperty(value = "信用代码")
    private String creditcode;

    @ApiModelProperty(value = "企业全称")
    private String enterprisename;

    @ApiModelProperty(value = "企业执照")
    private String enterpriselicense;

    @ApiModelProperty(value = "主营name")
    private String mainBusiness;

    @ApiModelProperty(value = "办公电话")
    private String phone;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "省")
    private Long province;

    @ApiModelProperty(value = "市")
    private Long city;

    @ApiModelProperty(value = "区县")
    private Long county;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;

    @ApiModelProperty(value = "省name")
    private String pname;

    @ApiModelProperty(value = "城市name")
    private String cname;

    @ApiModelProperty(value = "区name")
    private String oname;

    @ApiModelProperty(value = "注册资本")
    private String registered;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardcode() {
        return cardcode;
    }

    public void setCardcode(String cardcode) {
        this.cardcode = cardcode;
    }

    public String getCreditcode() {
        return creditcode;
    }

    public void setCreditcode(String creditcode) {
        this.creditcode = creditcode;
    }

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename;
    }

    public String getEnterpriselicense() {
        return enterpriselicense;
    }

    public void setEnterpriselicense(String enterpriselicense) {
        this.enterpriselicense = enterpriselicense;
    }

    public String getMainBusiness() {
        return mainBusiness;
    }

    public void setMainBusiness(String mainBusiness) {
        this.mainBusiness = mainBusiness;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getProvince() {
        return province;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public Long getCity() {
        return city;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public Long getCounty() {
        return county;
    }

    public void setCounty(Long county) {
        this.county = county;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", cardcode=").append(cardcode);
        sb.append(", creditcode=").append(creditcode);
        sb.append(", enterprisename=").append(enterprisename);
        sb.append(", enterpriselicense=").append(enterpriselicense);
        sb.append(", mainBusiness=").append(mainBusiness);
        sb.append(", phone=").append(phone);
        sb.append(", address=").append(address);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", county=").append(county);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", pname=").append(pname);
        sb.append(", cname=").append(cname);
        sb.append(", oname=").append(oname);
        sb.append(", registered=").append(registered);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}