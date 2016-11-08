package com.chat;

import java.util.Collection;
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
	@Column(name="rid")
	private int rid;
	@Column(name="roomname")
	private String roomname;
	
	public ChattingRoom() {
	}

	public void setRoomName(String roomname){
			this.roomname=roomname;
	}
	
	public int getId(){
		return this.rid;
	}
	public String getRoomName(){
		return this.roomname;
	}
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Room_Users", joinColumns = { @JoinColumn(name = "Rid") }, inverseJoinColumns = { @JoinColumn(name = "Uid") })
	private Collection<Users> userList;
	private Collection<Message> msgList;
	
   public Collection<Message> getMessage() {
	      return msgList;
   }
   public void setMessage(Message e ) {
	      this.msgList.add(e);
   }
   public Collection<Users> getUsers() {
	   	return userList;
   }
	public void setUsers(Users u) {
		this.userList.add(u);
	}
	public String toString(){
		return rid+"--"+roomname;
	}
}
