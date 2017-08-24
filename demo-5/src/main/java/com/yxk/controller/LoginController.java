package com.yxk.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yxk.impl.impUserService;
import com.yxk.model.Result;
import com.yxk.model.User;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired(required=false)
	private impUserService ius;
	
	@RequestMapping(value = "/in", method = RequestMethod.POST)
	public @ResponseBody Result logined(HttpServletRequest request,Result result)
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		if(username == null || username.equals(""))
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
		System.out.println(ius.login(username, password));
		if(ius.login(username, password) <= 0)
		{
			result.setCode(0);
			result.setMessage("用户名或密码不正确！请重新输入！");
			return result;
		}
		
			result.setCode(1);
			result.setData(user);
			result.setMessage("登录成功！");
		
			return result;
	}
	
	@RequestMapping(value = "/userlist" , method = RequestMethod.GET)
	public @ResponseBody String userlist(@ModelAttribute("userlist")List<User> users,ModelMap model)
	{
		 users = ius.getAll();
		model.addAttribute(users);
		return "UserList";
	}
	
}