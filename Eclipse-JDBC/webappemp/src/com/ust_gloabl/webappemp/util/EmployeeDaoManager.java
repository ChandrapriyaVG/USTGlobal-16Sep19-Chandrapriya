package com.ust_gloabl.webappemp.util;

import com.ust_global.webappemp.dao.EmployeeDAO;
import com.ust_global.webappemp.dao.EmployeeDaoJdbcImpl;

public class EmployeeDaoManager {

	private EmployeeDaoManager() {}
	
	public static EmployeeDAO getEmployeeDAO() {
		
		return new EmployeeDaoJdbcImpl();
	}
}
