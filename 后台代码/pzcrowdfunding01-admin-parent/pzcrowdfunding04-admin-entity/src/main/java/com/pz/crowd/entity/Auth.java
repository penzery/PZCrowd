package com.pz.crowd.entity;

public class Auth {
    private Long authId;

    private String authName;

    private String authTitle;

    private Long categoryId;

    public Long getAuthId() {
        return authId;
    }

    public void setAuthId(Long authId) {
        this.authId = authId;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName == null ? null : authName.trim();
    }

    public String getAuthTitle() {
        return authTitle;
    }

    public void setAuthTitle(String authTitle) {
        this.authTitle = authTitle == null ? null : authTitle.trim();
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}