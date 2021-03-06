package com.yxk.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yxk.dao.Manage_userMapper;
import com.yxk.dao.UserMapper;
import com.yxk.impl.impUserService;
import com.yxk.model.Result;
import com.yxk.model.User;
import com.yxk.model.manage_user;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private Manage_userMapper userdao;
	
	@Autowired
	private impUserService ius;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String register()
	{
		return "register";
	}
	
	@RequestMapping(value = "/addUser",method = RequestMethod.POST)
	public @ResponseBody Result addUser(HttpServletRequest request)
	{
		manage_user user = new manage_user();
		Result result = new Result();
		String loginemail = request.getParameter("loginemail");
		String password = request.getParameter("password");
		String userid = UUID.randomUUID().toString();
		if(loginemail == null || loginemail.equals(""))
		{
			result.setCode(0);
			result.setMessage("用户名不能为空！请重新输入！");
			return result;
		}
		if(password == null || password.equals(""))
		{
			result.setCode(0);
			result.setMessage("密码不能为空！请重新输入！");
			return result;
		}
//		if(ius.getUserName(username) > 0)
//		{
//			result.setCode(0);
//			result.setMessage("用户已存在！请重新输入！");
//			return result;
//		}
		user.setUserid(userid);
		user.setLoginEmail(loginemail);
		user.setPassword(password);
		int i = userdao.insert(user);
		if(i >0)
		{
			result.setCode(1);
			result.setData(user);
			result.setMessage("注册成功！跳转至登录页面！");
		}
		return result;
		
	}
}
