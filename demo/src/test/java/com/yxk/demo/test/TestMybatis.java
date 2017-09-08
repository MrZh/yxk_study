package com.yxk.demo.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.yxk.demo.imp.impService;
import com.yxk.demo.model.User;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath*:spring-mybatis.xml" })

public class TestMybatis {
	private static Logger logger = Logger.getLogger(TestMybatis.class);
	
	@Autowired
	private impService userMapper;
	
	@Test
    public void test() {
		
        User user = userMapper.getUserById("32723b13-505b-4c2f-8546-cdebb0126a5d");
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }
	
}
