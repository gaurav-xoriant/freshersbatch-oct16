package com.aop;

public class UserCredential {
	private String uname;
	private String password;
	private String fname;
	private String country;
	@Override
	public String toString() {
		return "UserCredential [name=" + uname + ", password=" + password + ", fname=" + fname + ", country=" + country
				+ "]";
	}
	public String getName() {
		return uname;
	}
	public void setName(String name) {
		this.uname = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
