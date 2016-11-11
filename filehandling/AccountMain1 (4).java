package com.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Sequence {

	public static void main(String[] args) throws IOException {
		FileInputStream fin1=new FileInputStream("abc.txt");
		FileInputStream fin2=new FileInputStream("pqr.txt");
		SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
		int i;
		while((i=sis.read())!=-1){
		System.out.print((char)i);
		}
		sis.close();
		fin1.close();
		fin2.close();

	}

}
