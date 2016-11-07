package com.chat;

import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="chatuser")
public class Users {

	@Id
	@GeneratedValue
	@Column(name="Uid")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String pswd;
	@ManyToMany(mappedBy="s")
	private Set<ChattingRoom> cr;
	
	public void setName(String name){
		this.name=name;
	}
	public void setPassword(String pswd){
		this.pswd=pswd;
	}
	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public void addChatRoom(ChattingRoom cr) {
	      if (!getChattingRoom().contains(cr)) {
	    	  getChattingRoom().add(cr);
	      }
	      if (!cr.getUsers().contains(this)) {
	    	  cr.getUsers().add(this);
	      }
	    }
	    public Collection<ChattingRoom> getChattingRoom() {
	      return cr;
	    }
	public String toString(){
		return id+"--"+name;
	}
}
