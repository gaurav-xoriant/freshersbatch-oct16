package com.singleTableVehicle;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Vehicle")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
public class Vehicle {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="cost")
	private int cost;
	
	public Vehicle(int cost) {
		this.cost=cost;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	public String toString() {
		return id +  " - " + cost;
	}
	
	
	
}
