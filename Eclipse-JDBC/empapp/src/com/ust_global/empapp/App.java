package com.ust_global.empapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.ust_global.empapp.dao.EmployeeDAO;
import com.ust_global.empapp.dao.EmployeeDAOImpl;
import com.ust_global.empapp.dto.EmployeeBean;
import com.ust_global.empapp.util.EmployeeManager;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Press 1 to get all employee data");
		System.out.println("Press 2 to insert employee data");
		System.out.println("Press 3 to update employee data");
		System.out.println("Press 4 to delete employee data");
		System.out.println("Press 5 to search employee data"); 
		
		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();
		
		switch (ch) {
		case 1:
			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeData();
			
			for (EmployeeBean bean : result) {
				
				System.out.println("Name: "+bean.getName());
				System.out.println("Id: "+bean.getId());
				System.out.println("Gender: "+bean.getGender());
				System.out.println("Dalary: "+bean.getSal());
			}
			
			break;
			
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
			
		case 5: 
			EmployeeDAO dao5 =  EmployeeManager.getEmployeeDAO();
			int id = scn.nextInt();
			EmployeeBean bean = dao5.searchEmployeeData(id);
			if(bean != null) {
				System.out.println("Name: "+bean.getName());
				System.out.println("Id: "+bean.getId());
				System.out.println("Gender: "+bean.getGender());
				System.out.println("Dalary: "+bean.getSal());
			}
			else {
				System.out.println("No data found");
			}
			break;
			
			
			
		
		}
		
		
	}
}
