package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DynamicDeleteQuery2 {
public static void main(String[] args) {
	
	Connection conn = null;
	PreparedStatement pstmt  = null;
	
	try {
		//1-load the driver
		
//		Driver driver = new Driver();
//		DriverManager.registerDriver(driver);
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//2-get the connection
		
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		conn = DriverManager.getConnection(url);
		
		//3-issue the sql queries
		
		String sql = "delete from employee_info where id = ?";
		pstmt = conn.prepareStatement(sql);
		
		String empid = args[0];
		int id = Integer.parseInt(empid);
		
		//int id = Integer.parseInt(args[0]);
		
		//pstmt.setInt(1,Integer.parseInt(args[0]);
		
		pstmt.setInt(1, id);
		
		int count = pstmt.executeUpdate();
		//4-read the result
		System.out.println(count+ " Rows affected");
	
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	finally {
		//5-close all jdbc objects
		try {
			if(conn != null) {
				
				conn.close();
			}
			if(pstmt != null) {
				
				pstmt.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	 }
   }
}
