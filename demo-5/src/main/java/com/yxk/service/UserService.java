package com.yxk.service;

import java.util.List;

import com.yxk.model.User;

public interface UserService {
	
	int login(String email,String password);
	
	List<User> getAll();
	
	User getUserName(String email);
	
	int deleteUser(String userid);
	
	int updateUser(User user);
	
	int getUserEmail(String email);
}
