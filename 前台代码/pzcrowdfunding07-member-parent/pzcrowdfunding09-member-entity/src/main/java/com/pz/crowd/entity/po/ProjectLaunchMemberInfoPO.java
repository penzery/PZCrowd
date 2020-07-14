package com.pz.crowd.entity.po;

public class ProjectLaunchMemberInfoPO {
    private Long id;

    private Long projectId;

    private Long memberId;

    private String memberSelfDescriptionSimple;

    private String memberSelfDescriptionDetail;

    private String memberPhoneNumber;

    private String servicePhoneNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberSelfDescriptionSimple() {
        return memberSelfDescriptionSimple;
    }

    public void setMemberSelfDescriptionSimple(String memberSelfDescriptionSimple) {
        this.memberSelfDescriptionSimple = memberSelfDescriptionSimple == null ? null : memberSelfDescriptionSimple.trim();
    }

    public String getMemberSelfDescriptionDetail() {
        return memberSelfDescriptionDetail;
    }

    public void setMemberSelfDescriptionDetail(String memberSelfDescriptionDetail) {
        this.memberSelfDescriptionDetail = memberSelfDescriptionDetail == null ? null : memberSelfDescriptionDetail.trim();
    }

    public String getMemberPhoneNumber() {
        return memberPhoneNumber;
    }

    public void setMemberPhoneNumber(String memberPhoneNumber) {
        this.memberPhoneNumber = memberPhoneNumber == null ? null : memberPhoneNumber.trim();
    }

    public String getServicePhoneNum() {
        return servicePhoneNum;
    }

    public void setServicePhoneNum(String servicePhoneNum) {
        this.servicePhoneNum = servicePhoneNum == null ? null : servicePhoneNum.trim();
    }
}