package com.yxk.model;

public class User {
    private String userid;

    private String loginEmail;

    private String password;

    public String getUserid() {
        return userid;
    }

	public String getLoginEmail() {
		return loginEmail;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

   
}