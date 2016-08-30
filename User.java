package com.n2s.StrutsMiniProject;

public class User {

	private String UserName;
	private String Password;
	
	public String execute () throws Exception {
		return "success" ;
		
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	
	
}
