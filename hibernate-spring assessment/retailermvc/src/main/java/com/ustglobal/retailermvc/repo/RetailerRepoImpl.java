package com.ustglobal.retailermvc.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.retailermvc.beans.Product;
import com.ustglobal.retailermvc.beans.Retailer;
import com.ustglobal.retailermvc.dao.RetailerDAO;

@Service
public class RetailerRepoImpl implements RetailerRepo {

	@Autowired
	private RetailerDAO dao;

	@Override
	public Retailer login(int id, String password) {
		return dao.login(id, password);
	}

	@Override
	public int register(Retailer bean) {
		return dao.register(bean);
	}

	@Override
	public Product searchProductById(int orderId) {
		return dao.searchProductById(orderId);
	}

	@Override
	public boolean updatePassword(int id, String password) {
		return dao.updatePassword(id, password);
	}
	
	
	
}
