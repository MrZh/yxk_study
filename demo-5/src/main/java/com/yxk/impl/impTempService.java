package com.yxk.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxk.dao.TempUserMapper;
import com.yxk.model.TempUser;
import com.yxk.service.TempService;

@Service("tempService")
public class impTempService implements TempService{

	@Autowired
	private TempUserMapper userdao;

	@Override
	public List<TempUser> getAll() {
		// TODO Auto-generated method stub
		return this.userdao.getAll();
	}

	@Override
	public int getUser(String temp_id, String userid) {
		// TODO Auto-generated method stub
		return this.userdao.selectByUser(temp_id, userid);
	}

	@Override
	public int deleteUser(String id) {
		// TODO Auto-generated method stub
		return this.userdao.deleteByPrimaryKey(id);
	}

	@Override
	public int updateUser(TempUser user) {
		// TODO Auto-generated method stub
		return this.userdao.updateByPrimaryKey(user);
	}

	@Override
	public int insertUser(TempUser user) {
		// TODO Auto-generated method stub
		return this.userdao.insert(user);
	}

	@Override
	public TempUser select(String id) {
		// TODO Auto-generated method stub
		return this.userdao.selectByid(id);
	}

	@Override
	public int selectUser(String id) {
		// TODO Auto-generated method stub
		return this.userdao.select(id);
	}
	
}
