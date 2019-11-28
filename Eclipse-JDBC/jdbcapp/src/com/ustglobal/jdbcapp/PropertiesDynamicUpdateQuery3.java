//DYNAMIC UPDATE QUERY  

package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class PropertiesDynamicUpdateQuery3 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		FileReader reader = null;
		
		try {
			//1-load the driver
			
//			Driver driver = new Driver();
//			DriverManager.registerDriver(driver);
			
			reader = new FileReader("db.properties"); 
			Properties prop =  new Properties();
			prop.load(reader);
	
			Class.forName(prop.getProperty("driver-class-name"));
			
			//2- get the connection
			
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			
			//3-issue the sql query
			
			String sql = prop.getProperty("update-query");
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			
			String name = args[1];
			
			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			
			String gender = args[3];
			
			pstmt.setInt(4, id);
			pstmt.setString(1, name);
			pstmt.setInt(2, sal);
			pstmt.setString(3,gender);
			
			int count = pstmt.executeUpdate();
			
			//4-read the result
		
			System.out.println(count +"Row(s) inserted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}if(pstmt != null) {
					pstmt.close();
				}
				if(reader != null) {
					reader.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
