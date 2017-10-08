package com.yxk.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yxk.dao.UserMapper;
import com.yxk.impl.impUserService;
import com.yxk.model.Result;
import com.yxk.model.User;

@Controller
@RequestMapping("/UserList")
public class UserListController{

	@Autowired
	private impUserService ius = null;
	
	@Autowired
	private UserMapper userdao = null;
	
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String userlist()
	{
		return "UserList";
	}
	
	@RequestMapping(value = "/userlist" , method = RequestMethod.GET)
	public  @ResponseBody Result UserList(HttpServletRequest request)
	{
		
		Result result = new Result();
		List<User> users = ius.getAll();
		result.setData(users);
		return result;
	}
	
	@RequestMapping(value = "/delete" , method = RequestMethod.POST)
	public @ResponseBody Result deluser(HttpServletRequest request)
	{
		Result result = new Result();
		String userid = request.getParameter("userId");
		int i = ius.deleteUser(userid);
		if(i <= 0)
		{
			result.setCode(0);
			result.setMessage("用户不存在！");
			return result;
		}
		result.setCode(1);
		result.setMessage("用户删除成功");
		return result;
		
	}
	
	@RequestMapping(value = "/update")
	public String update()
	{
		
		return "update-user";
		
	}
	@RequestMapping(value = "/updateUser" , method = RequestMethod.POST)
	public @ResponseBody Result updateuser(HttpServletRequest request)
	{
		String userid=request.getParameter("userid");
		String loginEmail=request.getParameter("loginEmail");
		String password=request.getParameter("password");
		User user=new User();
		user.setPassword(password);
		user.setUserid(userid);
		user.setLoginEmail(loginEmail);
		this.ius.updateUser(user);
		Result result = new Result();
		result.setCode(1);
		return result;
		
	}
	
	@RequestMapping(value = "/add" ,method = RequestMethod.GET)
	public String adduser()
	{
		return "add-personnel";
	}
	
	@RequestMapping(value = "/getUser" ,method = RequestMethod.GET)
	public @ResponseBody Result getUser(HttpServletRequest request){
		
		//
		
		String id= request.getParameter("id");
		User temp= this.userdao.selectByPrimaryKey(id);
		
//		User user=new User();
//		user.setUserid("111");
//		user.setUsername("userName");
//		user.setPassword("password");
		Result result = new Result();
		result.setCode(1);
		result.setData(temp);
		return result;
		
	}
	
	@RequestMapping(value ="/adduser" , method = RequestMethod.POST)
	public @ResponseBody Result add(HttpServletRequest request)
	{
		User user = new User();
		Result result = new Result();
		String loginemail = request.getParameter("loginEmail");
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
		int i =userdao.insert(user);
		if(i > 0)
		{
			result.setCode(1);
			result.setData(user);
			result.setMessage("用户添加成功！");
		}
		return result;
	}
}
