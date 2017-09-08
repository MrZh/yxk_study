package com.yxk.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxk.dao.PermissionMapper;
import com.yxk.model.Permission;
import com.yxk.model.User;
import com.yxk.service.PermissionService;

@Service("PermissionService")
public class impPermissionService implements PermissionService{

	@Autowired
	private PermissionMapper permissiondao;
	
	@Override
	public List<Permission> getAll() {
		// TODO Auto-generated method stub
		return this.permissiondao.getAll();
	}

	

	@Override
	public int deleteUser(String userid) {
		// TODO Auto-generated method stub
		return this.permissiondao.deleteByPrimaryKey(userid);
	}

	@Override
	public int updateUser(Permission user) {
		// TODO Auto-generated method stub
		return this.permissiondao.updateByPrimaryKey(user);
	}



	@Override
	public int getUser(String name, String url) {
		// TODO Auto-generated method stub
		return this.permissiondao.selectByUser(name, url);
	}



	@Override
	public int insertUser(Permission user) {
		// TODO Auto-generated method stub
		return this.permissiondao.insert(user);
	}



	@Override
	public Permission select(String id) {
		// TODO Auto-generated method stub
		return this.permissiondao.selectByid(id);
	}



	@Override
	public int selectUser(String id) {
		// TODO Auto-generated method stub
		return this.permissiondao.select(id);
	}





}
