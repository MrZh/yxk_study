package com.yxk.service;

import java.util.List;

import com.yxk.model.Permission;
import com.yxk.model.User;

public interface PermissionService {
		
	List<Permission> getAll();
	
	int getUser(String name,String url);
	
	int deleteUser(String userid);
	
	int updateUser(Permission user);
	
	int insertUser(Permission user);
	
	Permission select(String id);
	
	int selectUser(String id);
	
}
