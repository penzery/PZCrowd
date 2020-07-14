package com.pz.crowd.entity.vo;

import java.io.Serializable;

public class MemberLoginVO implements Serializable {
    private Long memberId;
    private String memberUsername;
    private String memberEmail;

    public MemberLoginVO() {
    }

    public MemberLoginVO(Long memberId, String memberUsername, String memberEmail) {
        this.memberId = memberId;
        this.memberUsername = memberUsername;
        this.memberEmail = memberEmail;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    @Override
    public String toString() {
        return "MemberLoginVO{" +
                "memberId=" + memberId +
                ", memberUsername='" + memberUsername + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                '}';
    }
}
