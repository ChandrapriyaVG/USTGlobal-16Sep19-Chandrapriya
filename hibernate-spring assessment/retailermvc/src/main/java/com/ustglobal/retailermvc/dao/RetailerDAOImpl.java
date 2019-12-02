package com.ustglobal.retailermvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.retailermvc.beans.Product;
import com.ustglobal.retailermvc.beans.Retailer;

@Repository
public class RetailerDAOImpl implements RetailerDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public Retailer login(int id, String password) {
		String jpql = "from Retailer where id=:id and password=:password";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Retailer> query = manager.createQuery(jpql,Retailer.class);
		query.setParameter("id", id);
		query.setParameter("password", password);
		try {
		Retailer retailer = query.getSingleResult();
		return retailer;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int register(Retailer retailer) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(retailer);
			transaction.commit();
			return retailer.getId();
		} catch (Exception e) {		
			e.printStackTrace();
			transaction.rollback();
			return -1;
		}
	}

	@Override
	public Product searchProductById(int orderId) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Product.class, orderId);
	}

	@Override
	public boolean updatePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Retailer retailer = manager.find(Retailer.class,id);
		retailer.setPassword(password);
		transaction.commit();
		return true;
	}

}
