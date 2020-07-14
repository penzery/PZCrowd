package com.pz.crowd.entity.po;

public class ProjectTypePO {
    private Long typeId;

    private String typeName;

    private String typeRemark;

    public ProjectTypePO(Long typeId, String typeName, String typeRemark) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeRemark = typeRemark;
    }

    public ProjectTypePO() {
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeRemark() {
        return typeRemark;
    }

    public void setTypeRemark(String typeRemark) {
        this.typeRemark = typeRemark == null ? null : typeRemark.trim();
    }
}