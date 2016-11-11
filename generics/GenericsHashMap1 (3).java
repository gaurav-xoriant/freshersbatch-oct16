package com.generics;

import java.util.ArrayList;
import java.util.List;

public class ListNumeric {

	public static void process(List<? extends Number> list){
			System.out.println("list is ok");
			}
	public static void main(String[] args) {
		List<Integer> integerBox = new ArrayList<Integer>();
		integerBox.add(10);
		integerBox.add(10);
		integerBox.add(10);
		integerBox.add(10);
		integerBox.add(10);
			process(integerBox);
		List<String> integerBox1 = new ArrayList<String>();
		integerBox1.add("10.01");
		integerBox1.add("10");
		integerBox1.add("10");
		integerBox1.add("10");
		integerBox1.add("10");
			//process(integerBox1);
	}
}
