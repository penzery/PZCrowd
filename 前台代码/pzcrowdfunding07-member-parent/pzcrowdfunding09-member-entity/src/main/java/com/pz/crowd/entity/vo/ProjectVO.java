package com.pz.crowd.entity.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ProjectVO implements Serializable {
    private List<Long> typeIdList;
    private List<Long> tagIdList;
    private String projectName;
    private String projectDescription;
    private Long projectFundingMoney;
    private Integer projectFundingDay;
    private Date projectCreatedate;
    private String projectHeaderImgPath;
    private List<String> projectDetailedImgPathList;
    private ProjectLaunchMemberInfoVO projectLaunchMemberInfoVO;
    private List<ProjectReturnInfoVO> projectReturnInfoVOList;
    private ProjectLaunchMemberConfirmInfoVO projectLaunchMemberConfirmInfoVO;

    public ProjectVO() {
    }

    public ProjectVO(List<Long> typeIdList, List<Long> tagIdList, String projectName, String projectDescription, Long projectFundingMoney, Integer projectFundingDay, Date projectCreatedate, String projectHeaderImgPath, List<String> projectDetailedImgPathList, ProjectLaunchMemberInfoVO projectLaunchMemberInfoVO, List<ProjectReturnInfoVO> projectReturnInfoVOList, ProjectLaunchMemberConfirmInfoVO projectLaunchMemberConfirmInfoVO) {
        this.typeIdList = typeIdList;
        this.tagIdList = tagIdList;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectFundingMoney = projectFundingMoney;
        this.projectFundingDay = projectFundingDay;
        this.projectCreatedate = projectCreatedate;
        this.projectHeaderImgPath = projectHeaderImgPath;
        this.projectDetailedImgPathList = projectDetailedImgPathList;
        this.projectLaunchMemberInfoVO = projectLaunchMemberInfoVO;
        this.projectReturnInfoVOList = projectReturnInfoVOList;
        this.projectLaunchMemberConfirmInfoVO = projectLaunchMemberConfirmInfoVO;
    }

    public List<Long> getTypeIdList() {
        return typeIdList;
    }

    public void setTypeIdList(List<Long> typeIdList) {
        this.typeIdList = typeIdList;
    }

    public List<Long> getTagIdList() {
        return tagIdList;
    }

    public void setTagIdList(List<Long> tagIdList) {
        this.tagIdList = tagIdList;
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

    public ProjectLaunchMemberInfoVO getProjectLaunchMemberInfoVO() {
        return projectLaunchMemberInfoVO;
    }

    public void setProjectLaunchMemberInfoVO(ProjectLaunchMemberInfoVO projectLaunchMemberInfoVO) {
        this.projectLaunchMemberInfoVO = projectLaunchMemberInfoVO;
    }

    public List<ProjectReturnInfoVO> getProjectReturnInfoVOList() {
        return projectReturnInfoVOList;
    }

    public void setProjectReturnInfoVOList(List<ProjectReturnInfoVO> projectReturnInfoVOList) {
        this.projectReturnInfoVOList = projectReturnInfoVOList;
    }

    public ProjectLaunchMemberConfirmInfoVO getProjectLaunchMemberConfirmInfoVO() {
        return projectLaunchMemberConfirmInfoVO;
    }

    public void setProjectLaunchMemberConfirmInfoVO(ProjectLaunchMemberConfirmInfoVO projectLaunchMemberConfirmInfoVO) {
        this.projectLaunchMemberConfirmInfoVO = projectLaunchMemberConfirmInfoVO;
    }

    @Override
    public String toString() {
        return "ProjectVO{" +
                "typeIdList=" + typeIdList +
                ", tagIdList=" + tagIdList +
                ", projectName='" + projectName + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", projectFundingMoney=" + projectFundingMoney +
                ", projectFundingDay=" + projectFundingDay +
                ", projectCreatedate=" + projectCreatedate +
                ", projectHeaderImgPath='" + projectHeaderImgPath + '\'' +
                ", projectDetailedImgPathList=" + projectDetailedImgPathList +
                ", projectLaunchMemberInfoVO=" + projectLaunchMemberInfoVO +
                ", projectReturnInfoVOList=" + projectReturnInfoVOList +
                ", projectLaunchMemberConfirmInfoVO=" + projectLaunchMemberConfirmInfoVO +
                '}';
    }
}
