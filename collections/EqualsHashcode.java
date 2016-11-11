package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EqualsHashcode {
	@Override
	 public int hashCode() {
		return 3;
	}
	@Override
  public boolean equals(final Object obj) {
		return true;
	}
	public static void main(String[] args) {
		
		Map<Integer, String> hmap=new HashMap<Integer,String>();
		hmap.put(1,"a");
		hmap.put(2,"b");
		hmap.put(3,"c");
		Iterator<Integer> itr=hmap.keySet().iterator();				
		while(itr.hasNext()){
			System.out.println( itr.next());
		}
		System.out.println(hmap.get(3));
		

	}

}
