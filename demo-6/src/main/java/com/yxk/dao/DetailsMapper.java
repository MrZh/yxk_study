package com.yxk.dao;

import com.yxk.model.Details;

public interface DetailsMapper {
    int deleteByPrimaryKey(String id);

    int insert(Details record);

    int insertSelective(Details record);

    Details selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Details record);

    int updateByPrimaryKey(Details record);
}