package com.springChatApp;

public class User {
private int id;
private String unmae;
@Override
public String toString() {
	return "User [id=" + id + ", unmae=" + unmae + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUnmae() {
	return unmae;
}
public void setUnmae(String unmae) {
	this.unmae = unmae;
}
}
