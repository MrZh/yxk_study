package com.yxk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.yxk.model.Permission;
import com.yxk.model.TempUser;

@Repository
public interface DetailsMapper {
		 
	 @Select("select * from user_temp,demo_user where user_temp.userid =#{id} and demo_user.UserId = #{id}")
	 TempUser getUser(String id);
	 
	 @Select("select * from permission  left JOIN user_temp on user_temp.temp_id = permission.id where user_temp.userid=#{id}")
	 	List<Permission>  getByUser(String id);
}
