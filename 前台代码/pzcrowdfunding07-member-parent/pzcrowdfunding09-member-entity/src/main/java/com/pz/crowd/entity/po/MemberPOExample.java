package com.pz.crowd.entity.po;

import java.util.ArrayList;
import java.util.List;

public class MemberPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberPOExample() {
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

        public Criteria andMemberAccountIsNull() {
            addCriterion("member_account is null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIsNotNull() {
            addCriterion("member_account is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountEqualTo(String value) {
            addCriterion("member_account =", value, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNotEqualTo(String value) {
            addCriterion("member_account <>", value, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountGreaterThan(String value) {
            addCriterion("member_account >", value, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountGreaterThanOrEqualTo(String value) {
            addCriterion("member_account >=", value, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountLessThan(String value) {
            addCriterion("member_account <", value, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountLessThanOrEqualTo(String value) {
            addCriterion("member_account <=", value, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountLike(String value) {
            addCriterion("member_account like", value, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNotLike(String value) {
            addCriterion("member_account not like", value, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIn(List<String> values) {
            addCriterion("member_account in", values, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNotIn(List<String> values) {
            addCriterion("member_account not in", values, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountBetween(String value1, String value2) {
            addCriterion("member_account between", value1, value2, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNotBetween(String value1, String value2) {
            addCriterion("member_account not between", value1, value2, "memberAccount");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIsNull() {
            addCriterion("member_password is null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIsNotNull() {
            addCriterion("member_password is not null");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordEqualTo(String value) {
            addCriterion("member_password =", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotEqualTo(String value) {
            addCriterion("member_password <>", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordGreaterThan(String value) {
            addCriterion("member_password >", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("member_password >=", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLessThan(String value) {
            addCriterion("member_password <", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLessThanOrEqualTo(String value) {
            addCriterion("member_password <=", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordLike(String value) {
            addCriterion("member_password like", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotLike(String value) {
            addCriterion("member_password not like", value, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordIn(List<String> values) {
            addCriterion("member_password in", values, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotIn(List<String> values) {
            addCriterion("member_password not in", values, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordBetween(String value1, String value2) {
            addCriterion("member_password between", value1, value2, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberPasswordNotBetween(String value1, String value2) {
            addCriterion("member_password not between", value1, value2, "memberPassword");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameIsNull() {
            addCriterion("member_username is null");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameIsNotNull() {
            addCriterion("member_username is not null");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameEqualTo(String value) {
            addCriterion("member_username =", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameNotEqualTo(String value) {
            addCriterion("member_username <>", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameGreaterThan(String value) {
            addCriterion("member_username >", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("member_username >=", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameLessThan(String value) {
            addCriterion("member_username <", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameLessThanOrEqualTo(String value) {
            addCriterion("member_username <=", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameLike(String value) {
            addCriterion("member_username like", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameNotLike(String value) {
            addCriterion("member_username not like", value, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameIn(List<String> values) {
            addCriterion("member_username in", values, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameNotIn(List<String> values) {
            addCriterion("member_username not in", values, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameBetween(String value1, String value2) {
            addCriterion("member_username between", value1, value2, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberUsernameNotBetween(String value1, String value2) {
            addCriterion("member_username not between", value1, value2, "memberUsername");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNull() {
            addCriterion("member_email is null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIsNotNull() {
            addCriterion("member_email is not null");
            return (Criteria) this;
        }

        public Criteria andMemberEmailEqualTo(String value) {
            addCriterion("member_email =", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotEqualTo(String value) {
            addCriterion("member_email <>", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThan(String value) {
            addCriterion("member_email >", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailGreaterThanOrEqualTo(String value) {
            addCriterion("member_email >=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThan(String value) {
            addCriterion("member_email <", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLessThanOrEqualTo(String value) {
            addCriterion("member_email <=", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailLike(String value) {
            addCriterion("member_email like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotLike(String value) {
            addCriterion("member_email not like", value, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailIn(List<String> values) {
            addCriterion("member_email in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotIn(List<String> values) {
            addCriterion("member_email not in", values, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailBetween(String value1, String value2) {
            addCriterion("member_email between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberEmailNotBetween(String value1, String value2) {
            addCriterion("member_email not between", value1, value2, "memberEmail");
            return (Criteria) this;
        }

        public Criteria andMemberAuthstatusIsNull() {
            addCriterion("member_authstatus is null");
            return (Criteria) this;
        }

        public Criteria andMemberAuthstatusIsNotNull() {
            addCriterion("member_authstatus is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAuthstatusEqualTo(Integer value) {
            addCriterion("member_authstatus =", value, "memberAuthstatus");
            return (Criteria) this;
        }

        public Criteria andMemberAuthstatusNotEqualTo(Integer value) {
            addCriterion("member_authstatus <>", value, "memberAuthstatus");
            return (Criteria) this;
        }

        public Criteria andMemberAuthstatusGreaterThan(Integer value) {
            addCriterion("member_authstatus >", value, "memberAuthstatus");
            return (Criteria) this;
        }

        public Criteria andMemberAuthstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_authstatus >=", value, "memberAuthstatus");
            return (Criteria) this;
        }

        public Criteria andMemberAuthstatusLessThan(Integer value) {
            addCriterion("member_authstatus <", value, "memberAuthstatus");
            return (Criteria) this;
        }

        public Criteria andMemberAuthstatusLessThanOrEqualTo(Integer value) {
            addCriterion("member_authstatus <=", value, "memberAuthstatus");
            return (Criteria) this;
        }

        public Criteria andMemberAuthstatusIn(List<Integer> values) {
            addCriterion("member_authstatus in", values, "memberAuthstatus");
            return (Criteria) this;
        }

        public Criteria andMemberAuthstatusNotIn(List<Integer> values) {
            addCriterion("member_authstatus not in", values, "memberAuthstatus");
            return (Criteria) this;
        }

        public Criteria andMemberAuthstatusBetween(Integer value1, Integer value2) {
            addCriterion("member_authstatus between", value1, value2, "memberAuthstatus");
            return (Criteria) this;
        }

        public Criteria andMemberAuthstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("member_authstatus not between", value1, value2, "memberAuthstatus");
            return (Criteria) this;
        }

        public Criteria andMemberUserTypeIsNull() {
            addCriterion("member_user_type is null");
            return (Criteria) this;
        }

        public Criteria andMemberUserTypeIsNotNull() {
            addCriterion("member_user_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberUserTypeEqualTo(Integer value) {
            addCriterion("member_user_type =", value, "memberUserType");
            return (Criteria) this;
        }

        public Criteria andMemberUserTypeNotEqualTo(Integer value) {
            addCriterion("member_user_type <>", value, "memberUserType");
            return (Criteria) this;
        }

        public Criteria andMemberUserTypeGreaterThan(Integer value) {
            addCriterion("member_user_type >", value, "memberUserType");
            return (Criteria) this;
        }

        public Criteria andMemberUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_user_type >=", value, "memberUserType");
            return (Criteria) this;
        }

        public Criteria andMemberUserTypeLessThan(Integer value) {
            addCriterion("member_user_type <", value, "memberUserType");
            return (Criteria) this;
        }

        public Criteria andMemberUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("member_user_type <=", value, "memberUserType");
            return (Criteria) this;
        }

        public Criteria andMemberUserTypeIn(List<Integer> values) {
            addCriterion("member_user_type in", values, "memberUserType");
            return (Criteria) this;
        }

        public Criteria andMemberUserTypeNotIn(List<Integer> values) {
            addCriterion("member_user_type not in", values, "memberUserType");
            return (Criteria) this;
        }

        public Criteria andMemberUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("member_user_type between", value1, value2, "memberUserType");
            return (Criteria) this;
        }

        public Criteria andMemberUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_user_type not between", value1, value2, "memberUserType");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameIsNull() {
            addCriterion("member_real_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameIsNotNull() {
            addCriterion("member_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameEqualTo(String value) {
            addCriterion("member_real_name =", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameNotEqualTo(String value) {
            addCriterion("member_real_name <>", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameGreaterThan(String value) {
            addCriterion("member_real_name >", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_real_name >=", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameLessThan(String value) {
            addCriterion("member_real_name <", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameLessThanOrEqualTo(String value) {
            addCriterion("member_real_name <=", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameLike(String value) {
            addCriterion("member_real_name like", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameNotLike(String value) {
            addCriterion("member_real_name not like", value, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameIn(List<String> values) {
            addCriterion("member_real_name in", values, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameNotIn(List<String> values) {
            addCriterion("member_real_name not in", values, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameBetween(String value1, String value2) {
            addCriterion("member_real_name between", value1, value2, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberRealNameNotBetween(String value1, String value2) {
            addCriterion("member_real_name not between", value1, value2, "memberRealName");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumberIsNull() {
            addCriterion("member_card_number is null");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumberIsNotNull() {
            addCriterion("member_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumberEqualTo(String value) {
            addCriterion("member_card_number =", value, "memberCardNumber");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumberNotEqualTo(String value) {
            addCriterion("member_card_number <>", value, "memberCardNumber");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumberGreaterThan(String value) {
            addCriterion("member_card_number >", value, "memberCardNumber");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("member_card_number >=", value, "memberCardNumber");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumberLessThan(String value) {
            addCriterion("member_card_number <", value, "memberCardNumber");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumberLessThanOrEqualTo(String value) {
            addCriterion("member_card_number <=", value, "memberCardNumber");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumberLike(String value) {
            addCriterion("member_card_number like", value, "memberCardNumber");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumberNotLike(String value) {
            addCriterion("member_card_number not like", value, "memberCardNumber");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumberIn(List<String> values) {
            addCriterion("member_card_number in", values, "memberCardNumber");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumberNotIn(List<String> values) {
            addCriterion("member_card_number not in", values, "memberCardNumber");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumberBetween(String value1, String value2) {
            addCriterion("member_card_number between", value1, value2, "memberCardNumber");
            return (Criteria) this;
        }

        public Criteria andMemberCardNumberNotBetween(String value1, String value2) {
            addCriterion("member_card_number not between", value1, value2, "memberCardNumber");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeIsNull() {
            addCriterion("member_account_type is null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeIsNotNull() {
            addCriterion("member_account_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeEqualTo(Integer value) {
            addCriterion("member_account_type =", value, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeNotEqualTo(Integer value) {
            addCriterion("member_account_type <>", value, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeGreaterThan(Integer value) {
            addCriterion("member_account_type >", value, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_account_type >=", value, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeLessThan(Integer value) {
            addCriterion("member_account_type <", value, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeLessThanOrEqualTo(Integer value) {
            addCriterion("member_account_type <=", value, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeIn(List<Integer> values) {
            addCriterion("member_account_type in", values, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeNotIn(List<Integer> values) {
            addCriterion("member_account_type not in", values, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeBetween(Integer value1, Integer value2) {
            addCriterion("member_account_type between", value1, value2, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_account_type not between", value1, value2, "memberAccountType");
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