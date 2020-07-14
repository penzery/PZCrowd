package com.pz.crowd.entity.po;

public class MemberPO {
    private Long memberId;

    private String memberAccount;

    private String memberPassword;

    private String memberUsername;

    private String memberEmail;

    private Integer memberAuthstatus;

    private Integer memberUserType;

    private String memberRealName;

    private String memberCardNumber;

    private Integer memberAccountType;

    public MemberPO() {
    }

    public MemberPO(Long memberId, String memberAccount, String memberPassword, String memberUsername, String memberEmail, Integer memberAuthstatus, Integer memberUserType, String memberRealName, String memberCardNumber, Integer memberAccountType) {
        this.memberId = memberId;
        this.memberAccount = memberAccount;
        this.memberPassword = memberPassword;
        this.memberUsername = memberUsername;
        this.memberEmail = memberEmail;
        this.memberAuthstatus = memberAuthstatus;
        this.memberUserType = memberUserType;
        this.memberRealName = memberRealName;
        this.memberCardNumber = memberCardNumber;
        this.memberAccountType = memberAccountType;
    }

    @Override
    public String toString() {
        return "MemberPO{" +
                "memberId=" + memberId +
                ", memberAccount='" + memberAccount + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberUsername='" + memberUsername + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberAuthstatus=" + memberAuthstatus +
                ", memberUserType=" + memberUserType +
                ", memberRealName='" + memberRealName + '\'' +
                ", memberCardNumber='" + memberCardNumber + '\'' +
                ", memberAccountType=" + memberAccountType +
                '}';
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount == null ? null : memberAccount.trim();
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword == null ? null : memberPassword.trim();
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername == null ? null : memberUsername.trim();
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail == null ? null : memberEmail.trim();
    }

    public Integer getMemberAuthstatus() {
        return memberAuthstatus;
    }

    public void setMemberAuthstatus(Integer memberAuthstatus) {
        this.memberAuthstatus = memberAuthstatus;
    }

    public Integer getMemberUserType() {
        return memberUserType;
    }

    public void setMemberUserType(Integer memberUserType) {
        this.memberUserType = memberUserType;
    }

    public String getMemberRealName() {
        return memberRealName;
    }

    public void setMemberRealName(String memberRealName) {
        this.memberRealName = memberRealName == null ? null : memberRealName.trim();
    }

    public String getMemberCardNumber() {
        return memberCardNumber;
    }

    public void setMemberCardNumber(String memberCardNumber) {
        this.memberCardNumber = memberCardNumber == null ? null : memberCardNumber.trim();
    }

    public Integer getMemberAccountType() {
        return memberAccountType;
    }

    public void setMemberAccountType(Integer memberAccountType) {
        this.memberAccountType = memberAccountType;
    }
}