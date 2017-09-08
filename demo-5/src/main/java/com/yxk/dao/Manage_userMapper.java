package com.yxk.dao;

import org.apache.ibatis.annotations.Insert;

import com.yxk.model.manage_user;

public interface Manage_userMapper {
	
	@Insert("insert into manage(userid,login-email,password) values(#{userid},#{loginEmail},#{password})")
    int insert(manage_user record);
}
