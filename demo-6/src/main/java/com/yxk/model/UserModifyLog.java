package com.yxk.model;

import java.util.Date;

public class UserModifyLog {
    private String id;

    private Date modifyTime;

    private String originalDepartmentId;

    private String nowDepartmentId;

    private String originalResign;

    private String nowResgin;

    private String modifyUserid;

    private String createUserid;

    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getOriginalDepartmentId() {
        return originalDepartmentId;
    }

    public void setOriginalDepartmentId(String originalDepartmentId) {
        this.originalDepartmentId = originalDepartmentId == null ? null : originalDepartmentId.trim();
    }

    public String getNowDepartmentId() {
        return nowDepartmentId;
    }

    public void setNowDepartmentId(String nowDepartmentId) {
        this.nowDepartmentId = nowDepartmentId == null ? null : nowDepartmentId.trim();
    }

    public String getOriginalResign() {
        return originalResign;
    }

    public void setOriginalResign(String originalResign) {
        this.originalResign = originalResign == null ? null : originalResign.trim();
    }

    public String getNowResgin() {
        return nowResgin;
    }

    public void setNowResgin(String nowResgin) {
        this.nowResgin = nowResgin == null ? null : nowResgin.trim();
    }

    public String getModifyUserid() {
        return modifyUserid;
    }

    public void setModifyUserid(String modifyUserid) {
        this.modifyUserid = modifyUserid == null ? null : modifyUserid.trim();
    }

    public String getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid == null ? null : createUserid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}