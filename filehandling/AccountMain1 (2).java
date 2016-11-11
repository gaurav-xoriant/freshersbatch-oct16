package com.filehandling;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileDetails {

	public static void main(String[] args) throws IOException {
		File directory=new File("C:/Users/shukla_gr/workspace/Training");
		//FileInputStream fis2=new FileInputStream("C:/Users/shukla_gr/workspace/Training/pqr.txt");
		File list[]=directory.listFiles();
		for(int i=0;i<list.length;i++){
			if(list[i].isFile()){
				System.out.println("Name    :"+list[i].getName()+"    ");
				System.out.println("Path :  "+list[i].getPath()+"    ");
				System.out.println("Space     :"+list[i].getTotalSpace()+"    ");
				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
				System.out.println("Last Modified : " + sdf.format(list[i].lastModified()));
				System.out.println();
				System.out.println();
			}
			else{
				System.out.println(list[i]+"is not a file");
			}
		}
		
	}

}
