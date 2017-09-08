package com.yxk.service;

import java.util.List;

import com.yxk.model.TempUser;

public interface TempService {
	
	List<TempUser> getAll();
	
	int getUser(String temp_id,String userid);
	
	int deleteUser(String id);
	
	int updateUser(TempUser user);
	
	int insertUser(TempUser user);
	
	TempUser select(String id);
	
	int selectUser(String id);
}
