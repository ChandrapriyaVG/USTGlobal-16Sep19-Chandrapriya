package com.ustglobal.retailermvc.dao;

import com.ustglobal.retailermvc.beans.Product;
import com.ustglobal.retailermvc.beans.Retailer;

public interface RetailerDAO {

	public Retailer login(int id,String password);
	public int register (Retailer bean);
	public Product searchProductById(int orderId);
	public boolean updatePassword(int id,String password);
}
