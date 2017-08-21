package com.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.dao.UserMapper;
import com.ssm.impl.UserServiceimpl;
import com.ssm.model.Result;
import com.ssm.model.User;
import com.ssm.model.UserManage;

@Controller
@RequestMapping("/Spring")
public class LoginController {
	
	@Autowired
	private UserServiceimpl userdao ;
	
	@RequestMapping("/index")
	public String index(HttpServletRequest request)
	{
		return "login";
		
	}
	
	@RequestMapping("/login")
	public @ResponseBody Result login(HttpServletRequest request)
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Result result=new Result();
		
		
		if(username == null || username.equals(""))
		{
			result.setCode(0);
			result.setMessage("请输入用户名");
			return result;
		}
		if(password == null || password.equals(""))
		{
			result.setCode(0);
			result.setMessage("请输入密码");
			return result;
		}
		if(userdao.Login(username, password) <= 0)
		{
			result.setCode(0);
			result.setMessage("用户名或者密码错误");
			return result;
		}
		else
		{
			
			List<User> users=new ArrayList<>();
			
			User user=new User();
			user.setUsername(username);
			user.setPassword(password);
			users.add(user);
			result.setData(users);
			result.setCode(1);
			result.setMessage("登录成功");
			return result;
			
		}
		
	}
	
	@RequestMapping(value ="/Manage" , method= RequestMethod.GET)
	public String Manage(@ModelAttribute()UserManage user, ModelMap model)
	{
		List<UserManage> list=userdao.getAll();
		model.addAttribute("UserManage",list);
		return "UserManage";
		
	}
	
	@RequestMapping("/userlist")
	public String userList(){
		
		return "userlist";
	}
	
	@RequestMapping("/userlistdata")
	public @ResponseBody Result userListData(){
		
		Result result=new Result();
		result.setCode(1);
		result.setData(this.userdao.getAll());
		return result;
	}
}
