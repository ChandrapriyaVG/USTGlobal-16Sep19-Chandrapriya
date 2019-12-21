package com.ustglobal.libms.dao;

import java.util.List;

import com.ustglobal.libms.controller.CustomException;
import com.ustglobal.libms.dto.Books;
import com.ustglobal.libms.dto.Transaction;

public interface StudentDAO {

	public List<Books> searchBook(Books booksInventory) throws CustomException;
	public Boolean requestBook(int bookId) throws CustomException;
	public List<Transaction> requestStatus(int registrationId) throws CustomException;
}
