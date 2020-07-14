package com.pz.crowd.entity.po;

public class AddressPO {
    private Long addressId;

    private String receiveName;

    private String receivePhoneNum;

    private String receiveAddress;

    private Long memberId;

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName == null ? null : receiveName.trim();
    }

    public String getReceivePhoneNum() {
        return receivePhoneNum;
    }

    public void setReceivePhoneNum(String receivePhoneNum) {
        this.receivePhoneNum = receivePhoneNum == null ? null : receivePhoneNum.trim();
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress == null ? null : receiveAddress.trim();
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "AddressPO{" +
                "addressId=" + addressId +
                ", receiveName='" + receiveName + '\'' +
                ", receivePhoneNum='" + receivePhoneNum + '\'' +
                ", receiveAddress='" + receiveAddress + '\'' +
                ", memberId=" + memberId +
                '}';
    }
}