package com.yxk.demo.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxk.demo.dao.UserMapper;
import com.yxk.demo.model.User;
import com.yxk.demo.service.userService;

@Service("userService")
public class impService implements userService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByPrimaryKey(userId);
	}



}
