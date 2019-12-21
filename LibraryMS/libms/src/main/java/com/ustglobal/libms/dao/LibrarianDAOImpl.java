package com.ustglobal.libms.dao;

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
import com.ustglobal.libms.dto.Users;

@Repository
public class LibrarianDAOImpl implements LibrarianDAO {

	static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("book-unit");

	public Users registerStudent(Users user) throws CustomException {
		user.setType("Student");
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(user);
			manager.getTransaction().commit();
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to register student");
		}
		return user;
	}

	public Boolean deleteStudent(int id) throws CustomException {
		boolean isDeleted = false;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			Users users = manager.find(Users.class, id);
			manager.remove(users);
			manager.getTransaction().commit();
			isDeleted = true;
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to delete student");
		}
		return isDeleted;
	}

	public Boolean addBooks(Books booksInventory) throws CustomException {
		boolean isAdded = false;
		Random random = new Random();
		booksInventory.setBookId(random.nextInt(10000));
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(booksInventory);
			manager.getTransaction().commit();
			isAdded = true;
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to add books");
			
		}
		return isAdded;
	}

	public Boolean deleteBook(int bookId) throws CustomException {
		boolean isDeleted = false;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			Books booksInventory = manager.find(Books.class, bookId);
			manager.remove(booksInventory);
			manager.getTransaction().commit();
			isDeleted = true;
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to delete books");
		}
		return isDeleted;
	}

	public Users getStudentInfo(int id) throws CustomException {
		Users users = null;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			users = manager.find(Users.class, id);
			manager.getTransaction().commit();
			manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to fetch student info");
		}
		return users;
	}

	public List<BooksRegistration> viewRequest() throws CustomException {
		List<BooksRegistration> booksRegistrations = null;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			TypedQuery<BooksRegistration> typedQuery = manager.createQuery("FROM BooksRegistration", BooksRegistration.class);
			 booksRegistrations = typedQuery.getResultList();
			 manager.close();
		} catch (Exception e) {
			throw new CustomException("Failed to fetch the requests");
		}
		return booksRegistrations;
	}

	public List<Books> showAllBooks() throws CustomException {
		List<Books> booksInventories = null;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			TypedQuery<Books> query = manager.createQuery("FROM Books", Books.class);
			booksInventories = query.getResultList();
		} catch (Exception e) {
			throw new CustomException("Failed to fetch the books");
		}
		return booksInventories;
	}

	@Override
	public Boolean acceptRequest(int registrationId) throws CustomException {
		boolean isAccepted = false;
		
		Transaction trans = new Transaction();
		try {
		EntityManager manager = FACTORY.createEntityManager();
		manager.getTransaction().begin();
		BooksRegistration br = manager.find(BooksRegistration.class, registrationId);
		trans.setRegistrationId(br.getRegistrationId());
		trans.setIssueDate(br.getRegistrationDate());
		trans.setStudentId(br.getId());
		manager.persist(trans);
		isAccepted = true;
		manager.remove(br);
		manager.getTransaction().commit();
		manager.close();
		}catch (Exception e) {
			throw new CustomException("Failed to Accept Request");
		}
		return isAccepted;
	}

	@Override
	public Boolean rejectRequest(int registrationId) throws CustomException {
		boolean isRejected = false;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			manager.getTransaction().begin();
			BooksRegistration bookRegistration = manager.find(BooksRegistration.class, registrationId);
			manager.remove(bookRegistration);
			manager.getTransaction().commit();
			isRejected = true;
			manager.close();
		}catch (Exception e) {
			throw new CustomException("Failed to Reject Request");
		}
		return isRejected;
		
	}

	@Override
	public List<Transaction> viewIssuedBooks() throws CustomException {
		List<Transaction> trans = null;
		try {
			EntityManager manager = FACTORY.createEntityManager();
			TypedQuery<Transaction> jpql = manager.createQuery("FROM Transaction", Transaction.class);
			trans = jpql.getResultList();
			manager.close();
		}catch (Exception e) {
			throw new CustomException("Failed to fetch issued books");
		}
		
		return trans;
	}
	
	
}
