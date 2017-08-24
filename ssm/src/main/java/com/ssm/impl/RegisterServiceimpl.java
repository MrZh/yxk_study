package com.ssm.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserMapper;
import com.ssm.model.User;
import com.ssm.service.IUserRegisterService;

@Service("registerService")
public class RegisterServiceimpl implements IUserRegisterService{

	@Autowired
	private UserMapper userdao;
	
	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		try {  
            return userdao.insert(record);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
		return 0;
	}

	@Override
	public int select(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
