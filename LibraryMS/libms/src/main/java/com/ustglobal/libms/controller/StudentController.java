package com.ustglobal.libms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.libms.dto.Books;
import com.ustglobal.libms.dto.Transaction;
import com.ustglobal.libms.service.StudentService;
import com.ustglobal.libms.service.StudentServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class StudentController {

	@Autowired
	StudentService service = new StudentServiceImpl();
	
	@PostMapping("/library/librarian/getBooks/")
	public List<Books> searchBook(@RequestBody Books booksInventory) {
		List<Books> bookList = null;
		try {
			bookList = service.searchBook(booksInventory);
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return bookList;
	}// end of searchBook()
	
	@GetMapping("library/student/book/request/{bookId}")
	public Boolean requestBook(@PathVariable("bookId") int bookId) {
		boolean isRequested = false;
		try {
			service.requestBook(bookId);
			isRequested = true;
		} catch (CustomException e) {
			System.err.println(e.getMessage());
		}
		return isRequested;
	}// end of requestBook()
	
	
	@GetMapping("/library/student/requestStatus/{registrationId}")
	public List<Transaction> requestStatus(@PathVariable("registrationId") int registrationId){
		List<Transaction> transaction = null;
		try {
			service.requestStatus(registrationId);
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return transaction;
	}
}
