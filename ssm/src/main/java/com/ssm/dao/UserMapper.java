package com.ssm.dao;

import org.apache.ibatis.annotations.Param;

import com.ssm.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(String userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    int selectById(@Param("username")String username,@Param("password")String password);
    
    int registerById(User record);
    
}