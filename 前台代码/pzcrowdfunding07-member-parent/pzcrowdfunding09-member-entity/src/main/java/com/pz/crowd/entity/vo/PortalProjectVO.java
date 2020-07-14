package com.pz.crowd.entity.vo;

import java.util.Date;

public class PortalProjectVO {
    private Long projectId;
    private String projectName;
    private String projectHeaderImgPath;
    private Date projectDeploydate;
    private Long projectFundingMoney;
    private Integer projectCompletion;
    private Integer projectSupporter;

    public PortalProjectVO(Long projectId, String projectName, String projectHeaderImgPath, Date projectDeploydate, Long projectFundingMoney, Integer projectCompletion, Integer projectSupporter) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectHeaderImgPath = projectHeaderImgPath;
        this.projectDeploydate = projectDeploydate;
        this.projectFundingMoney = projectFundingMoney;
        this.projectCompletion = projectCompletion;
        this.projectSupporter = projectSupporter;
    }

    public PortalProjectVO() {
    }

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
        this.projectName = projectName;
    }

    public String getProjectHeaderImgPath() {
        return projectHeaderImgPath;
    }

    public void setProjectHeaderImgPath(String projectHeaderImgPath) {
        this.projectHeaderImgPath = projectHeaderImgPath;
    }

    public Date getProjectDeploydate() {
        return projectDeploydate;
    }

    public void setProjectDeploydate(Date projectDeploydate) {
        this.projectDeploydate = projectDeploydate;
    }

    public Long getProjectFundingMoney() {
        return projectFundingMoney;
    }

    public void setProjectFundingMoney(Long projectFundingMoney) {
        this.projectFundingMoney = projectFundingMoney;
    }

    public Integer getProjectCompletion() {
        return projectCompletion;
    }

    public void setProjectCompletion(Integer projectCompletion) {
        this.projectCompletion = projectCompletion;
    }

    public Integer getProjectSupporter() {
        return projectSupporter;
    }

    public void setProjectSupporter(Integer projectSupporter) {
        this.projectSupporter = projectSupporter;
    }

    @Override
    public String toString() {
        return "PortalProjectVO{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectHeaderImgPath='" + projectHeaderImgPath + '\'' +
                ", projectDeploydate=" + projectDeploydate +
                ", projectFundingMoney=" + projectFundingMoney +
                ", projectCompletion=" + projectCompletion +
                ", projectSupporter=" + projectSupporter +
                '}';
    }
}
