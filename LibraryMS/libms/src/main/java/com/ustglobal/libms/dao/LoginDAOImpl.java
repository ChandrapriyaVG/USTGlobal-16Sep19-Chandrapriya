package com.ustglobal.libms.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ustglobal.libms.controller.CustomException;
import com.ustglobal.libms.dto.Users;

@Repository
public class LoginDAOImpl implements LoginDAO {
	
	static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("book-unit");
	static int id;
	
	public Users login(Users users) throws CustomException  {
		Users user = null;
		LoginDAOImpl.id = users.getId();
		try {
			EntityManager manager = FACTORY.createEntityManager();
			Query query = manager.createQuery("FROM Users WHERE id= :id and password=:pswd");
			query.setParameter("id", LoginDAOImpl.id);
			query.setParameter("pswd", users.getPassword());
			user = (Users)query.getSingleResult();
		} catch (Exception e) {
			throw new CustomException("Failed to login");
		}
		return user;
	}
	
	
}
