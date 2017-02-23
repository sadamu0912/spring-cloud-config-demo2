package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.model.UserMapper;

@Service
public class UserService {

	@Autowired 
	UserMapper userMapper;
	
	public boolean insertUser(User user){
		return userMapper.insertUser(user);
	}
	
	public boolean updateUser(User user){
		return userMapper.updateUser(user);
	}
	
	public boolean deleteUser(int userId){
		 return userMapper.deleteUser(userId);
	}
}
