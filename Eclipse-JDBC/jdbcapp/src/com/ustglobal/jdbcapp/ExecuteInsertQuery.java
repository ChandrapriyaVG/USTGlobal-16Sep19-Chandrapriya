package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
	
		try {
			//step 1 - load the Driver
			
			Driver driver  = new Driver();
			DriverManager.registerDriver(driver);
			
			//step 2 - get the connection
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//step 3 - issue the SQL query
			
			String sql = "insert into employee_info values(7,'Abhishek',12000,'M')";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			//step 4 - read the result
			
			System.out.println(count +"Row(s) inserted");
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		
	}//end main
}//end class
