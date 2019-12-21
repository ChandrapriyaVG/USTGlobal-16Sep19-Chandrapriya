package com.ustglobal.libms.dao;

import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.libms.controller.CustomException;
import com.ustglobal.libms.dto.Books;
import com.ustglobal.libms.dto.BooksRegistration;
import com.ustglobal.libms.dto.Transaction;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
	static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("book-unit");

	public List<Books> searchBook(Books booksInventory) throws CustomException {
		List<Books> booksInventories = null;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			TypedQuery<Books> query = manager.createQuery("FROM Books WHERE bookName = :bName and author1 =:author", Books.class);
			query.setParameter("bName", booksInventory.getBookName());
			query.setParameter("author", booksInventory.getAuthor1());
			booksInventories = query.getResultList();
		} catch (Exception e) {
			throw new CustomException("Failed to fetch the books");
		}
		return booksInventories;
	}

	public Boolean requestBook(int bookId) throws CustomException{
		BooksRegistration booksRegistration = new BooksRegistration();
		booksRegistration.setId(LoginDAOImpl.id);
		booksRegistration.setBookId(bookId);
		booksRegistration.setRegistrationDate(new Date());
		Random random = new Random();
		booksRegistration.setRegistrationId(random.nextInt(10000));
		boolean isRequested = false;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(booksRegistration);
			manager.getTransaction().commit();
			isRequested = true;
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to request");
		}
		return isRequested;
	}

	@Override
	public List<Transaction> requestStatus(int registrationId) throws CustomException {
		EntityManager manager = FACTORY.createEntityManager();
		String jpql = "from Transaction where registrationId=:rId";
		try {
			TypedQuery<Transaction> query = manager.createQuery(jpql, Transaction.class);
			query.setParameter("rId", registrationId);
			List<Transaction> beans = query.getResultList();
			return beans;

		} catch(Exception e) {
			throw new CustomException("Failed to Get All Request Status");

		} finally{
			manager.close();
		}
	}
	
	
}
