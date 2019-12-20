package com.ustglobal.stockmanagement.dao;

import java.util.List;

import com.ustglobal.stockmanagement.customexception.CustomException;
import com.ustglobal.stockmanagement.dto.Cart;
import com.ustglobal.stockmanagement.dto.Orders_Info;
import com.ustglobal.stockmanagement.dto.Products_Info;

public interface ProductsDAO {

	public Products_Info addProduct(Products_Info products) throws CustomException;

	public boolean deleteProduct(int id) throws CustomException;

	public Products_Info updateProduct(Products_Info products) throws CustomException;

	public List<Products_Info> productList() throws CustomException;
	
	public Products_Info updateProductQuantity(Products_Info products) throws CustomException;
	
	public Products_Info searchProductByName(String name) throws CustomException;
	
	public Products_Info searchProductByCategory(String category) throws CustomException;
	
	public Products_Info searchProductByCompany(String company) throws CustomException;
	
	public List<Cart> viewCartProduct() throws CustomException;

	public Cart addProductToCart(Cart cart) throws CustomException;

	public boolean deleteProductFromCart(int cartId) throws CustomException;
	
	public Orders_Info addProductToOrderList(Cart cart) throws CustomException;
	
	public List<Orders_Info> viewOrder() throws CustomException;
		
	public double payment(Cart cart) throws CustomException;
	
}
