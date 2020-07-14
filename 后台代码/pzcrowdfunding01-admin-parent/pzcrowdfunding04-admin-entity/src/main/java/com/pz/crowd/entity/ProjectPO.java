package com.pz.crowd.entity;

import java.util.Date;

public class ProjectPO {
    private Long projectId;

    private String projectName;

    private String projectDescription;

    private Long projectFundingMoney;

    private Integer projectFundingDay;

    private String projectHeaderImgPath;

    private Integer projectStatus;

    private Date projectDeploydate;

    private Long projectSupportMoney;

    private Integer projectSupporter;

    private Integer projectCompletion;

    private Long projectMemberId;

    private Date projectCreatedate;

    private Integer projectFollower;

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription == null ? null : projectDescription.trim();
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

    public String getProjectHeaderImgPath() {
        return projectHeaderImgPath;
    }

    public void setProjectHeaderImgPath(String projectHeaderImgPath) {
        this.projectHeaderImgPath = projectHeaderImgPath == null ? null : projectHeaderImgPath.trim();
    }

    public Integer getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(Integer projectStatus) {
        this.projectStatus = projectStatus;
    }

    public Date getProjectDeploydate() {
        return projectDeploydate;
    }

    public void setProjectDeploydate(Date projectDeploydate) {
        this.projectDeploydate = projectDeploydate;
    }

    public Long getProjectSupportMoney() {
        return projectSupportMoney;
    }

    public void setProjectSupportMoney(Long projectSupportMoney) {
        this.projectSupportMoney = projectSupportMoney;
    }

    public Integer getProjectSupporter() {
        return projectSupporter;
    }

    public void setProjectSupporter(Integer projectSupporter) {
        this.projectSupporter = projectSupporter;
    }

    public Integer getProjectCompletion() {
        return projectCompletion;
    }

    public void setProjectCompletion(Integer projectCompletion) {
        this.projectCompletion = projectCompletion;
    }

    public Long getProjectMemberId() {
        return projectMemberId;
    }

    public void setProjectMemberId(Long projectMemberId) {
        this.projectMemberId = projectMemberId;
    }

    public Date getProjectCreatedate() {
        return projectCreatedate;
    }

    public void setProjectCreatedate(Date projectCreatedate) {
        this.projectCreatedate = projectCreatedate;
    }

    public Integer getProjectFollower() {
        return projectFollower;
    }

    public void setProjectFollower(Integer projectFollower) {
        this.projectFollower = projectFollower;
    }

    @Override
    public String toString() {
        return "ProjectPO{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", projectFundingMoney=" + projectFundingMoney +
                ", projectFundingDay=" + projectFundingDay +
                ", projectHeaderImgPath='" + projectHeaderImgPath + '\'' +
                ", projectStatus=" + projectStatus +
                ", projectDeploydate=" + projectDeploydate +
                ", projectSupportMoney=" + projectSupportMoney +
                ", projectSupporter=" + projectSupporter +
                ", projectCompletion=" + projectCompletion +
                ", projectMemberId=" + projectMemberId +
                ", projectCreatedate=" + projectCreatedate +
                ", projectFollower=" + projectFollower +
                '}';
    }
}