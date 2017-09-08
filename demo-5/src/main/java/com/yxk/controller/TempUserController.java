package com.yxk.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yxk.impl.impTempService;
import com.yxk.model.Result;
import com.yxk.model.TempUser;

@Controller
@RequestMapping("/tempUser")
public class TempUserController {

	@Autowired
	private impTempService ips;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String UserList()
	{
		return "TempUserList";

	}
	
	@RequestMapping(value = "/add" , method = RequestMethod.GET)
	public String add()
	{
		return "addTempUser";
	}
	
	@RequestMapping(value = "/update" ,method = RequestMethod.GET)
	public String update()
	{
		return "updateTempUser";
		
	}
	@RequestMapping(value = "/addUser" , method = RequestMethod.POST)
	public @ResponseBody Result addUser(HttpServletRequest request)
	{
		Result result = new Result();
		TempUser user = new TempUser();
		String temp_id = request.getParameter("temp_id");
		String userid = request.getParameter("userid");
		String id = UUID.randomUUID().toString();
		if(temp_id == null || temp_id.equals(""))
		{
			result.setCode(0);
			result.setMessage("	权限ID不能为空！请输入用户名！");
			return result;
		}
		if(userid == null || userid.equals(""))
		{
			result.setCode(0);
			result.setMessage("用户ID不能为空！请输入Url！");
			return result;
		}
		if(ips.getUser(temp_id, userid) > 0)
		{
			result.setCode(0);
			result.setMessage("用户已存在！请重新输入！");
			return result;
		}
		user.setId(id);
		user.setTemp_id(temp_id);
		user.setUserid(userid);
		if(ips.insertUser(user) < 0)
		{
			result.setCode(0);
			result.setMessage("用户添加失败！");
			return result;
		}
		result.setCode(1);
		result.setData(user);
		result.setMessage("用户添加成功！");
		return result;
	}
	
	@RequestMapping(value = "/userList" , method = RequestMethod.GET)
	public @ResponseBody Result userList(HttpServletRequest request)
	{
		Result result = new Result();
		List<TempUser> users = ips.getAll();
		result.setData(users);
		return result;
		
	}
	
	@RequestMapping(value = "/delete" , method = RequestMethod.POST)
	public @ResponseBody Result delete(HttpServletRequest request)
	{
		Result result = new Result();
		String id = request.getParameter("id");
		if(ips.deleteUser(id) < 0)
		{
			result.setCode(0);
			result.setMessage("删除失败！该用户不存在！");
			return result;
		}
		result.setCode(1);
		result.setMessage("用户已删除！");
		return result;
	}

	@RequestMapping(value = "/select" , method = RequestMethod.GET)
	public @ResponseBody Result selectUser(HttpServletRequest request)
	{
		Result result = new Result();
		String id = request.getParameter("id");
		if(ips.selectUser(id) < 0)
		{
			result.setCode(0);
			result.setMessage("该用户不存在！");
			return result;
		}
		result.setCode(1);
		result.setData(ips.select(id));
		return result;
		
	}

	@RequestMapping(value = "/updated" , method = RequestMethod.POST)
	public @ResponseBody Result updateUser(HttpServletRequest request)
	{
		Result result = new Result();
		String id = request.getParameter("id");
		String temp_id = request.getParameter("temp_id");
		String userid = request.getParameter("userid");
		if(temp_id == null || temp_id.equals(""))
		{
			result.setCode(0);
			result.setMessage("用户名不能为空!");
			return result;
		}
		if(userid == null || userid.equals(""))
		{
			result.setCode(0);
			result.setMessage("url名不能为空!");
			return result;
		}
		TempUser user = new TempUser();
		user.setId(id);
		user.setTemp_id(temp_id);
		user.setUserid(userid);
		if(ips.updateUser(user) < 0)
		{
			result.setCode(0);
			result.setMessage("用户信息修改失败！");
			return result;
		}
		result.setCode(1);
		result.setMessage("用户信息修改成功！");
		return result;
		
	}
}
