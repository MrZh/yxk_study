package com.yxk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yxk.impl.impUserService;

@Controller
@RequestMapping("/index")
public class indexController {
	
	@Autowired
	private impUserService impUserService;
	
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public String login()
//	{
//		return "login";
//	}
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String login()
	{
		return "login";
		
	}
}
