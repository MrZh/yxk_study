package com.yxk.dao;

import com.yxk.model.Resign;

public interface ResignMapper {
    int deleteByPrimaryKey(String id);

    int insert(Resign record);

    int insertSelective(Resign record);

    Resign selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Resign record);

    int updateByPrimaryKeyWithBLOBs(Resign record);

    int updateByPrimaryKey(Resign record);
}