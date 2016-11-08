package com.aop;

import java.io.IOException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansAOP.xml");
		UserHandler uh=(UserHandler)context.getBean(UserHandler.class);
		System.out.println("Enter 1.Login");
		System.out.println("Enter 2.Logout");
		System.out.println("Enter 3.Register");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice){
		case 1: System.out.println("Login");
				System.out.println("Enter username");
				String uname=sc.next();
				System.out.println("Enter password");
				String password=sc.next();
				uh.login(uname, password);
				break;
		case 2:System.out.println("in logout");
				uh.logout();
				break;
		case 3:System.out.println("Register");
				System.out.println("Enter username");
				String uname1=sc.next();
				System.out.println("Enter password");
				String password1=sc.next();
				System.out.println("Enter fname");
				String fname1=sc.next();
				System.out.println("Enter country");
				String country1=sc.next();
				uh.register(uname1, password1, fname1, country1);
				break;
		default:break;
		}
sc.close();
	}

}
