package com.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GenericsHashMap {
	public static  void printHashKey(Map<? extends Number,?> map){
		System.out.println("correct hash map");
		Iterator<? extends Number>itr=map.keySet().iterator();
		while(itr.hasNext()){
			Number s=itr.next();
			System.out.print(s);
			System.out.println(" "+map.get(s));
		}
	}
	public static void main(String[] args) {
		Map<Integer, String>hmap=new HashMap<Integer,String>();
		hmap.put(10, "abdc");
		hmap.put(20, "abc");
		printHashKey(hmap);
		Map<String, String>hmap1=new HashMap<String,String>();
		hmap1.put("a", "abc");
		hmap1.put("b", "abc");
		//printHashKey(hmap1);
		
	}

}
