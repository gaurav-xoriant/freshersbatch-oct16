package com.springChatApp;

import java.util.Set;

public class ChatAppSpring {
	private int id;
	private String roomname;
	Set<User> users;
	Set<Message> message;
	public Set<Message> getMessage() {
		return message;
	}
	public void setMessage(Set<Message> message) {
		this.message = message;
	}
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoomname() {
		return roomname;
	}
	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	@Override
	public String toString() {
		return "ChatAppSpring [id=" + id + ", roomname=" + roomname + ", users=" + users + ", message=" + message
				+ ", msg=" + msg + "]";
	}
}