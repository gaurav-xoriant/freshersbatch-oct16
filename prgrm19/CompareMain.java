import java.util.*;
class PersonWtCompare implements Comparator<Person>{
	public int compare(Person p1,Person p2){
		if(p1.getWt()>p2.getWt())
			return 1;
		else if(p1.getWt()<p2.getWt())
			return -1;
		else
			return 0;
	}
	
}
class PersonNameCompare implements Comparator<Person>{
	public int compare(Person p1,Person p2){
		if(p1.getName().compareTo(p2.getName())>0)
			return 1;
		else if(p1.getName().compareTo(p2.getName())<0)
			return -1;
		else
			return 0;
	}
	
}
class Person implements Comparable<Person>{
	private int ht;
	private int wt;
	private String name;
	Person(int ht,int wt,String name) {
		this.ht=ht;
		this.wt=wt;
		this.name=name;	
	}
	public String getName(){
		return this.name;
	}
	public int getHt(){
		return this.ht;
	}
	public int getWt(){
		return this.wt;
	}
	public int compareTo(Person p){
		if(this.ht>p.ht)
			return 1;
		else if(this.ht<p.ht)
			return -1;
		else
			return 0;
	}
}
class CompareMain{
	public static void main(String args[]){
		ArrayList<Person> al=new ArrayList<Person>();
	Person p1=new Person(12,65,"ABC");
	Person p2=new Person(21,165,"daC");
	Person p3=new Person(1,60,"cdC");
	al.add(p1);
	al.add(p2);
	al.add(p3);
	Collections.sort(al,new PersonNameCompare());
	for(Person p:al)
		System.out.println(p.getName());		
	}
	
}