package com.nestedclass;

import java.util.Date;
import java.util.HashMap;

class App{
	public void add(int key,String name){
		new Cache().add(key,name);
	}
	public void getName(int key){
		new Cache().getName(key);
	}
	private static class Cache{
		private String name;
		private int key;
		private Date timestamp;
		static HashMap<Integer, String> hmap = new HashMap<Integer, String>();		
		public void add(int key,String name){
			this.timestamp=new Date();
			hmap.put(key,name+" "+timestamp);
			String i=hmap.get(key);
			System.out.println("put value in cache    "+i);
		}
		public void getName(int key){
			String i=hmap.get(key);
			System.out.println("value in cache for key "+ key+"  "+i);
		}
	}
}
public class AppMain {

	public static void main(String[] args) {
		App ap=new App();
		ap.add(12,"Abc");
		ap.getName(12);
		
	}

}
