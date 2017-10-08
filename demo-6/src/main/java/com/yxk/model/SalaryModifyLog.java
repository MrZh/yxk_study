package com.yxk.model;

import java.math.BigDecimal;
import java.util.Date;

public class SalaryModifyLog {
    private String id;

    private String userid;

    private String createUserid;

    private Date createTime;

    private BigDecimal salaryModify;

    private BigDecimal originalSalary;

    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid == null ? null : createUserid.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getSalaryModify() {
        return salaryModify;
    }

    public void setSalaryModify(BigDecimal salaryModify) {
        this.salaryModify = salaryModify;
    }

    public BigDecimal getOriginalSalary() {
        return originalSalary;
    }

    public void setOriginalSalary(BigDecimal originalSalary) {
        this.originalSalary = originalSalary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}