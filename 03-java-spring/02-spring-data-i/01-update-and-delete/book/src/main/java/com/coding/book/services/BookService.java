package com.coding.book.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coding.book.models.Book;
import com.coding.book.repositories.BookRepository;

@Service
public class BookService {

	private BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;	
	}
	public List<Book> allBooks(){
		return bookRepository.findAll();
	}
	public Book findBook(Long id) {
		return bookRepository.findById(id).orElse(null);
	}
	
	public Book createBook(Book book) {
		return bookRepository.save(book);
	}
	
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
}
