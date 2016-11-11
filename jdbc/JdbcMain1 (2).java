package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMain2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		//PreparedStatement pstmt1=con.prepareStatement()
		//PreparedStatement pstmt=con.prepareStatement("SELECT * FROM DEPt")
		//ResultSet rs=pstmt.executeQuery();
		//ResultSet rs=stmt.executeQuery("SELECT * FROM DEPT");
		//while(rs.next()){
			//System.out.println(rs.getInt("ID")+rs.getString("NAME"));
		}
	}
