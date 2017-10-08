package com.yxk.dao;

import com.yxk.model.SalaryModifyLog;

public interface SalaryModifyLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(SalaryModifyLog record);

    int insertSelective(SalaryModifyLog record);

    SalaryModifyLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SalaryModifyLog record);

    int updateByPrimaryKey(SalaryModifyLog record);
}