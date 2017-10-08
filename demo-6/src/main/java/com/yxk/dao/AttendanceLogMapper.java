package com.yxk.dao;

import com.yxk.model.AttendanceLog;

public interface AttendanceLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(AttendanceLog record);

    int insertSelective(AttendanceLog record);

    AttendanceLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AttendanceLog record);

    int updateByPrimaryKey(AttendanceLog record);
}