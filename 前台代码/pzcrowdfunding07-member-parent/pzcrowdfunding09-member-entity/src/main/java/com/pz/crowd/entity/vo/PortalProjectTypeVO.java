package com.pz.crowd.entity.vo;

import java.util.List;

public class PortalProjectTypeVO {
    private Long typeId;

    private String typeName;
    private String typeRemark;
    List<PortalProjectVO> projectVOList;

    public PortalProjectTypeVO() {
    }

    public PortalProjectTypeVO(Long typeId, String typeName, String typeRemark, List<PortalProjectVO> projectVOList) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeRemark = typeRemark;
        this.projectVOList = projectVOList;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeRemark() {
        return typeRemark;
    }

    public void setTypeRemark(String typeRemark) {
        this.typeRemark = typeRemark;
    }

    public List<PortalProjectVO> getProjectVOList() {
        return projectVOList;
    }

    public void setProjectVOList(List<PortalProjectVO> projectVOList) {
        this.projectVOList = projectVOList;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "PortalProjectTypeVO{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", typeRemark='" + typeRemark + '\'' +
                ", projectVOList=" + projectVOList +
                '}';
    }
}
