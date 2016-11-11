package com.oneTOone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ENQUIRY")
public class Enquiry {
	
	@Id
	@GeneratedValue
	@Column(name="e_id")
	private int e_id;
	
	@Column(name="e_question")
	private String e_question;
	public Enquiry() {
		// TODO Auto-generated constructor stub
	}
	public Enquiry(String e_question) {
		this.e_question=e_question;
	}
	
	public int getId() {
		return e_id;
	}

	public void setId(int e_id) {
		this.e_id = e_id;
	}

	public String getEnq() {
		return e_question;
	}

	public void setName(String e_question) {
		this.e_question = e_question;
	}
	public String toString() {
		return e_id + " - " + e_question;
	}

}
