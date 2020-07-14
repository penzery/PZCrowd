package com.pz.crowd.entity.vo;

import java.io.Serializable;

public class OrderVO implements Serializable {
    private Long orderId;
    private String orderNum;

    private String alipayNum;
    private Double orderMoney;
    private Integer orderInvoice;

    private String orderInvoiceTitle;

    private String orderRemark;

    private Long orderAddressId;

    private OrderProjectVO orderProjectVO;

    public OrderVO() {
    }

    public OrderVO(Long orderId, String orderNum, String alipayNum, Double orderMoney, Integer orderInvoice, String orderInvoiceTitle, String orderRemark, Long orderAddressId, OrderProjectVO orderProjectVO) {
        this.orderId = orderId;
        this.orderNum = orderNum;
        this.alipayNum = alipayNum;
        this.orderMoney = orderMoney;
        this.orderInvoice = orderInvoice;
        this.orderInvoiceTitle = orderInvoiceTitle;
        this.orderRemark = orderRemark;
        this.orderAddressId = orderAddressId;
        this.orderProjectVO = orderProjectVO;
    }

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
        this.orderNum = orderNum;
    }

    public String getAlipayNum() {
        return alipayNum;
    }

    public void setAlipayNum(String alipayNum) {
        this.alipayNum = alipayNum;
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
        this.orderInvoiceTitle = orderInvoiceTitle;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public Long getOrderAddressId() {
        return orderAddressId;
    }

    public void setOrderAddressId(Long orderAddressId) {
        this.orderAddressId = orderAddressId;
    }

    public OrderProjectVO getOrderProjectVO() {
        return orderProjectVO;
    }

    public void setOrderProjectVO(OrderProjectVO orderProjectVO) {
        this.orderProjectVO = orderProjectVO;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "orderId=" + orderId +
                ", orderNum='" + orderNum + '\'' +
                ", alipayNum='" + alipayNum + '\'' +
                ", orderMoney=" + orderMoney +
                ", orderInvoice=" + orderInvoice +
                ", orderInvoiceTitle='" + orderInvoiceTitle + '\'' +
                ", orderRemark='" + orderRemark + '\'' +
                ", orderAddressId=" + orderAddressId +
                ", orderProjectVO=" + orderProjectVO +
                '}';
    }
}
