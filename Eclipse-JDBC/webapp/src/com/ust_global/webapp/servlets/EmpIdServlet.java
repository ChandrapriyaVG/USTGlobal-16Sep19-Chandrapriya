package com.ust_global.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

public class EmpIdServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("empid"));

		PrintWriter out = resp.getWriter();

		Connection conn =  null;
	    PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Driver driver  = new Driver();
			DriverManager.registerDriver(driver);


			String url = "jdbc:mysql://localhost:3306/ust_ty_db";
			conn = DriverManager.getConnection(url,"root","root");

			String sql = "select * from employee_info where id =?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1,id);
			
			rs = pstmt.executeQuery();


			if(rs.next()) {
				int eid = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");

				out.println("Id: "+eid);
				out.println("Name: "+name);
				out.println("Salary: "+sal);
				out.println("Gender: "+gender);
				out.println("*************************");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally {


			try {
				if(conn != null) {
					conn.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(rs != null) {
					rs.close();
				}

			}
			catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}


}

