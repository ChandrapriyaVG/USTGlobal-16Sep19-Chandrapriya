package com.ustglobal.libms.service;

import java.util.List;

import com.ustglobal.libms.controller.CustomException;
import com.ustglobal.libms.dto.Books;
import com.ustglobal.libms.dto.BooksRegistration;
import com.ustglobal.libms.dto.Transaction;
import com.ustglobal.libms.dto.Users;

public interface LibrarianService {
	
	public Users registerStudent(Users user) throws CustomException;
	public Boolean addBooks(Books booksInventory) throws CustomException;
	public Boolean deleteBook(int bookId) throws CustomException;
	public List<Books> showAllBooks() throws CustomException;
	public Users getStudentInfo(int id) throws CustomException;
	public List<BooksRegistration> viewRequest() throws CustomException;
	public Boolean deleteStudent(int id) throws CustomException;
	public Boolean acceptRequest(int registrationId) throws CustomException;
	public Boolean rejectRequest(int registrationId) throws CustomException;
	public List<Transaction> viewIssuedBooks() throws CustomException;

	

}
