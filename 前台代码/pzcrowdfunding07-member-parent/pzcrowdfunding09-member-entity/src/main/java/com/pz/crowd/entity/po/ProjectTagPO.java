package com.pz.crowd.entity.po;

public class ProjectTagPO {
    private Long tagId;

    private Long tagPid;

    private String tagName;

    public ProjectTagPO(Long tagId, Long tagPid, String tagName) {
        this.tagId = tagId;
        this.tagPid = tagPid;
        this.tagName = tagName;
    }

    public ProjectTagPO() {
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getTagPid() {
        return tagPid;
    }

    public void setTagPid(Long tagPid) {
        this.tagPid = tagPid;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }
}