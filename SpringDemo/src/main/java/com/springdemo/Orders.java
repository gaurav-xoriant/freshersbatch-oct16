package com.springdemo;

public class Orders {
	
	private int id;
	private Item item;
	@Override
	public String toString() {
		return "Orders [id=" + id + ", i=" + item + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	
}
