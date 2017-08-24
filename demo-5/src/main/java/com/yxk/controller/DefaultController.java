package com.yxk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yxk.dao.UserMapper;

@Controller
@RequestMapping("/")
public class DefaultController {

	@Autowired
	private UserMapper userDao;
	
	@RequestMapping("/index")
	public String Index(HttpServletRequest request) {
		
		userDao.getDeleteUser("111");
		return "showMessage";
	}
}
