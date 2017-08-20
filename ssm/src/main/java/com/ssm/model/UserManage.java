package com.ssm.model;

import java.util.Date;

public class UserManage {
    private String id;

    private String name;

    private Integer age;

    private Date birthday0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday0() {
        return birthday0;
    }

    public void setBirthday0(Date birthday0) {
        this.birthday0 = birthday0;
    }
}