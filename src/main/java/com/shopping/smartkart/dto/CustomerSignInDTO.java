package com.shopping.smartkart.dto;

public class CustomerSignInDTO {
	
	private String userEmailId;
	
	private String userName;
	
	private String password;

	public String getUserName() {
		return userName;
	}

	public String getuserEmailId() {
		return userEmailId;
	}


	public void setuserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
