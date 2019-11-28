//DYNAMIC QUERY USING PREPARED STATEMENT

package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;


public class DynamicExecuteInsertQuery2 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
	
		try {
			//step 1 - load the Driver
			
//			Driver driver  = new Driver();
//			DriverManager.registerDriver(driver);
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//step 2 - get the connection
			
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			//step 3 - issue the SQL query
			
			String sql = "insert into employee_info values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3, sal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			
			int count = pstmt.executeUpdate();
			
			//step 4 - read the result
			
			System.out.println(count +"Row(s) inserted");
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		
	}//end main
}//end class
