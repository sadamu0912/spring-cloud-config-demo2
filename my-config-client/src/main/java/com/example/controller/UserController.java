package com.example.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.example.model.User;
import com.example.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("/add")
	public String insertUser(){
		User user = new User();
		user.setUserId(2);
		user.setUserName("jobs");
		user.setCreateTime(new Date());
		userService.insertUser(user);
		return JSON.toJSONString(user);
	}
	@RequestMapping("/update")
	public String updateUser(){
		User user = new User();
		user.setUserId(2);
		user.setUserName("jobs");
		user.setCreateTime(new Date());
		userService.insertUser(user);
		return JSON.toJSONString(user);
	}
	
	@RequestMapping("/delete")
	public String deleteUser(){
		userService.deleteUser(2);
		return "user 删除成功";
	} 
}
