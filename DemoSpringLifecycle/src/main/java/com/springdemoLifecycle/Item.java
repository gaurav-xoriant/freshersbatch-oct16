package com.springdemoLifecycle;

public class Item {
	private String name;
	private int price;
	public String getName() {
		System.out.println("--getter of item name");
		return name;
	}
	public void setName(String name) {
		System.out.println("!!setter of item name");
		this.name = name;
	}
	public int getPrice() {
		System.out.println("--getter of item price");
		return price;
	}
	public void setPrice(int price) {
		System.out.println("!!setter of item price");
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + "]";
	}

}
