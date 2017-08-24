package com.yxk.dao;

import org.apache.ibatis.annotations.Delete;

public interface UserDao {

	@Delete("DELETE FROM user where id=#{id}")  
    public void getDeleteUser(String id); 
}
