package com.ssm.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserManageMapper;
import com.ssm.dao.UserMapper;
import com.ssm.model.User;
import com.ssm.model.UserManage;
import com.ssm.service.IUserService;

@Service("userService")
public class UserServiceimpl implements IUserService {

	@Autowired
	private UserMapper userdao;
	
	@Autowired
	private UserManageMapper users;

	@Override
	public int Login(String username, String password) {
		// TODO Auto-generated method stub
		return this.userdao.selectById(username, password);
	}

	@Override
	public User getUserID(String userid) {
		// TODO Auto-generated method stub
		return this.userdao.selectByPrimaryKey(userid);
	}

	@Override
	public List<UserManage> getAll() {
		// TODO Auto-generated method stub
		return this.users.selectAll();
	}

	@Override
	public int register(String id, String username, String password) {
		// TODO Auto-generated method stub
		int i =-1;
		if(username != null || !(username.equals("")))
		{
			 i =  userdao.registerById(new User());
		}
		
		return i;
	}

}
