package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//1-load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//2- get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//3-issue the sql query
			String sql = "update employee_info set name='ABC'";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//4-read th result
			System.out.println(count +"Row(s) inserted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}if(stmt != null) {
					stmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
