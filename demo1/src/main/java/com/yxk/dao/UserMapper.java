package com.yxk.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.yxk.model.User;

@Repository
public interface UserMapper {
	@Delete("delete from manage-user where userid =#{userid}")
    int deleteByPrimaryKey(String userid);

	@Insert("insert into manage-user(userid,login-email,password) values(#{userid},#{loginEmail},#{password})")
    int insert(User record);

	@Insert("insert into manage-user(userid,login-email,password) values(#{userid},#{loginEmail},#{password})")
    int insertSelective(User record);

	@Select("select userid,login-email from manage-user where userid = #{userid}")
    User selectByPrimaryKey(String userid);

	@Update("update manage-user set password = #{password} where userid = #{userid}")
    int updateByPrimaryKeySelective(User record);

	@Update("update manage-user set  login-email = #{loginEmail},password = #{password} where userid = #{userid}")
    int updateByPrimaryKey(User record);
	
	@Select("select count(0) from manage-user where login-email = #{loginEmail},password = #{password}")
	int selectByLogin(String loginEmail,String password);
	
	@Select("select userid,login-email from manage-user where login-email = #{loginEmail},password = #{password}")
    User selectByUser(String loginEmail,String password);
}