package com.ustglobal.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.stockmanagement.customexception.CustomException;
import com.ustglobal.stockmanagement.dao.ProductsDAO;
import com.ustglobal.stockmanagement.dto.Cart;
import com.ustglobal.stockmanagement.dto.Orders_Info;
import com.ustglobal.stockmanagement.dto.Products_Info;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductsDAO dao;

	@Override
	public Products_Info addProduct(Products_Info products) throws CustomException {
	return dao.addProduct(products);
	}

	@Override
	public boolean deleteProduct(int id) throws CustomException {
		return dao.deleteProduct(id);
	}

	@Override
	public Products_Info updateProduct(Products_Info products) throws CustomException {
		return dao.updateProduct(products);
	}

	@Override
	public List<Products_Info> productList() throws CustomException {
		return dao.productList();
	}

	@Override
	public Products_Info updateProductQuantity(Products_Info products) throws CustomException {
		return dao.updateProductQuantity(products);
	}

	@Override
	public Products_Info searchProductByName(String name) throws CustomException {
		return dao.searchProductByName(name);
	}

	@Override
	public Products_Info searchProductByCategory(String category) throws CustomException {
		return dao.searchProductByCategory(category);
	}

	@Override
	public Products_Info searchProductByCompany(String company) throws CustomException {
		return dao.searchProductByCompany(company);
	}

	@Override
	public List<Cart> viewCartProduct() throws CustomException {
		return dao.viewCartProduct();
	}

	@Override
	public Cart addProductToCart(Cart cart) throws CustomException {
		return dao.addProductToCart(cart);
	}

	@Override
	public boolean deleteProductFromCart(int cartId) throws CustomException {
		return dao.deleteProductFromCart(cartId);
	}

	@Override
	public Orders_Info addProductToOrderList(Cart cart) throws CustomException {
		return dao.addProductToOrderList(cart);
	}

	@Override
	public List<Orders_Info> viewOrder() throws CustomException {
		return dao.viewOrder();
	}

	@Override
	public double payment(Cart cart) throws CustomException {
		return dao.payment(cart);
	}
	
}
