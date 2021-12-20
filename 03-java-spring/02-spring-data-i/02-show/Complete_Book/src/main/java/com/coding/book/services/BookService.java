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
//	 list all books
	public List<Book> allBooks(){
		return bookRepository.findAll();
	}
	
//	One book
	public Book getabook(Long id){
		return bookRepository.findById(id).orElse(null);
	}
	
//	create a book
	public Book create(Book book){
		return bookRepository.save(book);
	}
	
//	delete a book 
	public void delete(Long id){
		bookRepository.deleteById(id);
	}

//	update a book 
	public Book update(Long id, String title, String description, String language, String number_of_pages){
//		query for a book
		Book book = getabook(id);
		book.setTitle(title);
		book.setDescription(description);
		book.setLanguage(language);
		book.setNumber_of_pages(number_of_pages);
		bookRepository.deleteById(id);
		return bookRepository.save(book);
	}
}
