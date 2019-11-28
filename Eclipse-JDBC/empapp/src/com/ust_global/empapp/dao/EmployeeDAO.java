package com.ust_global.empapp.dao;

import java.util.List;

import com.ust_global.empapp.dto.EmployeeBean;

public interface EmployeeDAO {

	public EmployeeBean searchEmployeeData(int id);
	public List<EmployeeBean> getAllEmployeeData( );
	public int insertEmployeeData(EmployeeBean bean);
	public int updateEmployeeData(EmployeeBean bean);
	public int deleteEmployeeData(int id);
	
	}

