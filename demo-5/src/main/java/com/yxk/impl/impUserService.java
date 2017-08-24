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
	private  UserMapper userMapper;
	
	@Override
	public int login(String username, String password) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByPrimaryKey(username, password);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userMapper.getAll();
	}

}
