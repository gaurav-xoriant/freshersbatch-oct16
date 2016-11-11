package com.opr;

public class StringOpr {
	public String concat(String s1,String s2){
		s1=s1.concat(s2);
		//System.out.println(s1);
		return s1;
	}
	public char getChar(int index,String s){
		char c=s.charAt(index);
		return c;				
	}
	public int getLength(String s){
		int l=s.length();
		return l;
	}

}
