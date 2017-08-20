package com.ssm.test;


import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.ssm.model.User;
import com.ssm.service.IUserService;


@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:Mybatis.xml" })
public class TestMybatis {

	 private static Logger logger = Logger.getLogger(TestMybatis.class);
	   
	 @Autowired
	    private IUserService userService = null;

	 @Test
	    public void test() {
	        User user = userService.getUserID("123456");
	        System.out.println(user.getUsername());
	        // logger.info("值："+user.getUserName());
	        logger.info(JSON.toJSONString(user));
	    }
}
