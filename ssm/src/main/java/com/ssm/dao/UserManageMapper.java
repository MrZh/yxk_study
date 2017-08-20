package com.ssm.dao;

import java.util.List;

import com.ssm.model.UserManage;

public interface UserManageMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserManage record);

    int insertSelective(UserManage record);

    UserManage selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserManage record);

    int updateByPrimaryKey(UserManage record);
    
    List<UserManage> selectAll();
    
}