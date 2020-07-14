package com.pz.crowd.entity.vo;

import java.util.Date;
import java.util.List;

public class DetailProjectVO {
    private Long projectId;
    private String projectName;
    private String projectDescription;
    private Integer projectFollower;
    private Long projectFundingMoney;
    private Long projectSupportMoney;
    private Integer projectCompletion;
    private Date projectDeployDate;
    private Integer projectSupporter;
    private String projectHeaderImgPath;
    private List<String> projectDetailedImgPathList;
    private List<DetailReturnVO> detailReturnVOList;

    public DetailProjectVO(Long projectId, String projectName, String projectDescription, Integer projectFollower, Long projectFundingMoney, Long projectSupportMoney, Integer projectCompletion, Date projectDeployDate, Integer projectSupporter, String projectHeaderImgPath, List<String> projectDetailedImgPathList, List<DetailReturnVO> detailReturnVOList) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectFollower = projectFollower;
        this.projectFundingMoney = projectFundingMoney;
        this.projectSupportMoney = projectSupportMoney;
        this.projectCompletion = projectCompletion;
        this.projectDeployDate = projectDeployDate;
        this.projectSupporter = projectSupporter;
        this.projectHeaderImgPath = projectHeaderImgPath;
        this.projectDetailedImgPathList = projectDetailedImgPathList;
        this.detailReturnVOList = detailReturnVOList;
    }

    public DetailProjectVO() {
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

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public Integer getProjectFollower() {
        return projectFollower;
    }

    public void setProjectFollower(Integer projectFollower) {
        this.projectFollower = projectFollower;
    }

    public Long getProjectFundingMoney() {
        return projectFundingMoney;
    }

    public void setProjectFundingMoney(Long projectFundingMoney) {
        this.projectFundingMoney = projectFundingMoney;
    }

    public Long getProjectSupportMoney() {
        return projectSupportMoney;
    }

    public void setProjectSupportMoney(Long projectSupportMoney) {
        this.projectSupportMoney = projectSupportMoney;
    }

    public Integer getProjectCompletion() {
        return projectCompletion;
    }

    public void setProjectCompletion(Integer projectCompletion) {
        this.projectCompletion = projectCompletion;
    }

    public Date getProjectDeployDate() {
        return projectDeployDate;
    }

    public void setProjectDeployDate(Date projectDeployDate) {
        this.projectDeployDate = projectDeployDate;
    }

    public Integer getProjectSupporter() {
        return projectSupporter;
    }

    public void setProjectSupporter(Integer projectSupporter) {
        this.projectSupporter = projectSupporter;
    }

    public String getProjectHeaderImgPath() {
        return projectHeaderImgPath;
    }

    public void setProjectHeaderImgPath(String projectHeaderImgPath) {
        this.projectHeaderImgPath = projectHeaderImgPath;
    }

    public List<String> getProjectDetailedImgPathList() {
        return projectDetailedImgPathList;
    }

    public void setProjectDetailedImgPathList(List<String> projectDetailedImgPathList) {
        this.projectDetailedImgPathList = projectDetailedImgPathList;
    }

    public List<DetailReturnVO> getDetailReturnVOList() {
        return detailReturnVOList;
    }

    public void setDetailReturnVOList(List<DetailReturnVO> detailReturnVOList) {
        this.detailReturnVOList = detailReturnVOList;
    }

    @Override
    public String toString() {
        return "DetailProjectVO{" +
                "projectId=" + projectId +
                ", projectName='" + projectName + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", projectFollower=" + projectFollower +
                ", projectFundingMoney=" + projectFundingMoney +
                ", projectSupportMoney=" + projectSupportMoney +
                ", projectCompletion=" + projectCompletion +
                ", projectDeployDate=" + projectDeployDate +
                ", projectSupporter=" + projectSupporter +
                ", projectHeaderImgPath='" + projectHeaderImgPath + '\'' +
                ", projectDetailedImgPathList=" + projectDetailedImgPathList +
                ", detailReturnVOList=" + detailReturnVOList +
                '}';
    }
}
