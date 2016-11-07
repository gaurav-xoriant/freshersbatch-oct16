package com.manyToOne;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MARKET")
public class Market {

	@Id
	@GeneratedValue
	@Column(name="mid")
	private int mid;

	@Column(name="mname")
	private String mname;
	
	@Column(name="mprice")
	private int mprice;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="STOCK_ID")
	private Stock stock;
	
	public Market() {
		
	}
	
	public Market(String mname, int mprice) {
		this.mname = mname;
		this.mprice=mprice;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public int getMarketId() {
		return mid;
	}

	public void setMarketId(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return mname;
	}

	public void setName(String mname) {
		this.mname = mname;
	}

	public int getPrice() {
		return mprice;
	}

	public void setPrice(int mprice) {
		this.mprice = mprice;
	}
	public String toString() {
		return mid + " - " + mname + " - " + mprice;
	}
	
}