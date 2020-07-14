package com.pz.crowd.entity.vo;

import java.io.Serializable;

public class ProjectReturnInfoVO implements Serializable {
    // 0 - 实物回报， 1 虚拟物品回报
    private Integer returnType;

    private Long supportMoney;

    private String returnContent;

    private String describPicPath;

    private Integer count;

    private Integer signalPurchase;

    private Integer purchase;

    private Integer freight;

    private Integer invoice;

    private Integer returndate;

    public ProjectReturnInfoVO() {
    }

    public ProjectReturnInfoVO(Integer returnType, Long supportMoney, String returnContent, String describPicPath, Integer count, Integer signalPurchase, Integer purchase, Integer freight, Integer invoice, Integer returndate) {
        this.returnType = returnType;
        this.supportMoney = supportMoney;
        this.returnContent = returnContent;
        this.describPicPath = describPicPath;
        this.count = count;
        this.signalPurchase = signalPurchase;
        this.purchase = purchase;
        this.freight = freight;
        this.invoice = invoice;
        this.returndate = returndate;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }

    public Long getSupportMoney() {
        return supportMoney;
    }

    public void setSupportMoney(Long supportMoney) {
        this.supportMoney = supportMoney;
    }

    public String getReturnContent() {
        return returnContent;
    }

    public void setReturnContent(String returnContent) {
        this.returnContent = returnContent;
    }

    public String getDescribPicPath() {
        return describPicPath;
    }

    public void setDescribPicPath(String describPicPath) {
        this.describPicPath = describPicPath;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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

    public Integer getFreight() {
        return freight;
    }

    public void setFreight(Integer freight) {
        this.freight = freight;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public Integer getReturndate() {
        return returndate;
    }

    public void setReturndate(Integer returndate) {
        this.returndate = returndate;
    }

    @Override
    public String toString() {
        return "ProjectReturnInfoVO{" +
                "returnType=" + returnType +
                ", supportMoney=" + supportMoney +
                ", returnContent='" + returnContent + '\'' +
                ", describPicPath='" + describPicPath + '\'' +
                ", count=" + count +
                ", signalPurchase=" + signalPurchase +
                ", purchase=" + purchase +
                ", freight=" + freight +
                ", invoice=" + invoice +
                ", returndate=" + returndate +
                '}';
    }
}
