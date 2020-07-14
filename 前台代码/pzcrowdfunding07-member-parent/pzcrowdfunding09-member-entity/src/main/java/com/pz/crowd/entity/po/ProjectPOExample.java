package com.pz.crowd.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectPOExample() {
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

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionIsNull() {
            addCriterion("project_description is null");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionIsNotNull() {
            addCriterion("project_description is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionEqualTo(String value) {
            addCriterion("project_description =", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotEqualTo(String value) {
            addCriterion("project_description <>", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionGreaterThan(String value) {
            addCriterion("project_description >", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("project_description >=", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLessThan(String value) {
            addCriterion("project_description <", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLessThanOrEqualTo(String value) {
            addCriterion("project_description <=", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionLike(String value) {
            addCriterion("project_description like", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotLike(String value) {
            addCriterion("project_description not like", value, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionIn(List<String> values) {
            addCriterion("project_description in", values, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotIn(List<String> values) {
            addCriterion("project_description not in", values, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionBetween(String value1, String value2) {
            addCriterion("project_description between", value1, value2, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectDescriptionNotBetween(String value1, String value2) {
            addCriterion("project_description not between", value1, value2, "projectDescription");
            return (Criteria) this;
        }

        public Criteria andProjectFundingMoneyIsNull() {
            addCriterion("project_funding_money is null");
            return (Criteria) this;
        }

        public Criteria andProjectFundingMoneyIsNotNull() {
            addCriterion("project_funding_money is not null");
            return (Criteria) this;
        }

        public Criteria andProjectFundingMoneyEqualTo(Long value) {
            addCriterion("project_funding_money =", value, "projectFundingMoney");
            return (Criteria) this;
        }

        public Criteria andProjectFundingMoneyNotEqualTo(Long value) {
            addCriterion("project_funding_money <>", value, "projectFundingMoney");
            return (Criteria) this;
        }

        public Criteria andProjectFundingMoneyGreaterThan(Long value) {
            addCriterion("project_funding_money >", value, "projectFundingMoney");
            return (Criteria) this;
        }

        public Criteria andProjectFundingMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("project_funding_money >=", value, "projectFundingMoney");
            return (Criteria) this;
        }

        public Criteria andProjectFundingMoneyLessThan(Long value) {
            addCriterion("project_funding_money <", value, "projectFundingMoney");
            return (Criteria) this;
        }

        public Criteria andProjectFundingMoneyLessThanOrEqualTo(Long value) {
            addCriterion("project_funding_money <=", value, "projectFundingMoney");
            return (Criteria) this;
        }

        public Criteria andProjectFundingMoneyIn(List<Long> values) {
            addCriterion("project_funding_money in", values, "projectFundingMoney");
            return (Criteria) this;
        }

        public Criteria andProjectFundingMoneyNotIn(List<Long> values) {
            addCriterion("project_funding_money not in", values, "projectFundingMoney");
            return (Criteria) this;
        }

        public Criteria andProjectFundingMoneyBetween(Long value1, Long value2) {
            addCriterion("project_funding_money between", value1, value2, "projectFundingMoney");
            return (Criteria) this;
        }

        public Criteria andProjectFundingMoneyNotBetween(Long value1, Long value2) {
            addCriterion("project_funding_money not between", value1, value2, "projectFundingMoney");
            return (Criteria) this;
        }

        public Criteria andProjectFundingDayIsNull() {
            addCriterion("project_funding_day is null");
            return (Criteria) this;
        }

        public Criteria andProjectFundingDayIsNotNull() {
            addCriterion("project_funding_day is not null");
            return (Criteria) this;
        }

        public Criteria andProjectFundingDayEqualTo(Integer value) {
            addCriterion("project_funding_day =", value, "projectFundingDay");
            return (Criteria) this;
        }

        public Criteria andProjectFundingDayNotEqualTo(Integer value) {
            addCriterion("project_funding_day <>", value, "projectFundingDay");
            return (Criteria) this;
        }

        public Criteria andProjectFundingDayGreaterThan(Integer value) {
            addCriterion("project_funding_day >", value, "projectFundingDay");
            return (Criteria) this;
        }

        public Criteria andProjectFundingDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_funding_day >=", value, "projectFundingDay");
            return (Criteria) this;
        }

        public Criteria andProjectFundingDayLessThan(Integer value) {
            addCriterion("project_funding_day <", value, "projectFundingDay");
            return (Criteria) this;
        }

        public Criteria andProjectFundingDayLessThanOrEqualTo(Integer value) {
            addCriterion("project_funding_day <=", value, "projectFundingDay");
            return (Criteria) this;
        }

        public Criteria andProjectFundingDayIn(List<Integer> values) {
            addCriterion("project_funding_day in", values, "projectFundingDay");
            return (Criteria) this;
        }

        public Criteria andProjectFundingDayNotIn(List<Integer> values) {
            addCriterion("project_funding_day not in", values, "projectFundingDay");
            return (Criteria) this;
        }

        public Criteria andProjectFundingDayBetween(Integer value1, Integer value2) {
            addCriterion("project_funding_day between", value1, value2, "projectFundingDay");
            return (Criteria) this;
        }

        public Criteria andProjectFundingDayNotBetween(Integer value1, Integer value2) {
            addCriterion("project_funding_day not between", value1, value2, "projectFundingDay");
            return (Criteria) this;
        }

        public Criteria andProjectHeaderImgPathIsNull() {
            addCriterion("project_header_img_path is null");
            return (Criteria) this;
        }

        public Criteria andProjectHeaderImgPathIsNotNull() {
            addCriterion("project_header_img_path is not null");
            return (Criteria) this;
        }

        public Criteria andProjectHeaderImgPathEqualTo(String value) {
            addCriterion("project_header_img_path =", value, "projectHeaderImgPath");
            return (Criteria) this;
        }

        public Criteria andProjectHeaderImgPathNotEqualTo(String value) {
            addCriterion("project_header_img_path <>", value, "projectHeaderImgPath");
            return (Criteria) this;
        }

        public Criteria andProjectHeaderImgPathGreaterThan(String value) {
            addCriterion("project_header_img_path >", value, "projectHeaderImgPath");
            return (Criteria) this;
        }

        public Criteria andProjectHeaderImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("project_header_img_path >=", value, "projectHeaderImgPath");
            return (Criteria) this;
        }

        public Criteria andProjectHeaderImgPathLessThan(String value) {
            addCriterion("project_header_img_path <", value, "projectHeaderImgPath");
            return (Criteria) this;
        }

        public Criteria andProjectHeaderImgPathLessThanOrEqualTo(String value) {
            addCriterion("project_header_img_path <=", value, "projectHeaderImgPath");
            return (Criteria) this;
        }

        public Criteria andProjectHeaderImgPathLike(String value) {
            addCriterion("project_header_img_path like", value, "projectHeaderImgPath");
            return (Criteria) this;
        }

        public Criteria andProjectHeaderImgPathNotLike(String value) {
            addCriterion("project_header_img_path not like", value, "projectHeaderImgPath");
            return (Criteria) this;
        }

        public Criteria andProjectHeaderImgPathIn(List<String> values) {
            addCriterion("project_header_img_path in", values, "projectHeaderImgPath");
            return (Criteria) this;
        }

        public Criteria andProjectHeaderImgPathNotIn(List<String> values) {
            addCriterion("project_header_img_path not in", values, "projectHeaderImgPath");
            return (Criteria) this;
        }

        public Criteria andProjectHeaderImgPathBetween(String value1, String value2) {
            addCriterion("project_header_img_path between", value1, value2, "projectHeaderImgPath");
            return (Criteria) this;
        }

        public Criteria andProjectHeaderImgPathNotBetween(String value1, String value2) {
            addCriterion("project_header_img_path not between", value1, value2, "projectHeaderImgPath");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNull() {
            addCriterion("project_status is null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIsNotNull() {
            addCriterion("project_status is not null");
            return (Criteria) this;
        }

        public Criteria andProjectStatusEqualTo(Integer value) {
            addCriterion("project_status =", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotEqualTo(Integer value) {
            addCriterion("project_status <>", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThan(Integer value) {
            addCriterion("project_status >", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_status >=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThan(Integer value) {
            addCriterion("project_status <", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusLessThanOrEqualTo(Integer value) {
            addCriterion("project_status <=", value, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusIn(List<Integer> values) {
            addCriterion("project_status in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotIn(List<Integer> values) {
            addCriterion("project_status not in", values, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusBetween(Integer value1, Integer value2) {
            addCriterion("project_status between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("project_status not between", value1, value2, "projectStatus");
            return (Criteria) this;
        }

        public Criteria andProjectDeploydateIsNull() {
            addCriterion("project_deploydate is null");
            return (Criteria) this;
        }

        public Criteria andProjectDeploydateIsNotNull() {
            addCriterion("project_deploydate is not null");
            return (Criteria) this;
        }

        public Criteria andProjectDeploydateEqualTo(Date value) {
            addCriterion("project_deploydate =", value, "projectDeploydate");
            return (Criteria) this;
        }

        public Criteria andProjectDeploydateNotEqualTo(Date value) {
            addCriterion("project_deploydate <>", value, "projectDeploydate");
            return (Criteria) this;
        }

        public Criteria andProjectDeploydateGreaterThan(Date value) {
            addCriterion("project_deploydate >", value, "projectDeploydate");
            return (Criteria) this;
        }

        public Criteria andProjectDeploydateGreaterThanOrEqualTo(Date value) {
            addCriterion("project_deploydate >=", value, "projectDeploydate");
            return (Criteria) this;
        }

        public Criteria andProjectDeploydateLessThan(Date value) {
            addCriterion("project_deploydate <", value, "projectDeploydate");
            return (Criteria) this;
        }

        public Criteria andProjectDeploydateLessThanOrEqualTo(Date value) {
            addCriterion("project_deploydate <=", value, "projectDeploydate");
            return (Criteria) this;
        }

        public Criteria andProjectDeploydateIn(List<Date> values) {
            addCriterion("project_deploydate in", values, "projectDeploydate");
            return (Criteria) this;
        }

        public Criteria andProjectDeploydateNotIn(List<Date> values) {
            addCriterion("project_deploydate not in", values, "projectDeploydate");
            return (Criteria) this;
        }

        public Criteria andProjectDeploydateBetween(Date value1, Date value2) {
            addCriterion("project_deploydate between", value1, value2, "projectDeploydate");
            return (Criteria) this;
        }

        public Criteria andProjectDeploydateNotBetween(Date value1, Date value2) {
            addCriterion("project_deploydate not between", value1, value2, "projectDeploydate");
            return (Criteria) this;
        }

        public Criteria andProjectSupportMoneyIsNull() {
            addCriterion("project_support_money is null");
            return (Criteria) this;
        }

        public Criteria andProjectSupportMoneyIsNotNull() {
            addCriterion("project_support_money is not null");
            return (Criteria) this;
        }

        public Criteria andProjectSupportMoneyEqualTo(Long value) {
            addCriterion("project_support_money =", value, "projectSupportMoney");
            return (Criteria) this;
        }

        public Criteria andProjectSupportMoneyNotEqualTo(Long value) {
            addCriterion("project_support_money <>", value, "projectSupportMoney");
            return (Criteria) this;
        }

        public Criteria andProjectSupportMoneyGreaterThan(Long value) {
            addCriterion("project_support_money >", value, "projectSupportMoney");
            return (Criteria) this;
        }

        public Criteria andProjectSupportMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("project_support_money >=", value, "projectSupportMoney");
            return (Criteria) this;
        }

        public Criteria andProjectSupportMoneyLessThan(Long value) {
            addCriterion("project_support_money <", value, "projectSupportMoney");
            return (Criteria) this;
        }

        public Criteria andProjectSupportMoneyLessThanOrEqualTo(Long value) {
            addCriterion("project_support_money <=", value, "projectSupportMoney");
            return (Criteria) this;
        }

        public Criteria andProjectSupportMoneyIn(List<Long> values) {
            addCriterion("project_support_money in", values, "projectSupportMoney");
            return (Criteria) this;
        }

        public Criteria andProjectSupportMoneyNotIn(List<Long> values) {
            addCriterion("project_support_money not in", values, "projectSupportMoney");
            return (Criteria) this;
        }

        public Criteria andProjectSupportMoneyBetween(Long value1, Long value2) {
            addCriterion("project_support_money between", value1, value2, "projectSupportMoney");
            return (Criteria) this;
        }

        public Criteria andProjectSupportMoneyNotBetween(Long value1, Long value2) {
            addCriterion("project_support_money not between", value1, value2, "projectSupportMoney");
            return (Criteria) this;
        }

        public Criteria andProjectSupporterIsNull() {
            addCriterion("project_supporter is null");
            return (Criteria) this;
        }

        public Criteria andProjectSupporterIsNotNull() {
            addCriterion("project_supporter is not null");
            return (Criteria) this;
        }

        public Criteria andProjectSupporterEqualTo(Integer value) {
            addCriterion("project_supporter =", value, "projectSupporter");
            return (Criteria) this;
        }

        public Criteria andProjectSupporterNotEqualTo(Integer value) {
            addCriterion("project_supporter <>", value, "projectSupporter");
            return (Criteria) this;
        }

        public Criteria andProjectSupporterGreaterThan(Integer value) {
            addCriterion("project_supporter >", value, "projectSupporter");
            return (Criteria) this;
        }

        public Criteria andProjectSupporterGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_supporter >=", value, "projectSupporter");
            return (Criteria) this;
        }

        public Criteria andProjectSupporterLessThan(Integer value) {
            addCriterion("project_supporter <", value, "projectSupporter");
            return (Criteria) this;
        }

        public Criteria andProjectSupporterLessThanOrEqualTo(Integer value) {
            addCriterion("project_supporter <=", value, "projectSupporter");
            return (Criteria) this;
        }

        public Criteria andProjectSupporterIn(List<Integer> values) {
            addCriterion("project_supporter in", values, "projectSupporter");
            return (Criteria) this;
        }

        public Criteria andProjectSupporterNotIn(List<Integer> values) {
            addCriterion("project_supporter not in", values, "projectSupporter");
            return (Criteria) this;
        }

        public Criteria andProjectSupporterBetween(Integer value1, Integer value2) {
            addCriterion("project_supporter between", value1, value2, "projectSupporter");
            return (Criteria) this;
        }

        public Criteria andProjectSupporterNotBetween(Integer value1, Integer value2) {
            addCriterion("project_supporter not between", value1, value2, "projectSupporter");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionIsNull() {
            addCriterion("project_completion is null");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionIsNotNull() {
            addCriterion("project_completion is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionEqualTo(Integer value) {
            addCriterion("project_completion =", value, "projectCompletion");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionNotEqualTo(Integer value) {
            addCriterion("project_completion <>", value, "projectCompletion");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionGreaterThan(Integer value) {
            addCriterion("project_completion >", value, "projectCompletion");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_completion >=", value, "projectCompletion");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionLessThan(Integer value) {
            addCriterion("project_completion <", value, "projectCompletion");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionLessThanOrEqualTo(Integer value) {
            addCriterion("project_completion <=", value, "projectCompletion");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionIn(List<Integer> values) {
            addCriterion("project_completion in", values, "projectCompletion");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionNotIn(List<Integer> values) {
            addCriterion("project_completion not in", values, "projectCompletion");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionBetween(Integer value1, Integer value2) {
            addCriterion("project_completion between", value1, value2, "projectCompletion");
            return (Criteria) this;
        }

        public Criteria andProjectCompletionNotBetween(Integer value1, Integer value2) {
            addCriterion("project_completion not between", value1, value2, "projectCompletion");
            return (Criteria) this;
        }

        public Criteria andProjectMemberIdIsNull() {
            addCriterion("project_member_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectMemberIdIsNotNull() {
            addCriterion("project_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectMemberIdEqualTo(Long value) {
            addCriterion("project_member_id =", value, "projectMemberId");
            return (Criteria) this;
        }

        public Criteria andProjectMemberIdNotEqualTo(Long value) {
            addCriterion("project_member_id <>", value, "projectMemberId");
            return (Criteria) this;
        }

        public Criteria andProjectMemberIdGreaterThan(Long value) {
            addCriterion("project_member_id >", value, "projectMemberId");
            return (Criteria) this;
        }

        public Criteria andProjectMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("project_member_id >=", value, "projectMemberId");
            return (Criteria) this;
        }

        public Criteria andProjectMemberIdLessThan(Long value) {
            addCriterion("project_member_id <", value, "projectMemberId");
            return (Criteria) this;
        }

        public Criteria andProjectMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("project_member_id <=", value, "projectMemberId");
            return (Criteria) this;
        }

        public Criteria andProjectMemberIdIn(List<Long> values) {
            addCriterion("project_member_id in", values, "projectMemberId");
            return (Criteria) this;
        }

        public Criteria andProjectMemberIdNotIn(List<Long> values) {
            addCriterion("project_member_id not in", values, "projectMemberId");
            return (Criteria) this;
        }

        public Criteria andProjectMemberIdBetween(Long value1, Long value2) {
            addCriterion("project_member_id between", value1, value2, "projectMemberId");
            return (Criteria) this;
        }

        public Criteria andProjectMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("project_member_id not between", value1, value2, "projectMemberId");
            return (Criteria) this;
        }

        public Criteria andProjectCreatedateIsNull() {
            addCriterion("project_createdate is null");
            return (Criteria) this;
        }

        public Criteria andProjectCreatedateIsNotNull() {
            addCriterion("project_createdate is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCreatedateEqualTo(Date value) {
            addCriterion("project_createdate =", value, "projectCreatedate");
            return (Criteria) this;
        }

        public Criteria andProjectCreatedateNotEqualTo(Date value) {
            addCriterion("project_createdate <>", value, "projectCreatedate");
            return (Criteria) this;
        }

        public Criteria andProjectCreatedateGreaterThan(Date value) {
            addCriterion("project_createdate >", value, "projectCreatedate");
            return (Criteria) this;
        }

        public Criteria andProjectCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("project_createdate >=", value, "projectCreatedate");
            return (Criteria) this;
        }

        public Criteria andProjectCreatedateLessThan(Date value) {
            addCriterion("project_createdate <", value, "projectCreatedate");
            return (Criteria) this;
        }

        public Criteria andProjectCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("project_createdate <=", value, "projectCreatedate");
            return (Criteria) this;
        }

        public Criteria andProjectCreatedateIn(List<Date> values) {
            addCriterion("project_createdate in", values, "projectCreatedate");
            return (Criteria) this;
        }

        public Criteria andProjectCreatedateNotIn(List<Date> values) {
            addCriterion("project_createdate not in", values, "projectCreatedate");
            return (Criteria) this;
        }

        public Criteria andProjectCreatedateBetween(Date value1, Date value2) {
            addCriterion("project_createdate between", value1, value2, "projectCreatedate");
            return (Criteria) this;
        }

        public Criteria andProjectCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("project_createdate not between", value1, value2, "projectCreatedate");
            return (Criteria) this;
        }

        public Criteria andProjectFollowerIsNull() {
            addCriterion("project_follower is null");
            return (Criteria) this;
        }

        public Criteria andProjectFollowerIsNotNull() {
            addCriterion("project_follower is not null");
            return (Criteria) this;
        }

        public Criteria andProjectFollowerEqualTo(Integer value) {
            addCriterion("project_follower =", value, "projectFollower");
            return (Criteria) this;
        }

        public Criteria andProjectFollowerNotEqualTo(Integer value) {
            addCriterion("project_follower <>", value, "projectFollower");
            return (Criteria) this;
        }

        public Criteria andProjectFollowerGreaterThan(Integer value) {
            addCriterion("project_follower >", value, "projectFollower");
            return (Criteria) this;
        }

        public Criteria andProjectFollowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_follower >=", value, "projectFollower");
            return (Criteria) this;
        }

        public Criteria andProjectFollowerLessThan(Integer value) {
            addCriterion("project_follower <", value, "projectFollower");
            return (Criteria) this;
        }

        public Criteria andProjectFollowerLessThanOrEqualTo(Integer value) {
            addCriterion("project_follower <=", value, "projectFollower");
            return (Criteria) this;
        }

        public Criteria andProjectFollowerIn(List<Integer> values) {
            addCriterion("project_follower in", values, "projectFollower");
            return (Criteria) this;
        }

        public Criteria andProjectFollowerNotIn(List<Integer> values) {
            addCriterion("project_follower not in", values, "projectFollower");
            return (Criteria) this;
        }

        public Criteria andProjectFollowerBetween(Integer value1, Integer value2) {
            addCriterion("project_follower between", value1, value2, "projectFollower");
            return (Criteria) this;
        }

        public Criteria andProjectFollowerNotBetween(Integer value1, Integer value2) {
            addCriterion("project_follower not between", value1, value2, "projectFollower");
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