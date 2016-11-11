package com.rest;

public class Order {
	private String title;
	private double price;
	private int id;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}

	public Order() {
		super();
	}
	public Order(String title, double price) {
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Order [title=" + title + ", price=" + price + ", id=" + id + "]";
	}
	public void setId(int id) {
		this.id = id;
	}

}
