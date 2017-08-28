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

	@Override
	public int getUserName(String username) {
		// TODO Auto-generated method stub
		return this.userMapper.selectByUserNmae(username);
	}

	@Override
	public int deleteUser(String userid) {
		// TODO Auto-generated method stub
		return this.userMapper.deleteByPrimaryKey(userid);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return this.userMapper.updateByPrimaryKey(user);
	}

}
