package com.ddzb.coppermall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class AreaStreet implements Serializable {
    private Long streetId;

    private String streetName;

    private Long counryId;

    private Long streetCode;

    private static final long serialVersionUID = 1L;

    public Long getStreetId() {
        return streetId;
    }

    public void setStreetId(Long streetId) {
        this.streetId = streetId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Long getCounryId() {
        return counryId;
    }

    public void setCounryId(Long counryId) {
        this.counryId = counryId;
    }

    public Long getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(Long streetCode) {
        this.streetCode = streetCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", streetId=").append(streetId);
        sb.append(", streetName=").append(streetName);
        sb.append(", counryId=").append(counryId);
        sb.append(", streetCode=").append(streetCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}