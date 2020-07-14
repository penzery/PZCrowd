package com.pz.crowd.entity.po;

import java.util.ArrayList;
import java.util.List;

public class OrderPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderPOExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(String value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(String value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(String value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(String value) {
            addCriterion("order_num like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(String value) {
            addCriterion("order_num not like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<String> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumIsNull() {
            addCriterion("alipay_num is null");
            return (Criteria) this;
        }

        public Criteria andAlipayNumIsNotNull() {
            addCriterion("alipay_num is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayNumEqualTo(String value) {
            addCriterion("alipay_num =", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumNotEqualTo(String value) {
            addCriterion("alipay_num <>", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumGreaterThan(String value) {
            addCriterion("alipay_num >", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_num >=", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumLessThan(String value) {
            addCriterion("alipay_num <", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumLessThanOrEqualTo(String value) {
            addCriterion("alipay_num <=", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumLike(String value) {
            addCriterion("alipay_num like", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumNotLike(String value) {
            addCriterion("alipay_num not like", value, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumIn(List<String> values) {
            addCriterion("alipay_num in", values, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumNotIn(List<String> values) {
            addCriterion("alipay_num not in", values, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumBetween(String value1, String value2) {
            addCriterion("alipay_num between", value1, value2, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andAlipayNumNotBetween(String value1, String value2) {
            addCriterion("alipay_num not between", value1, value2, "alipayNum");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNull() {
            addCriterion("order_money is null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNotNull() {
            addCriterion("order_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyEqualTo(Double value) {
            addCriterion("order_money =", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotEqualTo(Double value) {
            addCriterion("order_money <>", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThan(Double value) {
            addCriterion("order_money >", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("order_money >=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThan(Double value) {
            addCriterion("order_money <", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThanOrEqualTo(Double value) {
            addCriterion("order_money <=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIn(List<Double> values) {
            addCriterion("order_money in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotIn(List<Double> values) {
            addCriterion("order_money not in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyBetween(Double value1, Double value2) {
            addCriterion("order_money between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotBetween(Double value1, Double value2) {
            addCriterion("order_money not between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceIsNull() {
            addCriterion("order_invoice is null");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceIsNotNull() {
            addCriterion("order_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceEqualTo(Integer value) {
            addCriterion("order_invoice =", value, "orderInvoice");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceNotEqualTo(Integer value) {
            addCriterion("order_invoice <>", value, "orderInvoice");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceGreaterThan(Integer value) {
            addCriterion("order_invoice >", value, "orderInvoice");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_invoice >=", value, "orderInvoice");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceLessThan(Integer value) {
            addCriterion("order_invoice <", value, "orderInvoice");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("order_invoice <=", value, "orderInvoice");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceIn(List<Integer> values) {
            addCriterion("order_invoice in", values, "orderInvoice");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceNotIn(List<Integer> values) {
            addCriterion("order_invoice not in", values, "orderInvoice");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceBetween(Integer value1, Integer value2) {
            addCriterion("order_invoice between", value1, value2, "orderInvoice");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("order_invoice not between", value1, value2, "orderInvoice");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceTitleIsNull() {
            addCriterion("order_invoice_title is null");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceTitleIsNotNull() {
            addCriterion("order_invoice_title is not null");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceTitleEqualTo(String value) {
            addCriterion("order_invoice_title =", value, "orderInvoiceTitle");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceTitleNotEqualTo(String value) {
            addCriterion("order_invoice_title <>", value, "orderInvoiceTitle");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceTitleGreaterThan(String value) {
            addCriterion("order_invoice_title >", value, "orderInvoiceTitle");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("order_invoice_title >=", value, "orderInvoiceTitle");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceTitleLessThan(String value) {
            addCriterion("order_invoice_title <", value, "orderInvoiceTitle");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceTitleLessThanOrEqualTo(String value) {
            addCriterion("order_invoice_title <=", value, "orderInvoiceTitle");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceTitleLike(String value) {
            addCriterion("order_invoice_title like", value, "orderInvoiceTitle");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceTitleNotLike(String value) {
            addCriterion("order_invoice_title not like", value, "orderInvoiceTitle");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceTitleIn(List<String> values) {
            addCriterion("order_invoice_title in", values, "orderInvoiceTitle");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceTitleNotIn(List<String> values) {
            addCriterion("order_invoice_title not in", values, "orderInvoiceTitle");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceTitleBetween(String value1, String value2) {
            addCriterion("order_invoice_title between", value1, value2, "orderInvoiceTitle");
            return (Criteria) this;
        }

        public Criteria andOrderInvoiceTitleNotBetween(String value1, String value2) {
            addCriterion("order_invoice_title not between", value1, value2, "orderInvoiceTitle");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkIsNull() {
            addCriterion("order_remark is null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkIsNotNull() {
            addCriterion("order_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkEqualTo(String value) {
            addCriterion("order_remark =", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotEqualTo(String value) {
            addCriterion("order_remark <>", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkGreaterThan(String value) {
            addCriterion("order_remark >", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("order_remark >=", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLessThan(String value) {
            addCriterion("order_remark <", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLessThanOrEqualTo(String value) {
            addCriterion("order_remark <=", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLike(String value) {
            addCriterion("order_remark like", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotLike(String value) {
            addCriterion("order_remark not like", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkIn(List<String> values) {
            addCriterion("order_remark in", values, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotIn(List<String> values) {
            addCriterion("order_remark not in", values, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkBetween(String value1, String value2) {
            addCriterion("order_remark between", value1, value2, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotBetween(String value1, String value2) {
            addCriterion("order_remark not between", value1, value2, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIdIsNull() {
            addCriterion("order_address_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIdIsNotNull() {
            addCriterion("order_address_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIdEqualTo(Long value) {
            addCriterion("order_address_id =", value, "orderAddressId");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIdNotEqualTo(Long value) {
            addCriterion("order_address_id <>", value, "orderAddressId");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIdGreaterThan(Long value) {
            addCriterion("order_address_id >", value, "orderAddressId");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_address_id >=", value, "orderAddressId");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIdLessThan(Long value) {
            addCriterion("order_address_id <", value, "orderAddressId");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIdLessThanOrEqualTo(Long value) {
            addCriterion("order_address_id <=", value, "orderAddressId");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIdIn(List<Long> values) {
            addCriterion("order_address_id in", values, "orderAddressId");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIdNotIn(List<Long> values) {
            addCriterion("order_address_id not in", values, "orderAddressId");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIdBetween(Long value1, Long value2) {
            addCriterion("order_address_id between", value1, value2, "orderAddressId");
            return (Criteria) this;
        }

        public Criteria andOrderAddressIdNotBetween(Long value1, Long value2) {
            addCriterion("order_address_id not between", value1, value2, "orderAddressId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}