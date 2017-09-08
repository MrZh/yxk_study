package com.yxk.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yxk.dao.DetailsMapper;
import com.yxk.model.Permission;
import com.yxk.model.TempUser;
import com.yxk.service.DetailsService;

@Service("detailsService")
public class impDetailsService implements DetailsService{

	@Autowired
	private DetailsMapper detailsdao;
	
	@Override
	public List<Permission> getUser(String userid) {
		// TODO Auto-generated method stub
		return this.detailsdao.getByUser(userid);
	}

}
