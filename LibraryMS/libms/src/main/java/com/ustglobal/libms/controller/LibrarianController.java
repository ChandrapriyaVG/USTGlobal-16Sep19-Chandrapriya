package com.ustglobal.libms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.libms.dto.Books;
import com.ustglobal.libms.dto.BooksRegistration;
import com.ustglobal.libms.dto.Transaction;
import com.ustglobal.libms.dto.Users;
import com.ustglobal.libms.service.LibrarianService;
import com.ustglobal.libms.service.LibrarianServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class LibrarianController {

	@Autowired
	LibrarianService service = new LibrarianServiceImpl();

	@PostMapping("/library/librarian/student")
	public Users addStudent(@RequestBody Users users) {
		try {
			users = service.registerStudent(users);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return users;
	}// end of addStudent()

	@PostMapping("/library/librarian/createbook")
	public Boolean addBooks(@RequestBody Books booksInventory) {
		boolean isAdded = false;
		try {
			service.addBooks(booksInventory);
			isAdded = true;
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return isAdded;
	}// end of addBooks()

	@DeleteMapping("/library/librarian/{bookId}")
	public Boolean deleteBook(@PathVariable("bookId") int bookId) {
		boolean isDeleted = false;
		try {
			service.deleteBook(bookId);
			isDeleted = true;
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return isDeleted;
	}// end of deleteBook()

	@GetMapping("/library/librarian/getBooks")
	public List<Books> showAllBook() {
		List<Books> bookList = null;
		try {
			bookList = service.showAllBooks();
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return bookList;
	}// end of showAllBooks()
	
	@GetMapping("/library/librarian/getStudent/{id}")
	public Users getStuentInfo(@PathVariable("id")int id) {
		Users users = null;
		try {
			users = service.getStudentInfo(id);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return users;
	}// end of getStudentInfo()
	
	@DeleteMapping("/library/librarian/deleteStudent/{id}")
	public Boolean deleteStudent(@PathVariable("id") int id) {
		boolean isDeleted = false;
		try {
			isDeleted = service.deleteStudent(id);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return isDeleted;
	}// end of deleteStudent()

	@GetMapping("/library/librarian/viewRequest")
	public List<BooksRegistration> viewRequests() {
		List<BooksRegistration> booksRegistrations = null;
		try {
			booksRegistrations = service.viewRequest();
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return booksRegistrations;
	}// end of viewRequest()
	
	@PostMapping("/library/librarian/accept/{registrationId}")
	public Boolean acceptRequest(@PathVariable("registrationId") int registrationId) {
		boolean isAccepted = false;
		try {
			isAccepted = service.acceptRequest(registrationId);
		}catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return isAccepted;
	}
	
	@DeleteMapping("/library/librarian/reject/{registrationId}")
	public Boolean rejectRequest(@PathVariable("registrationId") int registrationId) {
		boolean isRejected = false;
		try {
			isRejected = service.rejectRequest(registrationId);
		}catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return isRejected;
	} 
	@GetMapping("/library/librarian/issuedBooks")
	public List<Transaction> viewIssuedBooks(){
		List<Transaction> transaction = null;
		try {
			transaction = service.viewIssuedBooks();
		}catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return transaction;
	}
}

