package com.yxk.manage.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yxk.manage.dao.UserMapper;
import com.yxk.manage.model.Result;
import com.yxk.manage.service.userService;

@Controller
@RequestMapping(value = "/")
public class loginController {
	
	@Autowired
	private userService userMapper;
	
	@RequestMapping(value ="/" , method = RequestMethod.GET)
	public String login()
	{
		return "login";
	}
	
	@RequestMapping(value = "/login/in" , method = RequestMethod.POST)
	public @ResponseBody Result logined(HttpServletRequest request)
	{
		Result result = new Result();
		String email = request.getParameter("loginEmail");
		String password = request.getParameter("password");
		if(email == null || email.equals(""))
		{
			result.setCode(0);
			result.setMessage("��¼���䲻��Ϊ�գ����������䣡");
			return result;
		}
		if(password == null || password.equals(""))
		{
			result.setCode(0);
			result.setMessage("���벻��Ϊ�գ����������룡");
			return result;
		}
		if(userMapper.login(email, password)< 0 )
		{
			result.setCode(0);
			result.setMessage("�û���������������������룡");
			return result;
		}
			result.setCode(1);
			result.setData(userMapper.getUser(email, password));
			result.setMessage("��¼�ɹ���");
			return result;
	}
}
