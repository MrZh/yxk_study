package com.ssm.service;

import java.util.List;

import com.ssm.model.User;
import com.ssm.model.UserManage;

public interface IUserService {

	public User getUserID(String userid);
	public int Login(String username,String password);
	public List<UserManage> getAll();
}
