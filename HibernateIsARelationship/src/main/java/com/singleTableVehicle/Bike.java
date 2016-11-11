package com.singleTableVehicle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")

public class Bike extends Vehicle{
	
	@Column
	private int wheels;
	
	public Bike(int cost,int wheels) {
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
