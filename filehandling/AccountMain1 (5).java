/*package com.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

class Account{
	private int account;
	private double balance;
	private String name;
	File file = new File("abc.txt");
	public void createAccount(int account,double balance,String name) throws IOException{
		System.out.println(file.getAbsolutePath());
		RandomAccessFile raf = new RandomAccessFile(file, "rw"); 
		raf.writeInt(account);
		raf.writeUTF(name);
		raf.writeDouble(balance);
		long currentPosition = raf.getFilePointer();
		raf.seek(0); 
		int acnt = raf.readInt();
		String name1 = raf.readUTF();
		double salary = raf.readDouble();
		if(salary>10000)
			System.out.println("name : "+ name1+" Account : "+acnt+" Balance : "+salary);
		raf.close();
	}
	public void delete(int account) throws IOException{
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		raf.seek(0); 
		int acnt = raf.readInt();
		String name1 = raf.readUTF();
		double salary = raf.readDouble();
		if(acnt==account)
			
		raf.close();	
	}
	public void update(int acnt,String name) throws IOException{
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		raf.seek(0); 
		int acnt1 = raf.readInt();
		if(acnt1==acnt){
		FileReader fr = new FileReader(file);
		String s;
		    BufferedReader br = new BufferedReader(fr);

		    while ((s = br.readLine()) != null) {
		        s.replace(raf.readUTF(), name);
		    }
	}
//}
//public class SequenceMain {

	//public static void main(String[] args) {
		//Account a= new Account();
		//a.createAccount(123, 200001, "Abc");
		//a.delete(123);
	//}

//}//
//}*/