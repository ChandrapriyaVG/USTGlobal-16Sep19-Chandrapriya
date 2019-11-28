package com.ust_global.webappemp.dao;

import com.ust_global.webappemp.dto.EmployeeInfo;

//Methods for DB Operations 

public interface EmployeeDAO {

	public EmployeeInfo auth(int id, String password);
	
	public EmployeeInfo searchEmployee(int id);
	
	public boolean changePassword(int id, String password);
	
	public boolean registerEmployee(EmployeeInfo info);
}
