package com.onlineexam.pojo;

public class Users {

	private int userId;
	private String userEmail;
	private String userPassword;
	
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userEmail=" + userEmail + ", userPassword=" + userPassword + "]";
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public Users(int userId, String userEmail, String userPassword) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}
	
	
	
}


