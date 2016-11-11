package com.oneTOone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="CUSTOMER")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name="c_id")
	private int c_id;
	
	@Column(name="c_name")
	private String c_name;
	
	@OneToOne (cascade = { CascadeType.ALL })
	@JoinColumn(name="e_id")
	private Enquiry e_id;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String c_name,Enquiry e_id) {
		this.c_name=c_name;
		this.e_id=e_id;
	}
	public int getId() {
		return c_id;
	}

	public void setId(int c_id) {
		this.c_id = c_id;
	}

	public String getName() {
		return c_name;
	}

	public void setName(String c_name) {
		this.c_name = c_name;
	}

	public Enquiry getQuestion() {
		return e_id;
	}

	public void setAddress(Enquiry e_id) {
		this.e_id = e_id;
	}

	public String toString() {
		return c_id + " - " + c_name + " - " + e_id;
	}

}
