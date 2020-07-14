package com.pz.crowd.entity.vo;

import java.io.Serializable;

public class OrderProjectVO implements Serializable {
    private String projectName;
    private String launchMember;
    private String returnContent;
    private Long supportMoney;
    private Integer freight;
    private Integer signalPurchase;
    private Integer purchase;
    private Integer returnCount;

    public OrderProjectVO() {
    }

    public OrderProjectVO(String projectName, String launchMember, String returnContent, Long supportMoney, Integer freight, Integer signalPurchase, Integer purchase) {
        this.projectName = projectName;
        this.launchMember = launchMember;
        this.returnContent = returnContent;
        this.supportMoney = supportMoney;
        this.freight = freight;
        this.signalPurchase = signalPurchase;
        this.purchase = purchase;
    }

    public OrderProjectVO(String projectName, String launchMember, String returnContent, Long supportMoney, Integer freight, Integer signalPurchase, Integer purchase, Integer returnCount) {
        this.projectName = projectName;
        this.launchMember = launchMember;
        this.returnContent = returnContent;
        this.supportMoney = supportMoney;
        this.freight = freight;
        this.signalPurchase = signalPurchase;
        this.purchase = purchase;
        this.returnCount = returnCount;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getLaunchMember() {
        return launchMember;
    }

    public void setLaunchMember(String launchMember) {
        this.launchMember = launchMember;
    }

    public String getReturnContent() {
        return returnContent;
    }

    public void setReturnContent(String returnContent) {
        this.returnContent = returnContent;
    }

    public Long getSupportMoney() {
        return supportMoney;
    }

    public void setSupportMoney(Long supportMoney) {
        this.supportMoney = supportMoney;
    }

    public Integer getFreight() {
        return freight;
    }

    public void setFreight(Integer freight) {
        this.freight = freight;
    }

    public Integer getSignalPurchase() {
        return signalPurchase;
    }

    public void setSignalPurchase(Integer signalPurchase) {
        this.signalPurchase = signalPurchase;
    }

    public Integer getPurchase() {
        return purchase;
    }

    public void setPurchase(Integer purchase) {
        this.purchase = purchase;
    }

    public Integer getReturnCount() {
        return returnCount;
    }

    public void setReturnCount(Integer returnCount) {
        this.returnCount = returnCount;
    }

    @Override
    public String toString() {
        return "OrderProjectVO{" +
                "projectName='" + projectName + '\'' +
                ", launchMember='" + launchMember + '\'' +
                ", returnContent='" + returnContent + '\'' +
                ", supportMoney=" + supportMoney +
                ", freight=" + freight +
                ", signalPurchase=" + signalPurchase +
                ", purchase=" + purchase +
                ", returnCount=" + returnCount +
                '}';
    }
}
