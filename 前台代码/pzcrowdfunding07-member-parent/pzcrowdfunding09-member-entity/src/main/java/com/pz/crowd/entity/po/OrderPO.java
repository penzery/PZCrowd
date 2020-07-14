package com.pz.crowd.entity.po;

public class OrderPO {
    private Long orderId;

    private String orderNum;

    private String alipayNum;

    private Double orderMoney;

    private Integer orderInvoice;

    private String orderInvoiceTitle;

    private String orderRemark;

    private Long orderAddressId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public String getAlipayNum() {
        return alipayNum;
    }

    public void setAlipayNum(String alipayNum) {
        this.alipayNum = alipayNum == null ? null : alipayNum.trim();
    }

    public Double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public Integer getOrderInvoice() {
        return orderInvoice;
    }

    public void setOrderInvoice(Integer orderInvoice) {
        this.orderInvoice = orderInvoice;
    }

    public String getOrderInvoiceTitle() {
        return orderInvoiceTitle;
    }

    public void setOrderInvoiceTitle(String orderInvoiceTitle) {
        this.orderInvoiceTitle = orderInvoiceTitle == null ? null : orderInvoiceTitle.trim();
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    public Long getOrderAddressId() {
        return orderAddressId;
    }

    public void setOrderAddressId(Long orderAddressId) {
        this.orderAddressId = orderAddressId;
    }
}