package com.ust_global.empapp.util;

import com.ust_global.empapp.dao.EmployeeDAO;
import com.ust_global.empapp.dao.EmployeeDAOImpl;

public class EmployeeManager {

	private EmployeeManager() {
		
	}

	public static EmployeeDAO getEmployeeDAO( ) {
	
		return new EmployeeDAOImpl();
	}
}
