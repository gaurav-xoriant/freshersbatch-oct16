package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListReverse {

	public static void main(String[] args) {
		List<String> nameAryList = new ArrayList<String>();
		nameAryList.add("Ivan");
		nameAryList.add("Tom");
		nameAryList.add("Jerry");
		
		ListIterator<String> litr=nameAryList.listIterator(nameAryList.size());
		
		System.out.println("Reverse  order");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
	

	}

}
