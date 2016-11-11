package com.aop;

public class UserHandler {
	boolean userflag=false;
	public void login(String uname,String password){
		if(uname.length()>3){
			System.out.println("Login successful");
			userflag=true;
		}
	}
	public void logout() {
		if(userflag=false){
			throw new NullPointerException();
		}
		else
			userflag=false;
	}
	public void register(String uname,String password,String fname,String country){
		if(uname.length()>3 && password.length()>3){
			System.out.println("successful registeration");
		}
	}

}
