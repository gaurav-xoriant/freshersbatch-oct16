package com.chat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Message{
	@Id
	@GeneratedValue
	@Column(name="msg_id")
	private int msg_id;
	
	@Column(name="message")
	private String message;
	private ChattingRoom crId;
	
	public int getMsg_id() {
		return msg_id;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ChattingRoom getCrId() {
		return crId;
	}
	public void setCrId(ChattingRoom crId) {
		this.crId = crId;
	}
	@Override
	public String toString() {
		return "Message [msg_id=" + msg_id + ", message=" + message + ", crId=" + crId + "]";
	}
	
}
