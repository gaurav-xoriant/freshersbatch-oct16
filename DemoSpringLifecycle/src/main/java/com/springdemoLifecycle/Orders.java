package com.springdemoLifecycle;

public class Orders {
	
	private int id;
	private Item item;
	@Override
	public String toString() {
		return "Orders [id=" + id + ", i=" + item + "]";
	}
	public int getId() {
		System.out.println("!!setter of item name");
		return id;
	}
	public void setId(int id) {
		System.out.println("--getter of order id");
		this.id = id;
	}
	public Item getItem() {
		System.out.println("--getter of order name");
		return item;
	}
	public void setItem(Item item) {
		System.out.println("!!setter of order item");
		this.item = item;
	}
	
	
}
