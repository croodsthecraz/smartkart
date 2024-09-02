package com.shopping.smartkart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SK_CUSTOMERSIGNIN")
public class CustomerSignIn {
	
	@Id
	@Column(name = "USER_EMAIL_ID")
	private String userEmailId;
	
	@Column(name= "USER_NAME")
	private String userName;
	
	@Column(name ="USER_PASSWORD")
	private String password;
	

	public String getuserEmailId() {
		return userEmailId;
	}

	public void setuserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public String getUserName() {
		return userName;
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
