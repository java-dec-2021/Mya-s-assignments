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
	private BookService bService;
	
	@GetMapping("/getallbooks")
		private List<Book> getBooks() {
			return this.bService.allBooks();
		}
	
//	get a student
	@GetMapping("/getABook/{id}")
	private Book getABook(@PathVariable (value="id") Long id) {
		return this.bService.getabook(id);
	}
	
//	create a student 
	@PostMapping("/books/create")
	private Book create(Book book) {
		return bService.create(book);
	}
	
//	delete a student 
	@DeleteMapping("/books/delete/{id}")
	private void deleteABook(@PathVariable (value="id") Long id) {
		bService.delete(id);
	}
}
