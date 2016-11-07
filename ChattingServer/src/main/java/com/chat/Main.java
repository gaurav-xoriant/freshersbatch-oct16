package com.chat;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
	
			System.out.println("Enter the options you want to choose");
			System.out.println("1 Create a chatroom \n"
					+ "2 Send a message \n"
					+ "3 Display the messages from a specific chatroom \n"
					+ "4 List down all users belonging to the specified chat room. \n"
					+ "5 Logout \n"
					+ "6 Delete an user \n"
					+ "7 Delete the chat room \n"
					+ " Please enter your option:");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:System.out.println("Creating chatroom");
					Session session2 = sessionFactory.openSession();
					Transaction transaction2=session2.beginTransaction();
					
		   		   	Users u=new Users();
		   		   	
		   		   	System.out.println("Enter the name of user");
		   		   	String uname=sc.next();
					System.out.println("Enter password");
					String pswd=sc.next();
					u.setName(uname);
					u.setPassword(pswd);
				    System.out.println("Enter the name of ChatRoom");
				    String roomname=sc.next();
				    ChattingRoom cr=new ChattingRoom();
				    cr.setRoomName(roomname);
				    session2.persist(u);
				    cr.addUsers(u);
				    session2.persist(cr);
				    transaction2.commit();
				    session2.close();
				break;			
			default:
				break;
			}
		sc.close();
	}

}
