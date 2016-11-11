package com.singleTableVehicle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Car extends Vehicle{
	
	@Column(name="wheels")
	private int wheels;
	public Car(int cost,int wheels) {
		super(cost);
		this.wheels=wheels;	
	}
	
	public int getWheels(){
		return this.wheels;
	}
	
	public void setWheels(int wheels){
		this.wheels=wheels;
	}
}
