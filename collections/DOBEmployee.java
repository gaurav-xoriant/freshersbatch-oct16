package com.collections;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Dob{
	private int day;
	private int month;
	private int year;
	String name;
	Dob(int day,int month,int year,String name){
		this.day=day;
		this.month=month;
		this.year=year;
		this.name=name;
	}
	public int getday(){
		return this.day;
	}
	public int getmonth(){
		return this.month;
	}
	public int getyear(){
		return this.year;
	}
	public String getName(){
		return this.name;
	}
	@Override
	 public int hashCode() {
		return day*month;
	}
	@Override
    public boolean equals(final Object obj) {
		if(  ((Dob) obj).getday()==this.day && ((Dob) obj).getmonth()==this.month){
			return false;
		}
		else
			return true;
		}
	public String toString(){
		return this.day+this.month+this.year+" "+this.name;
	}
}
public class DOBEmployee {

	public static void main(String[] args) {
		Dob d=new Dob(12,12,2010, "A");
		Dob d1=new Dob(12,12,2011, "B");
		Dob d2=new Dob(1,1,2010, "C");
		Map<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(d.getday(),d.getName());
		hmap.put(d1.getday(),d1.getName());
		hmap.put(d2.getday(),d2.getName());
		Iterator<Integer> itr= hmap.keySet().iterator();
		while(itr.hasNext()){
			System.out.println( itr.next());
		}
		System.out.println(hmap.get(new Date(12/12/2010)));
	}

}
