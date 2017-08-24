package com.ssm.controller;

import java.util.UUID;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssm.model.User;
import com.ssm.service.IUserRegisterService;


@Controller
@RequestMapping("/Register")
public class RegisterController {

	@Autowired
    private	IUserRegisterService ius;
	 
	@RequestMapping("/regis")
	public String regis(HttpServletRequest request)
	{
		return "register";
	}
	@RequestMapping(value = "/register" ,method = RequestMethod.POST)
	public String register(HttpServletRequest request)
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String userid = UUID.randomUUID().toString();
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setUserid(userid);
		ius.insert(user);
		return "login";
		
	}
}
