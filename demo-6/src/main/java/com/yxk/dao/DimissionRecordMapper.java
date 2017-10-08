package com.yxk.dao;

import com.yxk.model.DimissionRecord;

public interface DimissionRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(DimissionRecord record);

    int insertSelective(DimissionRecord record);

    DimissionRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DimissionRecord record);

    int updateByPrimaryKey(DimissionRecord record);
}