package com.yxk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;


import com.yxk.model.TempUser;

@Repository
public interface TempUserMapper {
	

	@Delete("delete from user_temp where id=#{id}")
	int getDeleteUser(@Param("id")String id);
	
	@Delete("delete  from user_temp where id = #{id}")
	int deleteByPrimaryKey(String id);

	@Insert("insert into user_temp(id,temp_id,userid) values(#{id},#{temp_id},#{userid})")
    int insert(TempUser record);

    @Select("select * from user_temp where id=#{id}")
    TempUser selectByid(String id);

    @Update("update user_temp set temp_id = #{temp_id},userid = #{userid} where id = #{id}")
    int updateByPrimaryKey(TempUser record);
    
    @Select("select * from user_temp")
    List<TempUser> getAll();
        
    @Select("select count(0) from user_temp where temp_id = #{temp_id} and userid = #{userid}")
    int selectByUser(@Param("temp_id")String temp_id,@Param("userid")String userid);
    
    @Select("select count(0) from user_temp where id=#{id}")
    int select(String id);
}
