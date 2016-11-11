package com.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Person{
	 private int weight;
	 private int height;
	 private String name;
	 Person(int weight,int height,String name){
		 this.weight=weight;
		 this.height=height;
		 this.name=name;
	 }
	 public int getWt(){
		 return this.weight;
	 }
	 public int getHt(){
		 return this.height;
	 }
	 public String getName(){
		 return this.name;
	 }
	 public String toString(){
		 return ""+this.height+" "+this.weight+" "+this.name;
	 } 
}
class namecomp implements Comparator<Person> {
    public int compare(Person paramT1, Person paramT2) {
        if (paramT1.getHt()>(paramT2.getHt()))
            return -1;
        else if (paramT1.getHt()<(paramT2.getHt()))
            return 1;
        else if (paramT1.getHt()==(paramT2.getHt())){
        	if (paramT1.getWt()<(paramT2.getWt()))
        		return -1;
        	if (paramT1.getWt()>(paramT2.getWt()))
        		return 1;
        }
        else      	
            return 0;
		return 0;
		
    }
}
public class PersonCollection {

	public static void main(String[] args) {
		Set<Person> tset = new TreeSet<Person>(new namecomp());
		tset.add(new Person(60, 5, "zABC"));
		tset.add(new Person(61, 5, "zABC"));
		tset.add(new Person(65, 9, "ABC"));
		Iterator<Person> itr = tset.iterator();		
		while(itr.hasNext()) {
			Person key = itr.next();
			System.out.println(key);
		}
		System.out.println("\n");
	}

}
