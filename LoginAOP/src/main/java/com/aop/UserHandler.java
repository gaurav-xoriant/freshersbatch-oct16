package com.aop;

import java.io.IOException;

public class UserHandler {
	boolean userflag=false;
	public void login(String uname,String password){
		if(uname.length()>3){
			System.out.println("Login successful");
			userflag=true;
		}
	}
	public void logout() throws IOException{
		if(userflag=false){
			throw new IOException();
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
