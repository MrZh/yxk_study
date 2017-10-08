package com.yxk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/index")
public class indexController {

	
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
