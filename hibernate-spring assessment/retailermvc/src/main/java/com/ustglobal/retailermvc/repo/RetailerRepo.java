package com.ustglobal.retailermvc.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.retailermvc.beans.Product;
import com.ustglobal.retailermvc.beans.Retailer;
import com.ustglobal.retailermvc.dao.RetailerDAO;


public interface RetailerRepo {

	
	public Retailer login(int id,String password);
	public int register (Retailer bean);
	public Product searchProductById(int orderId);
	public boolean updatePassword(int id,String password);
}
