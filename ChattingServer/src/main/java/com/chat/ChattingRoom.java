package com.chat;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="chat")
public class ChattingRoom {
	
	@Id
	@GeneratedValue
	@Column(name="Rid")
	private int id;
	@Column(name="roomname")
	private String roomname;
	
	public ChattingRoom() {
	}

	public void setRoomName(String roomname){
			this.roomname=roomname;
	}
	
	public int getId(){
		return this.id;
	}
	public String getRoomName(){
		return this.roomname;
	}
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Room_Users", joinColumns = { @JoinColumn(name = "Rid") }, inverseJoinColumns = { @JoinColumn(name = "Uid") })
	private Set<Users> s;
	public void addUsers(Users s) {
	//	System.out.println(s);
	   // if (!getUsers().contains(s)) {
	    	getUsers().add(s);
	   // }
	  // // if (!s.getChattingRoom().contains(this)) {
		  //    s.getChattingRoom().add(this);
		 //   }
	    
	  }
	 public Collection<Users> getUsers() {
		    return s;
		  }
	public void setUsers(Set<Users> s) {
		this.s = s;
	}
	public String toString(){
		return id+"--"+roomname;
	}
}
