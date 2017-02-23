package com.example;


import java.util.Date;

import org.apache.coyote.http11.filters.VoidInputFilter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MyConfigClientApplication.class)
@WebAppConfiguration
public class MyConfigClientApplicationTests {

	@Test
	public void insertUser(){
		User user = new User();
		user.setUserId(2);
		user.setUserName("jobs");
		user.setCreateTime(new Date());
		
	}

}
