package com.ddzb.coppermall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class AreaCounty implements Serializable {
    private Long countyId;

    private String countyName;

    private Long cityId;

    private Long countyCode;

    private static final long serialVersionUID = 1L;

    public Long getCountyId() {
        return countyId;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(Long countyCode) {
        this.countyCode = countyCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", countyId=").append(countyId);
        sb.append(", countyName=").append(countyName);
        sb.append(", cityId=").append(cityId);
        sb.append(", countyCode=").append(countyCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}