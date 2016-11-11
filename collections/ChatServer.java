package com.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
class Comparatorbuff implements Comparator<StringBuilder> {

    @Override
    public int compare(StringBuilder s1, StringBuilder s2) {
        return s1.toString().compareTo(s2.toString());
    }

}
public class ChatServer {
	
	public static void main(String[] args) {
		String name = null;
		String chatname = null;
		Scanner sc=new Scanner(System.in);
		StringBuilder cname=new StringBuilder();
		Set<StringBuilder> hset=new TreeSet<StringBuilder>(new Comparatorbuff());
		List<String>msglist=new ArrayList<String>();
		while(true){
		System.out.println("Enter the options you want to choose");
		System.out.println("1 Create a chatroom \n2 Add the user \n3 User login \n4 Send a message \n5 Display the messages from a specific chatroom \n6 List down all users belonging to the specified chat room. \n7 Logout \n8 Delete an user \n9 Delete the chat room \n Please enter your option:");
		int choice=sc.nextInt();
		switch(choice){
			case 1:System.out.println("Enter the name of the chatroom");
					cname.append(sc.next());
					hset.add(cname);
					System.out.println("Created Chat room");
				break;
			case 2:System.out.println("Enter the name of chatroom you want to add user");
					StringBuilder sb1=new StringBuilder();
					sb1.append(sc.next());
					System.out.println(sb1);
					Iterator<StringBuilder> itr = hset.iterator();		
					while(itr.hasNext()) {
						StringBuilder key = itr.next();
						System.out.println(key.toString().equals(sb1.toString()));
						if(key.toString().equals(sb1.toString())){
							System.out.println("Enter username and password");
							cname.append(" "+sc.next());
							cname.append(" "+sc.next());
							hset.add(cname);
							System.out.println("user Created");
						}
						else
							System.out.println("invalid chatrrom");
					}
			break;
			case 3:System.out.println("Enter your Chatroom name");
					chatname=sc.next();
					System.out.println("Enter your username");
					name=sc.next();
					System.out.println("Enter your password");
					String pswd=sc.next();
					int flag=0;
					Iterator<StringBuilder> itr1 = hset.iterator();
					while(itr1.hasNext()) {
						StringBuilder key1 = itr1.next();
						String[] parts = key1.toString().split(" ");
						for(int i=0;i<parts.length;i++){
							if(parts[i].equals(chatname)){
								flag++;
								if(parts[i+1].equals(name)){
									flag++;
									if(parts[i+2].equals(pswd)){
										flag++;
										 System.out.println("Login successful");
										 break;
									}
								}								
							}
							else{
								i+=2;
							}
						}
					}
			break;
			case 4:System.out.println("type message");
					String msg=sc.nextLine();
					msglist.add(chatname+" "+name+" "+msg);
					System.out.println("Added msz");
				break;
			case 5:System.out.println("Enter the name of chatroom whom msz u want to see");
					chatname=sc.next();
					int j=0;
					Iterator<String> itr2 = msglist.iterator();
					while(itr2.hasNext()) {
						String key1 = itr2.next();
						String[] parts1 = key1.split(" ");
						if(parts1[j].equals(chatname)){
							System.out.println(key1);
							j+=3;
						}
					}
				break;
			case 6:System.out.println("logging out");
				break;
			case 7:System.out.println("Name of the user you want to delete");
				break;
			case 8:System.out.println("Name of the chatroom u want to delete");
				break;
			default:break;
			
		}
		}
	}

}
