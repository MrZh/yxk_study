package com.yxk.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxk.dao.UserMapper;
import com.yxk.model.User;
import com.yxk.service.UserService;

@Service("impUserService")
public class impUserService implements UserService{
	
	@Autowired
	private  impUserService userMapper;
	
	@Override
	public int login(String email, String password) {
		// TODO Auto-generated method stub
		return this.userMapper.login(email, password);
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userMapper.getAll();
	}

	@Override
	public User getUserName(String email) {
		// TODO Auto-generated method stub
		return this.userMapper.getUserName(email);
	}

	@Override
	public int deleteUser(String userid) {
		// TODO Auto-generated method stub
		return this.userMapper.deleteUser(userid);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return this.userMapper.updateUser(user);
	}

	@Override
	public int getUserEmail(String email) {
		// TODO Auto-generated method stub
		return this.userMapper.getUserEmail(email);
	}

}
