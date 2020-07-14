package com.pz.crowd.entity.po;

public class ProjectLaunchMemberConfirmInfoPO {
    private Long id;

    private Long memberId;

    private String memberPayNum;

    private String memberCardNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberPayNum() {
        return memberPayNum;
    }

    public void setMemberPayNum(String memberPayNum) {
        this.memberPayNum = memberPayNum == null ? null : memberPayNum.trim();
    }

    public String getMemberCardNum() {
        return memberCardNum;
    }

    public void setMemberCardNum(String memberCardNum) {
        this.memberCardNum = memberCardNum == null ? null : memberCardNum.trim();
    }
}