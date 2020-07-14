package com.pz.crowd.entity.vo;

import java.io.Serializable;

public class MemberVO implements Serializable {
    private String memberAccount;
    private String memberUsername;
    private String memberPassword;
    private String passwordRepeat;
    private String memberEmail;
    private String memberPhoneNum;
    private String identifyingCord;

    public MemberVO() {
    }

    public MemberVO(String memberAccount, String memberUsername, String memberPassword, String passwordRepeat, String memberEmail, String memberPhoneNum, String identifyingCord) {
        this.memberAccount = memberAccount;
        this.memberUsername = memberUsername;
        this.memberPassword = memberPassword;
        this.passwordRepeat = passwordRepeat;
        this.memberEmail = memberEmail;
        this.memberPhoneNum = memberPhoneNum;
        this.identifyingCord = identifyingCord;
    }

    public String getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(String memberAccount) {
        this.memberAccount = memberAccount;
    }

    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getPasswordRepeat() {
        return passwordRepeat;
    }

    public void setPasswordRepeat(String passwordRepeat) {
        this.passwordRepeat = passwordRepeat;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPhoneNum() {
        return memberPhoneNum;
    }

    public void setMemberPhoneNum(String memberPhoneNum) {
        this.memberPhoneNum = memberPhoneNum;
    }

    public String getIdentifyingCord() {
        return identifyingCord;
    }

    public void setIdentifyingCord(String identifyingCord) {
        this.identifyingCord = identifyingCord;
    }

    @Override
    public String toString() {
        return "MemberVO{" +
                "memberAccount='" + memberAccount + '\'' +
                ", memberUsername='" + memberUsername + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", passwordRepeat='" + passwordRepeat + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberPhoneNum='" + memberPhoneNum + '\'' +
                ", identifyingCord='" + identifyingCord + '\'' +
                '}';
    }

}
