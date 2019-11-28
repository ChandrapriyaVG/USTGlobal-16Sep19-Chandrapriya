package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

@Configuration
public class BookConfiguration {

	@Bean(name="book")
//	@Scope("prototype")
	public Book getBook() {
		Book book = new Book();
		book.setAuthor("Mishkhat");
		book.setName("Mishuu");
		book.setPrice(999);
		return book;
	}
	@Bean(name="author")
	public Author getAuthor() {
		
		Author author = new Author();
		author.setName("Charlie");
		author.setPenName("lee");
		return author;
	}
}
