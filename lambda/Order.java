package com.lambda;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;
public class Order {
	int amt;
	int status;
	String name;
	Order(int amt,int status,String name){
		this.amt=amt;
		this.status=status;
		this.name=name;
	}
	public int getAmt(){
		return amt;
	}
	public int getStatus(){
		return status;
	}
	public static List<Order> filterAmt(List<Order> o1,Predicate<Order> p){
		List<Order> filtered=new ArrayList<>();
		Iterator<Order> itr=o1.iterator();
		while(itr.hasNext()){
			Order o=itr.next();
			if(p.test(o))
				filtered.add(o);		
		}
		return filtered;
	}
	public static List<Order> filterStatus(List<Order> o1,Predicate<Order> p){
		List<Order> filtered=new ArrayList<>();
		Iterator<Order> itr=o1.iterator();
		while(itr.hasNext()){
			Order o=itr.next();
			if( o.getStatus()==1)
				filtered.add(o);		
		}
		return filtered;
	}
	public String toString(){
		return amt+" "+status+" "+name;
	}
	public static void main(String args[]) {
		List<Order> odr=new ArrayList<>();
		odr.add(new Order(100,1,"a"));
		odr.add(new Order(10,1,"ab"));
		odr.add(new Order(200,0,"ac"));
		odr.add(new Order(20,0,"af"));
		
		Predicate<Order> p =
				(Order s) -> s.amt>90 ;
		List<Order> o=filterAmt(odr,p);
		Iterator<Order> itr=o.iterator();
		while(itr.hasNext()){
			Order o1=itr.next();
			System.out.println(o1);
		}
		System.out.println("Done amt");
		Predicate<Order> p1 =
				(Order s1) -> s1.status==1;
		List<Order> o1=filterStatus(odr,p);
		Iterator<Order> itr1=o1.iterator();
		while(itr1.hasNext()){
			Order o12=itr1.next();
			System.out.println(o12);
		}
	}

}
