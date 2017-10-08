package com.yxk.test;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yxk.dao.UserModifyLogMapper;
import com.yxk.model.UserModifyLog;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring/application-config.xml" })

public class TestMyBatis {
   
	@Autowired
	private UserModifyLogMapper usermodifylogMapper;
	
    @Test
    public void test() {
        UserModifyLog usermodifylo = new UserModifyLog();
        usermodifylo.setId(UUID.randomUUID().toString());
        usermodifylo.setOriginalDepartmentId(UUID.randomUUID().toString());
        usermodifylogMapper.insert(usermodifylo);
        
        usermodifylogMapper.select("c8ba5e78-68df-417b-9237-a8810ceb0fdb");
        
    }
}
