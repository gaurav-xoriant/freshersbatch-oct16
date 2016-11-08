package com.chat;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="chatuser")
public class Users {

	@Id
	@GeneratedValue
	@Column(name="uid")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String pswd;
	
	@ManyToMany(mappedBy="userList")
	private Collection<ChattingRoom> crList;
	
	@OneToOne (cascade = { CascadeType.ALL })
	@JoinColumn(name="msg_id")
	private Message msg_id;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public Collection<ChattingRoom> getCrList() {
		return crList;
	}

	public void setCrList(Collection<ChattingRoom> crList) {
		this.crList = crList;
	}

	public Message getMsg_id() {
		return msg_id;
	}

	public void setMsg_id(Message msg_id) {
		this.msg_id = msg_id;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", pswd=" + pswd + ", crList=" + crList + ", msg_id=" + msg_id
				+ "]";
	}
}