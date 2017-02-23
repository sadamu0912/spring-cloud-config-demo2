package com.example.model;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

	public boolean insertUser(User user);
	
	public boolean updateUser(User user);
	
	public boolean deleteUser(int id);
}
