package com.pz.crowd.entity.vo;

import java.io.Serializable;

public class ProjectLaunchMemberConfirmInfoVO implements Serializable {
    private String memberPayNum;

    private String memberCardNum;

    public ProjectLaunchMemberConfirmInfoVO(String memberPayNum, String memberCardNum) {
        this.memberPayNum = memberPayNum;
        this.memberCardNum = memberCardNum;
    }

    public ProjectLaunchMemberConfirmInfoVO() {
    }

    public String getMemberPayNum() {
        return memberPayNum;
    }

    public void setMemberPayNum(String memberPayNum) {
        this.memberPayNum = memberPayNum;
    }

    public String getMemberCardNum() {
        return memberCardNum;
    }

    public void setMemberCardNum(String memberCardNum) {
        this.memberCardNum = memberCardNum;
    }

    @Override
    public String toString() {
        return "ProjectLaunchMemberConfirmInfoVO{" +
                "memberPayNum='" + memberPayNum + '\'' +
                ", memberCardNum='" + memberCardNum + '\'' +
                '}';
    }
}
