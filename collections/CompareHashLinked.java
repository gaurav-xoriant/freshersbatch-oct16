package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CompareHashLinked {

	public static void main(String[] args) {
		
		
		Set <String> hset=new HashSet<String>();
		hset.add("Acsd");
		hset.add("Bdefe");
		hset.add("Ceret");
		hset.add("Dffdfd");
		Iterator<String> itr=hset.iterator();
		System.out.println("Printing Hash Set");
		System.out.println();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("Printing List");
		System.out.println();
		List<String> nameList = new LinkedList<String>();
		nameList.add("Asdfdf");
		nameList.add("Brtet");
		nameList.add("Cretrt");
		nameList.add("Dghjgh");
		itr = nameList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
