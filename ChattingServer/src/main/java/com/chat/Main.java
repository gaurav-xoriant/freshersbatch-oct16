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
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		Users u=new Users();
		ChattingRoom c=new ChattingRoom();
		Message m=new Message();
		u.setName("ABC");
		c.setRoomName("sports");
		m.setMessage("hello how are you");
		c.setMessage(m);
		c.setUsers(u);
		t.commit();
		s.close();
		
		/*
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
						Session session1 = sessionFactory.openSession();
						Transaction transaction1=session1.beginTransaction();
					    System.out.println("Enter the name of ChatRoom");
					    String roomname=sc.next();
					    ChattingRoom cr=new ChattingRoom();
					    cr.setRoomName(roomname);
					    session1.persist(cr);
					    transaction1.commit();
					    session1.close();
				break;
			case 2:System.out.println("Creating user");
						Session session2 = sessionFactory.openSession();
						Transaction transaction2=session2.beginTransaction();
					    System.out.println("Enter the name of user");
					    String uname=sc.next();
					    System.out.println("Enter the pswd of user");
					    String pswd=sc.next();
					    Users u=new Users();
					    u.setName(uname);
					    u.setPassword(pswd);
					    session2.persist(u);
					    transaction2.commit();
					    session2.close();
			    break;			
			default:
				break;
			}*/
		sc.close();
	}

}
