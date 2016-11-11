package com.springdemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderMain {
	public static void main(String[] args) {
		AbstractApplicationContext apc=new ClassPathXmlApplicationContext("Beans_simple.xml");
		Orders o1[]=new Orders[4];
		o1[0]=(Orders) apc.getBean("order1");
		o1[1]=(Orders) apc.getBean("order2");
		o1[2]=(Orders) apc.getBean("order3");
		o1[3]=(Orders) apc.getBean("order4");
		int sum=0;
		for(int i=0;i<o1.length;i++)
		{
			sum+=o1[i].getItem().getPrice();
		}
		System.out.println(sum);
	}
}
