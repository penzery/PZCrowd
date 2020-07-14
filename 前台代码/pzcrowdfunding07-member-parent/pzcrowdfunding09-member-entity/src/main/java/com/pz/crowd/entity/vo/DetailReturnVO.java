package com.pz.crowd.entity.vo;

public class DetailReturnVO {
    private Long returnId;
    private Long supportMoney;
    private Integer signalPurchase;
    private Integer purchase;
    private Integer freight;
    private Integer returndate;
    private String returnContent;
    private Integer supporterCount;
    public DetailReturnVO(Long returnId, Long supportMoney, Integer signalPurchase, Integer purchase, Integer supporterCount, Integer freight, Integer returndate, String returnContent) {
        this.returnId = returnId;
        this.supportMoney = supportMoney;
        this.signalPurchase = signalPurchase;
        this.purchase = purchase;
        this.supporterCount = supporterCount;
        this.freight = freight;
        this.returndate = returndate;
        this.returnContent = returnContent;
    }

    public DetailReturnVO() {
    }

    public DetailReturnVO(Long returnId, Long supportMoney, Integer signalPurchase, Integer purchase, Integer freight, Integer returndate, String returnContent) {
        this.returnId = returnId;
        this.supportMoney = supportMoney;
        this.signalPurchase = signalPurchase;
        this.purchase = purchase;
        this.freight = freight;
        this.returndate = returndate;
        this.returnContent = returnContent;
    }

    public Long getReturnId() {
        return returnId;
    }

    public void setReturnId(Long returnId) {
        this.returnId = returnId;
    }

    public Long getSupportMoney() {
        return supportMoney;
    }

    public void setSupportMoney(Long supportMoney) {
        this.supportMoney = supportMoney;
    }

    public Integer getSignalPurchase() {
        return signalPurchase;
    }

    public void setSignalPurchase(Integer signalPurchase) {
        this.signalPurchase = signalPurchase;
    }

    public Integer getFreight() {
        return freight;
    }

    public void setFreight(Integer freight) {
        this.freight = freight;
    }

    public Integer getReturndate() {
        return returndate;
    }

    public void setReturndate(Integer returndate) {
        this.returndate = returndate;
    }

    public String getReturnContent() {
        return returnContent;
    }

    public void setReturnContent(String returnContent) {
        this.returnContent = returnContent;
    }

    public Integer getPurchase() {
        return purchase;
    }

    public void setPurchase(Integer purchase) {
        this.purchase = purchase;
    }

    public Integer getSupporterCount() {
        return supporterCount;
    }

    public void setSupporterCount(Integer supporterCount) {
        this.supporterCount = supporterCount;
    }

    @Override
    public String toString() {
        return "DetailReturnVO{" +
                "returnId=" + returnId +
                ", supportMoney=" + supportMoney +
                ", signalPurchase=" + signalPurchase +
                ", purchase=" + purchase +
                ", supporterCount=" + supporterCount +
                ", freight=" + freight +
                ", returndate=" + returndate +
                ", returnContent='" + returnContent + '\'' +
                '}';
    }

}
