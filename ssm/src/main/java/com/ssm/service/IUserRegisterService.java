package com.ssm.service;

import com.ssm.model.User;

public interface IUserRegisterService {
	
	public int insert(User record);  
	
	public int select(User record);
		
}
