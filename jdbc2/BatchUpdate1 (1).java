package com.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdate {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//OR		//new oracle.jdbc.driver.OracleDriver();
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
		
		Statement stmt = con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from emp");
		
		stmt.addBatch("INSERT INTO Dept VALUES(10,'JAVA')");
		stmt.addBatch("INSERT INTO dept VALUES(11,'JAVA1')");
		stmt.addBatch("INSERT INTO dept VALUES(12,'JAVA2')");
		stmt.addBatch("INSERT INTO dept VALUES(13,'JAVA3')");
		int updations[] = stmt.executeBatch();
		System.out.println("updated");
	}

}
