package com.rest;

public class Login {
	String user;
	String pswd;
	@Override
	public String toString() {
		return "Login [user=" + user + ", pswd=" + pswd + "]";
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	

}
