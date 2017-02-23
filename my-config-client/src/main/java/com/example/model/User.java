package com.example.model;

import java.util.Date;

public class User {
	private int userId;
	private String userName;
	private Date createTime;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "User [id=" + userId + ", name=" + userName + ", age=" + createTime.toLocaleString() + "]";
	}
	
}
