package com.pz.crowd.entity.po;

import java.util.ArrayList;
import java.util.List;

public class ProjectLaunchMemberInfoPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectLaunchMemberInfoPOExample() {
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

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Long value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Long value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Long value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Long value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Long value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Long> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Long> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Long value1, Long value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Long value1, Long value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
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

        public Criteria andMemberSelfDescriptionSimpleIsNull() {
            addCriterion("member_self_description_simple is null");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionSimpleIsNotNull() {
            addCriterion("member_self_description_simple is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionSimpleEqualTo(String value) {
            addCriterion("member_self_description_simple =", value, "memberSelfDescriptionSimple");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionSimpleNotEqualTo(String value) {
            addCriterion("member_self_description_simple <>", value, "memberSelfDescriptionSimple");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionSimpleGreaterThan(String value) {
            addCriterion("member_self_description_simple >", value, "memberSelfDescriptionSimple");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionSimpleGreaterThanOrEqualTo(String value) {
            addCriterion("member_self_description_simple >=", value, "memberSelfDescriptionSimple");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionSimpleLessThan(String value) {
            addCriterion("member_self_description_simple <", value, "memberSelfDescriptionSimple");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionSimpleLessThanOrEqualTo(String value) {
            addCriterion("member_self_description_simple <=", value, "memberSelfDescriptionSimple");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionSimpleLike(String value) {
            addCriterion("member_self_description_simple like", value, "memberSelfDescriptionSimple");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionSimpleNotLike(String value) {
            addCriterion("member_self_description_simple not like", value, "memberSelfDescriptionSimple");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionSimpleIn(List<String> values) {
            addCriterion("member_self_description_simple in", values, "memberSelfDescriptionSimple");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionSimpleNotIn(List<String> values) {
            addCriterion("member_self_description_simple not in", values, "memberSelfDescriptionSimple");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionSimpleBetween(String value1, String value2) {
            addCriterion("member_self_description_simple between", value1, value2, "memberSelfDescriptionSimple");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionSimpleNotBetween(String value1, String value2) {
            addCriterion("member_self_description_simple not between", value1, value2, "memberSelfDescriptionSimple");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionDetailIsNull() {
            addCriterion("member_self_description_detail is null");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionDetailIsNotNull() {
            addCriterion("member_self_description_detail is not null");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionDetailEqualTo(String value) {
            addCriterion("member_self_description_detail =", value, "memberSelfDescriptionDetail");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionDetailNotEqualTo(String value) {
            addCriterion("member_self_description_detail <>", value, "memberSelfDescriptionDetail");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionDetailGreaterThan(String value) {
            addCriterion("member_self_description_detail >", value, "memberSelfDescriptionDetail");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionDetailGreaterThanOrEqualTo(String value) {
            addCriterion("member_self_description_detail >=", value, "memberSelfDescriptionDetail");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionDetailLessThan(String value) {
            addCriterion("member_self_description_detail <", value, "memberSelfDescriptionDetail");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionDetailLessThanOrEqualTo(String value) {
            addCriterion("member_self_description_detail <=", value, "memberSelfDescriptionDetail");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionDetailLike(String value) {
            addCriterion("member_self_description_detail like", value, "memberSelfDescriptionDetail");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionDetailNotLike(String value) {
            addCriterion("member_self_description_detail not like", value, "memberSelfDescriptionDetail");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionDetailIn(List<String> values) {
            addCriterion("member_self_description_detail in", values, "memberSelfDescriptionDetail");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionDetailNotIn(List<String> values) {
            addCriterion("member_self_description_detail not in", values, "memberSelfDescriptionDetail");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionDetailBetween(String value1, String value2) {
            addCriterion("member_self_description_detail between", value1, value2, "memberSelfDescriptionDetail");
            return (Criteria) this;
        }

        public Criteria andMemberSelfDescriptionDetailNotBetween(String value1, String value2) {
            addCriterion("member_self_description_detail not between", value1, value2, "memberSelfDescriptionDetail");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNumberIsNull() {
            addCriterion("member_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNumberIsNotNull() {
            addCriterion("member_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNumberEqualTo(String value) {
            addCriterion("member_phone_number =", value, "memberPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNumberNotEqualTo(String value) {
            addCriterion("member_phone_number <>", value, "memberPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNumberGreaterThan(String value) {
            addCriterion("member_phone_number >", value, "memberPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("member_phone_number >=", value, "memberPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNumberLessThan(String value) {
            addCriterion("member_phone_number <", value, "memberPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("member_phone_number <=", value, "memberPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNumberLike(String value) {
            addCriterion("member_phone_number like", value, "memberPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNumberNotLike(String value) {
            addCriterion("member_phone_number not like", value, "memberPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNumberIn(List<String> values) {
            addCriterion("member_phone_number in", values, "memberPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNumberNotIn(List<String> values) {
            addCriterion("member_phone_number not in", values, "memberPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNumberBetween(String value1, String value2) {
            addCriterion("member_phone_number between", value1, value2, "memberPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMemberPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("member_phone_number not between", value1, value2, "memberPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumIsNull() {
            addCriterion("service_phone_num is null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumIsNotNull() {
            addCriterion("service_phone_num is not null");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumEqualTo(String value) {
            addCriterion("service_phone_num =", value, "servicePhoneNum");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumNotEqualTo(String value) {
            addCriterion("service_phone_num <>", value, "servicePhoneNum");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumGreaterThan(String value) {
            addCriterion("service_phone_num >", value, "servicePhoneNum");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("service_phone_num >=", value, "servicePhoneNum");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumLessThan(String value) {
            addCriterion("service_phone_num <", value, "servicePhoneNum");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumLessThanOrEqualTo(String value) {
            addCriterion("service_phone_num <=", value, "servicePhoneNum");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumLike(String value) {
            addCriterion("service_phone_num like", value, "servicePhoneNum");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumNotLike(String value) {
            addCriterion("service_phone_num not like", value, "servicePhoneNum");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumIn(List<String> values) {
            addCriterion("service_phone_num in", values, "servicePhoneNum");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumNotIn(List<String> values) {
            addCriterion("service_phone_num not in", values, "servicePhoneNum");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumBetween(String value1, String value2) {
            addCriterion("service_phone_num between", value1, value2, "servicePhoneNum");
            return (Criteria) this;
        }

        public Criteria andServicePhoneNumNotBetween(String value1, String value2) {
            addCriterion("service_phone_num not between", value1, value2, "servicePhoneNum");
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