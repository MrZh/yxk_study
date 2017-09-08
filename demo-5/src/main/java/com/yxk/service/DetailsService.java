package com.yxk.service;

import java.util.List;

import com.yxk.model.Permission;


public interface DetailsService {
	
	List<Permission> getUser(String userid);
}
