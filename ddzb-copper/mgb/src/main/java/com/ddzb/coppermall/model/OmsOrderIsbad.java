package com.ddzb.coppermall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class OmsOrderIsbad implements Serializable {
    private Long id;

    @ApiModelProperty(value = "订单ID")
    private Long orderId;

    @ApiModelProperty(value = "申诉相关批次ID 可为空 ")
    private Long orderBatchId;

    @ApiModelProperty(value = "申诉人")
    private Long adduserId;

    @ApiModelProperty(value = "申诉时间")
    private Date createTime;

    @ApiModelProperty(value = "备注")
    private String note;

    @ApiModelProperty(value = "状态  1初始化 2已处理 3无法沟通 4已解决")
    private Integer status;

    @ApiModelProperty(value = "处理备注")
    private String makeNote;

    @ApiModelProperty(value = "申诉图片 多张逗号隔开")
    private String images;

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

    public Long getOrderBatchId() {
        return orderBatchId;
    }

    public void setOrderBatchId(Long orderBatchId) {
        this.orderBatchId = orderBatchId;
    }

    public Long getAdduserId() {
        return adduserId;
    }

    public void setAdduserId(Long adduserId) {
        this.adduserId = adduserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMakeNote() {
        return makeNote;
    }

    public void setMakeNote(String makeNote) {
        this.makeNote = makeNote;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderBatchId=").append(orderBatchId);
        sb.append(", adduserId=").append(adduserId);
        sb.append(", createTime=").append(createTime);
        sb.append(", note=").append(note);
        sb.append(", status=").append(status);
        sb.append(", makeNote=").append(makeNote);
        sb.append(", images=").append(images);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}