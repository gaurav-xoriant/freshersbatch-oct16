package com.lambda;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

public class RemoveOddLengthString {
	
	/*public static List<String> filter(List<String>l,Predicate<String>p){
		//List<String> s=new ArrayList<>();
		Iterator<String> itr=l.iterator();
		while(itr.hasNext()){
			String ls=itr.next();
			l.removeIf(p);
			//if( ls.length()%2==0)
				//l.
				//s.add(ls);		
		}
		return l;
	}
	
*/
	public static void main(String[] args) {
		List<String> name=new CopyOnWriteArrayList<String>();
		name.add("ABCD");
		name.add("AB");
		name.add("ABC");
		name.add("ABCDq");
		name.add("ABCDqqq");
		name.add("ABCD");
		Predicate<String> p=(String s)->s.length()%2==0;
		//List<String> EvenLength=filter(name,p);
		Iterator<String> it=name.iterator();
		while(it.hasNext()){
			if(it.next().length()%2==0){
			}
			System.out.println("remove");
		}
		Iterator<String> it1=name.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
	}

}
