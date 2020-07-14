package com.pz.crowd.entity.vo;

import java.io.Serializable;

public class ProjectLaunchMemberInfoVO implements Serializable {


    private Long memberId;

    private String memberSelfDescriptionSimple;

    private String memberSelfDescriptionDetail;

    private String memberPhoneNumber;

    private String servicePhoneNum;

    public ProjectLaunchMemberInfoVO(Long memberId, String memberSelfDescriptionSimple, String memberSelfDescriptionDetail, String memberPhoneNumber, String servicePhoneNum) {
        this.memberId = memberId;
        this.memberSelfDescriptionSimple = memberSelfDescriptionSimple;
        this.memberSelfDescriptionDetail = memberSelfDescriptionDetail;
        this.memberPhoneNumber = memberPhoneNumber;
        this.servicePhoneNum = servicePhoneNum;
    }

    public ProjectLaunchMemberInfoVO() {
    }

    public String getMemberSelfDescriptionSimple() {
        return memberSelfDescriptionSimple;
    }

    public void setMemberSelfDescriptionSimple(String memberSelfDescriptionSimple) {
        this.memberSelfDescriptionSimple = memberSelfDescriptionSimple;
    }

    public String getMemberSelfDescriptionDetail() {
        return memberSelfDescriptionDetail;
    }

    public void setMemberSelfDescriptionDetail(String memberSelfDescriptionDetail) {
        this.memberSelfDescriptionDetail = memberSelfDescriptionDetail;
    }

    public String getMemberPhoneNumber() {
        return memberPhoneNumber;
    }

    public void setMemberPhoneNumber(String memberPhoneNumber) {
        this.memberPhoneNumber = memberPhoneNumber;
    }

    public String getServicePhoneNum() {
        return servicePhoneNum;
    }

    public void setServicePhoneNum(String servicePhoneNum) {
        this.servicePhoneNum = servicePhoneNum;
    }

    @Override
    public String toString() {
        return "ProjectLaunchMemberInfoVO{" +
                "memberId=" + memberId +
                ", memberSelfDescriptionSimple='" + memberSelfDescriptionSimple + '\'' +
                ", memberSelfDescriptionDetail='" + memberSelfDescriptionDetail + '\'' +
                ", memberPhoneNumber='" + memberPhoneNumber + '\'' +
                ", servicePhoneNum='" + servicePhoneNum + '\'' +
                '}';
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
}
