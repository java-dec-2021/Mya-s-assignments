package com.coding.book.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.book.models.Book;
import com.coding.book.services.BookService;

@RestController
public class APIController {
	@Autowired
	private BookService sService;
	
	@GetMapping("/books")
	private List<Book> getBooks() {
		return this.sService.allBooks();
	}
	
	@GetMapping("/books/{id}")
	private Book getOneBook(@PathVariable("id") Long id) {
		return this.sService.findBook(id);
	}
	
	@PostMapping("/books/create")
	private Book create(Book book) {
		return sService.createBook(book);
	}
	
	@DeleteMapping("/books/delete/{id}")
	private void deleteBook(@PathVariable("id") Long id) {
		sService.deleteBook(id);
//		optional
		System.out.println("successful");
	}
}

