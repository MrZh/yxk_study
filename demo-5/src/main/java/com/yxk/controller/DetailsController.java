package com.yxk.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yxk.dao.DetailsMapper;
import com.yxk.impl.impDetailsService;
import com.yxk.model.Permission;
import com.yxk.model.Result;

@Controller
@RequestMapping("/details")
public class DetailsController {
	
	@Autowired
	private impDetailsService detailsdao;
	
	@Autowired
	private DetailsMapper usermapper ;
	
	@RequestMapping(value = "/" ,method = RequestMethod.GET)
	public String details()
	{
		return "detailsUser";
		
	}
	
	@RequestMapping(value = "/details" , method = RequestMethod.GET)
	public @ResponseBody Result detailsUser(HttpServletRequest request)
	{
		Result result = new Result();
		List<Permission> user ;
		String id = request.getParameter("id");
		if(id == null || id.equals(""))
		{
			result.setMessage("id为空！");
			return result;
		}
		user = detailsdao.getUser(id);
		result.setData(user);
		return result;
	}
}
