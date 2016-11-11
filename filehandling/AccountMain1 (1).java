package com.filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AccountMain {

	public static void main(String[] args) throws IOException {
		File file = new File("abc.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(23);
		dos.writeDouble(12000.85);
		dos.writeUTF("Tom");
		dos.flush();
		fos.flush();
		dos.close();
		fos.close();
		System.out.println("Done with Data Output");
		File file1 = new File("abc.txt");
		FileInputStream fis = new FileInputStream(file1);
		DataInputStream dis = new DataInputStream(fis);
		int acnt = dis.readInt();
		double salary = dis.readDouble();
		String name = dis.readUTF();
		System.out.println("Name : "+name+" Account : "+acnt+" Balance : "+salary);
		dis.close();
		fis.close();

	}

}
