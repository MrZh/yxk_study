package com.yxk.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/UserList")
public class UserListController {

	@RequestMapping(value = "/" , method = RequestMethod.GET)
		public String userlist()
		{
			return "UserList";
			
		}
}
