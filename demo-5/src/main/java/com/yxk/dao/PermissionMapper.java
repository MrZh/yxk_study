package com.yxk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.yxk.model.Permission;
import com.yxk.model.User;

@Repository
public interface PermissionMapper {

	@Delete("delete from Permission where id=#{id}")
	int getDeleteUser(@Param("id")String id);
	
	@Delete("delete  from Permission where id = #{id}")
	int deleteByPrimaryKey(String id);

	@Insert("insert into Permission(id,name,url) values(#{id},#{name},#{url})")
    int insert(Permission record);

    @Select("select * from Permission where id=#{id}")
    Permission selectByid(String id);

    @Update("update Permission set name = #{name},url = #{url} where id = #{id}")
    int updateByPrimaryKey(Permission record);
    
    @Select("select * from Permission")
    List<Permission> getAll();
        
    @Select("select count(0) from Permission where name = #{name} and url = #{url}")
    int selectByUser(@Param("name")String name,@Param("url")String url);
    
    @Select("select count(0) from Permission where id=#{id}")
    int select(String id);

}
