package com.pz.crowd.entity.po;

import java.util.ArrayList;
import java.util.List;

public class ProjectLaunchMemberConfirmInfoPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectLaunchMemberConfirmInfoPOExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberPayNumIsNull() {
            addCriterion("member_pay_num is null");
            return (Criteria) this;
        }

        public Criteria andMemberPayNumIsNotNull() {
            addCriterion("member_pay_num is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPayNumEqualTo(String value) {
            addCriterion("member_pay_num =", value, "memberPayNum");
            return (Criteria) this;
        }

        public Criteria andMemberPayNumNotEqualTo(String value) {
            addCriterion("member_pay_num <>", value, "memberPayNum");
            return (Criteria) this;
        }

        public Criteria andMemberPayNumGreaterThan(String value) {
            addCriterion("member_pay_num >", value, "memberPayNum");
            return (Criteria) this;
        }

        public Criteria andMemberPayNumGreaterThanOrEqualTo(String value) {
            addCriterion("member_pay_num >=", value, "memberPayNum");
            return (Criteria) this;
        }

        public Criteria andMemberPayNumLessThan(String value) {
            addCriterion("member_pay_num <", value, "memberPayNum");
            return (Criteria) this;
        }

        public Criteria andMemberPayNumLessThanOrEqualTo(String value) {
            addCriterion("member_pay_num <=", value, "memberPayNum");
            return (Criteria) this;
        }

        public Criteria andMemberPayNumLike(String value) {
            addCriterion("member_pay_num like", value, "memberPayNum");
            return (Criteria) this;
        }

        public Criteria andMemberPayNumNotLike(String value) {
            addCriterion("member_pay_num not like", value, "memberPayNum");
            return (Criteria) this;
        }

        public Criteria andMemberPayNumIn(List<String> values) {
            addCriterion("member_pay_num in", values, "memberPayNum");
            return (Criteria) this;
        }

        public Criteria andMemberPayNumNotIn(List<String> values) {
            addCriterion("member_pay_num not in", values, "memberPayNum");
            return (Criteria) this;
        }

        public Criteria andMemberPayNumBetween(String value1, String value2) {
            addCriterion("member_pay_num between", value1, value2, "memberPayNum");
            return (Criteria) this;
        }

        public Criteria andMemberPayNumNotBetween(String value1, String value2) {
            addCriterion("member_pay_num not between", value1, value2, "memberPayNum");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumIsNull() {
            addCriterion("member_card_num is null");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumIsNotNull() {
            addCriterion("member_card_num is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumEqualTo(String value) {
            addCriterion("member_card_num =", value, "memberCardNum");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumNotEqualTo(String value) {
            addCriterion("member_card_num <>", value, "memberCardNum");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumGreaterThan(String value) {
            addCriterion("member_card_num >", value, "memberCardNum");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumGreaterThanOrEqualTo(String value) {
            addCriterion("member_card_num >=", value, "memberCardNum");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumLessThan(String value) {
            addCriterion("member_card_num <", value, "memberCardNum");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumLessThanOrEqualTo(String value) {
            addCriterion("member_card_num <=", value, "memberCardNum");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumLike(String value) {
            addCriterion("member_card_num like", value, "memberCardNum");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumNotLike(String value) {
            addCriterion("member_card_num not like", value, "memberCardNum");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumIn(List<String> values) {
            addCriterion("member_card_num in", values, "memberCardNum");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumNotIn(List<String> values) {
            addCriterion("member_card_num not in", values, "memberCardNum");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumBetween(String value1, String value2) {
            addCriterion("member_card_num between", value1, value2, "memberCardNum");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumNotBetween(String value1, String value2) {
            addCriterion("member_card_num not between", value1, value2, "memberCardNum");
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