package com.yxk.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yxk.impl.impUserService;
import com.yxk.model.Result;
import com.yxk.model.User;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private impUserService ius;
	

	@RequestMapping(value = "/in", method = RequestMethod.POST)
	public @ResponseBody Result logined(HttpServletRequest request)
	{
		
		Result result = new Result();
		String email = request.getParameter("loginEmail");
		String password = request.getParameter("password");
		User user = new User();
		user.setLoginEmail(email);
		user.setPassword(password);
		if(email == null || email.equals(""))
		{
			result.setCode(0);
			result.setMessage("用户名不能为空！请输入用户名！");
			return result;
		}
		if(password == null || password.equals(""))
		{
			result.setCode(0);
			result.setMessage("密码不能为空！请输入密码！");
			return result;
		}
		System.out.println(ius.login(email, password));
		if(ius.login(email, password) <= 0)
		{
			result.setCode(0);
			result.setMessage("用户名或密码不正确！请重新输入！");
			return result;
		}
			String username=ius.getUserName(email).getLoginEmail();
			result.setCode(1);
			result.setData(user);
			result.setMessage("登录成功！");
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("username", username);

			return result;
	}
	
	
	
}
