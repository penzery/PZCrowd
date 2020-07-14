package com.pz.crowd.entity.vo;

public class AddressVO {
    private Long addressId;

    private String receiveName;

    private String receivePhoneNum;

    private String receiveAddress;

    private Long memberId;

    public AddressVO() {
    }

    public AddressVO(Long addressId, String receiveName, String receivePhoneNum, String receiveAddress) {
        this.addressId = addressId;
        this.receiveName = receiveName;
        this.receivePhoneNum = receivePhoneNum;
        this.receiveAddress = receiveAddress;
    }

    public AddressVO(Long addressId, String receiveName, String receivePhoneNum, String receiveAddress, Long memberId) {
        this.addressId = addressId;
        this.receiveName = receiveName;
        this.receivePhoneNum = receivePhoneNum;
        this.receiveAddress = receiveAddress;
        this.memberId = memberId;
    }

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
        this.receiveName = receiveName;
    }

    public String getReceivePhoneNum() {
        return receivePhoneNum;
    }

    public void setReceivePhoneNum(String receivePhoneNum) {
        this.receivePhoneNum = receivePhoneNum;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "AddressVO{" +
                "addressId=" + addressId +
                ", receiveName='" + receiveName + '\'' +
                ", receivePhoneNum='" + receivePhoneNum + '\'' +
                ", receiveAddress='" + receiveAddress + '\'' +
                ", memberId=" + memberId +
                '}';
    }
}
