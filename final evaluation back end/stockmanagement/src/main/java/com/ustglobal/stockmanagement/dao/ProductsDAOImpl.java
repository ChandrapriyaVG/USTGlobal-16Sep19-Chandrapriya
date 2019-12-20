package com.ustglobal.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transaction;

import org.apache.catalina.Manager;
import org.springframework.stereotype.Repository;

import com.ustglobal.stockmanagement.customexception.CustomException;
import com.ustglobal.stockmanagement.dto.Cart;
import com.ustglobal.stockmanagement.dto.Orders_Info;
import com.ustglobal.stockmanagement.dto.Products_Info;

@Repository
public class ProductsDAOImpl implements ProductsDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;
	EntityTransaction et = null;
	EntityManager em = null;

	@Override
	public Products_Info addProduct(Products_Info products) throws CustomException {

		try {
			em =factory.createEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(products);
			et.commit();
		}catch (Exception e) {
			et.rollback();
			throw new CustomException("Failed to add products!");
		}

		return products;
	}

	@Override
	public boolean deleteProduct(int id) throws CustomException {
		boolean isDeleted = false;
		try {
			em = factory.createEntityManager();
			et = em.getTransaction();
			et.begin();
			Products_Info products = em.find(Products_Info.class, id);
			em.remove(products);
			et.commit();
			isDeleted = true;
		}catch (Exception e) {
			et.rollback();
			throw new CustomException("Failed to delete products!");
		}
		return isDeleted;
	}

	@Override
	public Products_Info updateProduct(Products_Info products) throws CustomException{

		em = factory.createEntityManager();
		et = em.getTransaction();

		Products_Info product1 = em.find(Products_Info.class, products.getId());
		if ( product1 != null) {

			if (products.getName() != null) {
				product1.setName(products.getName());
			}
			if (products.getCategory() != null) {
				product1.setCategory(products.getCategory());
			}

			if (products.getQuantity() != 0) {
				product1.setQuantity(products.getQuantity());
			}
			if (products.getPrice() != 0) {
				product1.setPrice(products.getPrice());
			}

		}

		try {
			et.begin();
			em.persist(product1);
			et.commit();

		} catch (Exception e) {
			throw new CustomException("Failed to updqate product!");
		}
		em.close();

		return product1;
	}

	@Override
	public List<Products_Info> productList() throws CustomException{
		em = factory.createEntityManager();

		String jpql = "from Products_Info";
		TypedQuery<Products_Info> query = em.createQuery(jpql, Products_Info.class);

		List<Products_Info> productList = null;
		try {
			productList = query.getResultList();

		} catch (Exception e) {
			throw new CustomException("Failed to fetch product list");
		}
		em.close();
		return productList;
	}

	@Override
	public Products_Info updateProductQuantity(Products_Info products) throws CustomException {

		em = factory.createEntityManager();
		et = em.getTransaction();

		Products_Info productBean1 = em.find(Products_Info.class, products.getId());
		if (productBean1 != null) {
			if (products.getQuantity() <= 0) {
				productBean1.setQuantity(products.getQuantity());
			}
		}
		try {
			et.begin();
			em.persist(productBean1);
			et.commit();

		} catch (Exception e) {
			throw new CustomException("Failed to update quantity");
		}
		em.close();
		return productBean1;
	}


	@Override
	public List<Cart> viewCartProduct() throws CustomException {
		em = factory.createEntityManager();
		String jpql = "from Cart ";
		
			TypedQuery<Cart> que = em.createQuery(jpql, Cart.class);
			List<Cart> cartList = que.getResultList();
		
		em.close();
		return cartList;

	}

	@Override
	public Cart addProductToCart(Cart cart) throws CustomException {
		Products_Info productBean = null;

		et.begin();

		String productName = cart.getProductName();

		String jpql2 = "from ProductBean where productName=:productName";

		Query q2 = em.createQuery(jpql2);
		q2.setParameter("productName", productName);
		productBean = (Products_Info) q2.getSingleResult();
		cart.setProductName(productName);

		double productPrice = productBean.getPrice();
		cart.setProductPrice(productPrice);

		int productId = productBean.getId();
		cart.setProductId(productId);

		String productCategory = productBean.getCategory();
		cart.setProductCategory(productCategory);

		int productQuantity = cart.getProductQuantity();
		cart.setProductQuantity(productQuantity);
		try {

			em.persist(cart);
			et.commit();

		} catch (Exception e) {
			throw new CustomException("Failed to add product");
		}
		em.close();
		return cart;
	}

	@Override
	public boolean deleteProductFromCart(int cartId) throws CustomException {
		boolean isDeleted = false;
		try {
			et = em.getTransaction();
			et.begin();
			String jpql = "delete from  Cart where cartId=:cartId";
			Query que = em.createQuery(jpql);
			que.setParameter("cartId", cartId);
			int result = que.executeUpdate();
			et.commit();
			isDeleted = true;

		} catch (Exception e) {
			throw new CustomException("Failed to delete");
		}

		em.close();
		return isDeleted;
	}


	@Override
	public List<Orders_Info> viewOrder() throws CustomException {
		em = factory.createEntityManager();
		String jpql = "from Orders_Info ";
		
			TypedQuery<Orders_Info> que = em.createQuery(jpql, Orders_Info.class);
			List<Orders_Info> orders = que.getResultList();
		
		em.close();
		return orders;

	}

	@Override
	public double payment(Cart cart) throws CustomException {
		em = factory.createEntityManager();
		et = em.getTransaction();
		String jpql = "select SUM(productPrice*productQuantity) from Cart where cartId=:cartId AND productId=:productId";

		et.begin();
		Query que = em.createQuery(jpql);
		
		int productId = cart.getProductId();
		int cartId = cart.getCartId();
		
		que.setParameter("productId", productId);
		que.setParameter("cartId", cartId);
		
		double totalBill = 0;
		List<Double> list = que.getResultList();
		for (Double double1 : list) {
			totalBill = double1.doubleValue();
		}

		et.commit();
		return totalBill;
	}

	@Override
	public Products_Info searchProductByName(String name) throws CustomException {
		String jpql = "from Product_Info where name=:name";
		em = factory.createEntityManager();
		TypedQuery<Products_Info> query = em.createQuery(jpql, Products_Info.class);
		query.setParameter("name", name);
		try {
			Products_Info bean = query.getSingleResult();
			return bean;
		} catch(Exception e) {
			throw new CustomException("Failed to search by name");
		}
	}

	@Override
	public Products_Info searchProductByCategory(String category) throws CustomException {
		String jpql = "from Product_Info where category=:category";
		em = factory.createEntityManager();
		TypedQuery<Products_Info> query = em.createQuery(jpql, Products_Info.class);
		query.setParameter("category", category );
		try {
			Products_Info bean = query.getSingleResult();
			return bean;
		} catch(Exception e) {
			throw new CustomException("Failed to search by category");	
		}
	}

	@Override
	public Products_Info searchProductByCompany(String company) throws CustomException {
		String jpql = "from Product_Info where company=:company";
		em = factory.createEntityManager();
		TypedQuery<Products_Info> query = em.createQuery(jpql, Products_Info.class);
		query.setParameter("company", company );
		try {
			Products_Info bean = query.getSingleResult();
			return bean;
		} catch(Exception e) {
			throw new CustomException("Failed to search by company");	
		}
	}

	@Override
	public Orders_Info addProductToOrderList(Cart cart) throws CustomException {
		em = factory.createEntityManager();
		et = em.getTransaction();
		Orders_Info orders = new Orders_Info();
		Cart carts = new Cart();
		try {
			String jpql = "select SUM(productPrice*productQuantity) from Cart where cartId=:cartId AND productId=:productId";

			et.begin();
			Query que = em.createQuery(jpql);
			
			int productId = cart.getProductId();
			int cartId = carts.getCartId();
			
			que.setParameter("productId", productId);
			que.setParameter("cartId", cartId);
			
			double totalBill = 0;
			List<Double> list = que.getResultList();
			for (Double double1 : list) {
				totalBill = double1.doubleValue();
			}
			orders.setTotal_price(totalBill);
			double totalBillwithGst = totalBill + (0.18)*totalBill;
			
			orders.setTotal_price_with_gst(totalBillwithGst);
			
			em.persist(orders);
			et.commit();
			return orders;
		}catch (Exception e) {
			throw new CustomException("Failed to order");
		}
	}

}
