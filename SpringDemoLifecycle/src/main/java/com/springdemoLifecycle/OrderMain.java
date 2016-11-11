package com.springdemoLifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderMain {
	public static void main(String[] args) {
		AbstractApplicationContext apc=new ClassPathXmlApplicationContext("Beans_simple.xml");
		Orders o1=(Orders) apc.getBean("order1");
		System.out.println(o1);
		System.out.println(o1.getItem());
	}
}
