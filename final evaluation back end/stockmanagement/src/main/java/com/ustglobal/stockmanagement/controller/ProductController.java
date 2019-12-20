package com.ustglobal.stockmanagement.controller;

import java.util.List;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.stockmanagement.customexception.CustomException;
import com.ustglobal.stockmanagement.dto.Cart;
import com.ustglobal.stockmanagement.dto.Orders_Info;
import com.ustglobal.stockmanagement.dto.Products_Info;
import com.ustglobal.stockmanagement.service.ProductService;
import com.ustglobal.stockmanagement.service.ProductServiceImpl;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*",allowCredentials = "true")
public class ProductController {
	
	@Autowired
	ProductService service = new ProductServiceImpl();
	
	@PostMapping("/addproduct")
	public Products_Info addProduct(@RequestBody Products_Info products) {
		try {
			products = service.addProduct(products);
		}catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return products;
	}
	
	@PostMapping("/addtocart")
	public Cart addProductToCart(@RequestBody Cart cart) {
		try {
			cart = service.addProductToCart(cart);
		}catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return cart;
	}
	
	@PostMapping("/addtoorder")
	public Orders_Info addProductToOrderList(@RequestBody Cart cart) {
		Orders_Info orders = null;
		try {
			orders = service.addProductToOrderList(cart);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return orders;
	}
	
	@GetMapping("/getproductlist")
	public List<Products_Info> productList(){
		List<Products_Info> products = null;
		try {
			products = service.productList();
		}catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return products;
	}
	
	@GetMapping("/getcartlist")
	public List<Cart> viewCartProduct(){
		List<Cart> cartList = null;
		try {
			cartList = service.viewCartProduct();
		}catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return cartList;
	}
	
	@GetMapping("/getorderlist")
	public List<Orders_Info> viewOrder(){
		List<Orders_Info> orders = null;
		try {
			orders =service.viewOrder();
		}catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return orders;
	}
	
	@GetMapping("/search-by-name")
	public Products_Info searchProductByName(@RequestParam("name") String name) {
		Products_Info pro = null;
		try {
			 pro = service.searchProductByName(name);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return pro;
	}
	@GetMapping("/search-by-category")
	public Products_Info searchProductByCategory(@RequestParam("category") String category) {
		Products_Info pro = null;
		try {
			pro = service.searchProductByCategory(category);
		}catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return pro;
	}
	
	@GetMapping("/search-by-company")
	public Products_Info searchProductByCompany(@RequestParam("company") String company) {
		Products_Info pro = null;
		try {
			pro = service.searchProductByCompany(company);
		}catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return pro;
	}
	
	@PutMapping("/updateproquantity")
	public Products_Info updateProductQuantity(Products_Info products) {
		Products_Info pro = null;
		try {
			pro = service.updateProductQuantity(products);
		}catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return pro;
		
	}
	
	@PutMapping("/updatepro")
	public Products_Info updateProduct(Products_Info products) {
		Products_Info pro = null;
		try {
			pro = service.updateProduct(products);
		}catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return pro;
	}
	
	@DeleteMapping("/deleteproduct/{id}")
	public boolean deleteProduct(@PathVariable("id") int id) {
		boolean isDeleted = false;
		try {
			isDeleted = service.deleteProduct(id);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return isDeleted;
	}
	
	@DeleteMapping("/deletefromcart/{cartid}")
	public boolean deleteProductFromCart(@PathVariable("cartid") int cartId) {
		boolean isDeleted = false;
		try {
			isDeleted = service.deleteProductFromCart(cartId);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return isDeleted;
	}
	
}
