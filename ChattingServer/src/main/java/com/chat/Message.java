package com.chat;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Message{
	@Id
	@GeneratedValue
	@Column(name="mid")
	private int mid;
	
	@Column(name="message")
	private String message;
	
	@OneToOne (cascade = { CascadeType.ALL })
	@JoinColumn(name="uid")
	private int uid;
	 public int getMId(){
		 return mid;
	 }
	 public int getUId(){
		 return uid;
	 }
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message=message;
	}
	public String toString(){
		return message;
	}
}
