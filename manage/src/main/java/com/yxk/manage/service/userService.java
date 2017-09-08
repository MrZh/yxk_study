package com.yxk.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxk.manage.dao.UserMapper;
import com.yxk.manage.model.User;

@Service
public class userService {
	
	@Autowired
	private UserMapper userMapper;
	
	public int login(String email,String password) {
		return this.userMapper.selectByLogin(email, password);
	}

	public User getUser(String email,String password)
	{
		return this.userMapper.selectByUser(email, password);
		
	}
	
}
