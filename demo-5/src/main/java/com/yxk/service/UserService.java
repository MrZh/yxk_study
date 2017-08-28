package com.yxk.service;

import java.util.List;

import com.yxk.model.User;

public interface UserService {
	
	int login(String username,String password);
	
	List<User> getAll();
	
	int getUserName(String username);
	
	int deleteUser(String userid);
	
	int updateUser(User user);
}
