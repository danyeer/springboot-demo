package com.ddzb.coppermall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UmsMember implements Serializable {
    private Long id;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "交易密码")
    private String tradePass;

    @ApiModelProperty(value = "昵称/姓名")
    private String nickname;

    @ApiModelProperty(value = "微信昵称")
    private String wxnickname;

    @ApiModelProperty(value = "手机号码")
    private String phone;

    @ApiModelProperty(value = "微信unionid")
    private String wxunionid;

    @ApiModelProperty(value = "微信公众号openid")
    private String wxopenid;

    @ApiModelProperty(value = "微信号（app的openid）")
    private String wxopenid2;

    @ApiModelProperty(value = "小程序openid")
    private String wxopenid3;

    @ApiModelProperty(value = "帐号启用状态:0->禁用；1->启用")
    private Integer status;

    @ApiModelProperty(value = "注册时间")
    private Date createTime;

    @ApiModelProperty(value = "头像")
    private String icon;

    @ApiModelProperty(value = "微信头像")
    private String wxicon;

    @ApiModelProperty(value = "性别：0->未知；1->男；2->女")
    private Integer gender;

    @ApiModelProperty(value = "生日")
    private Date birthday;

    @ApiModelProperty(value = "所在城市")
    private String city;

    @ApiModelProperty(value = "个性签名")
    private String personalizedSignature;

    @ApiModelProperty(value = "用户来源 1->微信小程序 2->微信网页授权 3->App")
    private Integer sourceType;

    @ApiModelProperty(value = "是否认证 0->否，1->是")
    private Integer isauth;

    @ApiModelProperty(value = "身份证号")
    private String cardno;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTradePass() {
        return tradePass;
    }

    public void setTradePass(String tradePass) {
        this.tradePass = tradePass;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getWxnickname() {
        return wxnickname;
    }

    public void setWxnickname(String wxnickname) {
        this.wxnickname = wxnickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWxunionid() {
        return wxunionid;
    }

    public void setWxunionid(String wxunionid) {
        this.wxunionid = wxunionid;
    }

    public String getWxopenid() {
        return wxopenid;
    }

    public void setWxopenid(String wxopenid) {
        this.wxopenid = wxopenid;
    }

    public String getWxopenid2() {
        return wxopenid2;
    }

    public void setWxopenid2(String wxopenid2) {
        this.wxopenid2 = wxopenid2;
    }

    public String getWxopenid3() {
        return wxopenid3;
    }

    public void setWxopenid3(String wxopenid3) {
        this.wxopenid3 = wxopenid3;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getWxicon() {
        return wxicon;
    }

    public void setWxicon(String wxicon) {
        this.wxicon = wxicon;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getIsauth() {
        return isauth;
    }

    public void setIsauth(Integer isauth) {
        this.isauth = isauth;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", tradePass=").append(tradePass);
        sb.append(", nickname=").append(nickname);
        sb.append(", wxnickname=").append(wxnickname);
        sb.append(", phone=").append(phone);
        sb.append(", wxunionid=").append(wxunionid);
        sb.append(", wxopenid=").append(wxopenid);
        sb.append(", wxopenid2=").append(wxopenid2);
        sb.append(", wxopenid3=").append(wxopenid3);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", icon=").append(icon);
        sb.append(", wxicon=").append(wxicon);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", city=").append(city);
        sb.append(", personalizedSignature=").append(personalizedSignature);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", isauth=").append(isauth);
        sb.append(", cardno=").append(cardno);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}