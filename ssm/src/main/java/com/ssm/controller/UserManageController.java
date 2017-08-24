package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.impl.UserServiceimpl;
import com.ssm.model.Result;
import com.ssm.model.UserManage;

@Controller
@RequestMapping("/userManage")
public class UserManageController {
	
	@Autowired
	private UserServiceimpl userdao ;
	
	
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
