package com.login.user;

public class user 
{
	private String userName;
    private	String  password;
	private String gmail;
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
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public user(String userName, String password, String gmail) {
		super();
		this.userName = userName;
		this.password = password;
		this.gmail = gmail;
	}
	@Override
	public String toString() {
		return "user [userName=" + userName + ", password=" + password + ", gmail=" + gmail + "]";
	}
	
	

}
