package com.jdbc2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ImageDB {

	public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
		//Inserting pic
		/*PreparedStatement pstmt = 
				con.prepareStatement("INSERT INTO DEPT values(?,?,?)");
		pstmt.setInt(1,  7);
		pstmt.setString(2,  "DEVELOPER");
		
		File file = new File("Penguins.jpg");
		FileInputStream fis = new FileInputStream(file);
		pstmt.setBinaryStream(3, fis, file.length());
		int updates =pstmt.executeUpdate();
		System.out.println("updated "+updates);
		fis.close();
		pstmt.close();
		*/
		//Retrieving  pic
		Blob bl;
		File file1 = new File("a.jpg");
		FileOutputStream fos=new FileOutputStream(file1);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from DEPT where id=7");
		 while(rs.next()){
             bl=rs.getBlob(3);
             byte []b=bl.getBytes(1,(int)bl.length());
             fos.write(b);
         }
		 fos.close();
		 con.close();  
}
}
