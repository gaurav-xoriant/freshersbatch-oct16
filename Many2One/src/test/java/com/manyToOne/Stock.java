package com.manyToOne;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="STOCK")
public class Stock {

	@Id
	@GeneratedValue
	@Column(name="sid")
	private int sid;
	
	@Column(name="sname")
	private String sname;
	
	@OneToMany(mappedBy="stock", cascade={CascadeType.ALL})
	private Set<Market> m;

	public int getDepartment_id() {
		return sid;
	}

	public void setDepartment_id(int sid) {
		this.sid = sid;
	}

	public String getDepartmentName() {
		return sname;
	}

	public void setDepartmentName(String sname) {
		this.sname = sname;
	}

	public Set<Market> getEmployees() {
		return m;
	}

	public void setEmployees(Set<Market> m) {
		this.m = m;
	}

	public String toString() {
		return sid + " - " + sname + " - " + m;
	}
}
