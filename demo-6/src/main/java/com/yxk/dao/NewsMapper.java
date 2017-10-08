package com.yxk.dao;

import com.yxk.model.News;

public interface NewsMapper {
    int deleteByPrimaryKey(String id);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKeyWithBLOBs(News record);

    int updateByPrimaryKey(News record);
}