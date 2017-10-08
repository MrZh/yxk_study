package com.yxk.dao;

import com.yxk.model.UserModifyLog;

public interface UserModifyLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserModifyLog record);

    int insertSelective(UserModifyLog record);

    UserModifyLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserModifyLog record);

    int updateByPrimaryKeyWithBLOBs(UserModifyLog record);

    int updateByPrimaryKey(UserModifyLog record);
    
    UserModifyLog select(String id);
}