package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileMain {

	public static void main(String[] args) throws IOException {
		StringBuilder sb=new StringBuilder();
		File f=new File("abc.txt");
		FileOutputStream fos=new FileOutputStream(f);
		String s="Hello from abc";
		fos.write(s.getBytes());
		fos.flush();
		fos.close();
		FileInputStream fis=new FileInputStream(f);
		int i=0;
		do{
			i=fis.read();
			if(i!=-1)
				sb.append((char)i);
		}while(i!=-1);
		System.out.println("Done abc ");
		System.out.print(f.getAbsolutePath());
		System.out.println("In File abc "+sb);
		fis.close();
		
		File f1=new File("pqr.txt");
		FileOutputStream fos1=new FileOutputStream(f1);
		fos1.write(sb.toString().getBytes());
		fos1.flush();
		fos1.close();
		FileInputStream fis1=new FileInputStream(f);
		 i=0;
		do{
			i=fis1.read();
			if(i!=-1)
				sb.append((char)i);
		}while(i!=-1);
		System.out.println("Done pqr ");
		System.out.println("In File abc "+sb);
		System.out.print(f1.getAbsolutePath());
		fis1.close();
	}

}
