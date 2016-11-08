package com.aop.AddVectorList;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AddIntegersToList {

	List<Integer> elements1=new Vector<Integer>();
	
	List<Integer> elements2=new ArrayList<Integer>();
	
	public void addtoVector(){
		for(int i=0;i<1000;i++){
			elements1.add(i);
		}
		System.out.println("added to vector");
	}
	public void addtoArrayList(){
		for(int i=0;i<1000;i++){
			elements2.add(i);
		}
		System.out.println("added to arraylist");
	}
}
