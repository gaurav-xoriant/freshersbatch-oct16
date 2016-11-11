package com.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CopyTable {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("CREATE TABLE EMP_COPY AS SELECT * FROM EMP");
		System.out.println("Copy of employee table created");

	}

}
