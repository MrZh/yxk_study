package com.yxk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.yxk.model.User;

@Repository
public interface UserMapper {

	/*
     * ���ǻ���ע���ӳ�䷽ʽ��ʵ�ֶ����ݵ���ɾ�Ĳ飬��sql���ֱ��д��ע���������
     * ����һ���ӿڣ��䲻��Ҫ��ȥʵ����
     * �±߷ֱ��ǲ��룬ɾ�����޸ģ���ѯһ����¼����ѯ���еļ�¼
     * */
	@Delete("delete from demo_user where UserId=#{id}")
	int getDeleteUser(@Param("userId")String id);
	
	@Delete("delete  from demo_user where UserId = #{userid}")
	int deleteByPrimaryKey(String userid);

	@Insert("insert into demo_user(UserId,UserName,Password) values(#{userid},#{username},#{password})")
    int insert(User record);

    @Select("select * from demo_user where UserId=#{userid}")
    User selectByid(String userid);

    @Update("update demo_user set UserName = #{username},Password = #{password} where UserId = #{userid}")
    int updateByPrimaryKey(User record);
    
    @Select("select * from demo_user")
    List<User> getAll();
    
    @Select("select count(0) from demo_user where UserName = #{username} and Password = #{password}")
    int selectByPrimaryKey(@Param("username")String username,@Param("password")String password);
    
    @Select("select count(0) from demo_user where UserName = #{username}")
    int selectByUserNmae(@Param("username")String username);
    
    @Select("select count(0) from demo_user where Email = #{email}")
    int selectByUserEmail(@Param("email")String email);
    
    @Select("select UserName from demo_user where Email=#{email}")
    User selectByName(String email);
}

