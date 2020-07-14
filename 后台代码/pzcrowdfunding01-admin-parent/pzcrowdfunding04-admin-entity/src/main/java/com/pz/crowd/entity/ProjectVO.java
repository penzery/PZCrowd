package com.pz.crowd.entity;

import java.util.Date;

public class ProjectVO {
    private String projectName;
    private String memberName;
    private Long projectFundingMoney;
    private Integer projectFundingDay;
    private Date projectCreatedate;

    public ProjectVO() {
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public Long getProjectFundingMoney() {
        return projectFundingMoney;
    }

    public void setProjectFundingMoney(Long projectFundingMoney) {
        this.projectFundingMoney = projectFundingMoney;
    }

    public Integer getProjectFundingDay() {
        return projectFundingDay;
    }

    public void setProjectFundingDay(Integer projectFundingDay) {
        this.projectFundingDay = projectFundingDay;
    }

    public Date getProjectCreatedate() {
        return projectCreatedate;
    }

    public void setProjectCreatedate(Date projectCreatedate) {
        this.projectCreatedate = projectCreatedate;
    }
}
