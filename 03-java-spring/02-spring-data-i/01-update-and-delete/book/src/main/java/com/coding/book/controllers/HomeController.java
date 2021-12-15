package com.coding.book.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.coding.book.models.Book;
import com.coding.book.services.BookService;

@Controller
public class HomeController {
	
	@Autowired
	private BookService sService;
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
//	create a book
	@PostMapping("/create")
	public Book create() {
		
	}
	
	
}
