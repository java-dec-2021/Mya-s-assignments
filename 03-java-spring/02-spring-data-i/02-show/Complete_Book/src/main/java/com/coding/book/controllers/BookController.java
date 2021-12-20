package com.coding.book.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coding.book.models.Book;
import com.coding.book.services.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bService;
	
	@RequestMapping("/")
	public String index(@ModelAttribute("newBook") Book book) {
		return "index.jsp";
	}
	
	@RequestMapping("/books")
	public String books(Model model) {
		List<Book> book= this.bService.allBooks();
		model.addAttribute("books", book);
		return "Book.jsp";
	}
	
	@PostMapping("/welcome")
	public String books(
			@RequestParam(value="title") String title,
			@RequestParam(value="description") String description ,
			@RequestParam(value="language") String language,
			@RequestParam(value="number_of_pages") String number_of_pages,
			Model model) {
			model.addAttribute("title", title);
			model.addAttribute("description", description);
			model.addAttribute("language", language);
			model.addAttribute("number_of_pages",number_of_pages);
			
		return "Book.jsp";
	}
	
//	create a book
	@PostMapping("/create")
	public String create(@Valid @ModelAttribute("newBook") Book book, BindingResult results) {
		if(results.hasErrors()) {
			return "index.jsp";
		}
		else {
			Book newBook=bService.create(book);
		}
		return "redirect:/books";
	}
	
//	delete a book
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable (value="id") Long id) {
		bService.delete(id);
		return "redirect:/books";
	}
	
//	Edit a book
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable (value="id") Long id, @ModelAttribute("editedBook") Book book, Model model) {
		Book editBook = bService.getabook(id);
		model.addAttribute("editBook", editBook);
		return "edit.jsp";
	}
	
//	update a book
	@PutMapping("/update/{id}")
	public String update(@PathVariable (value="id") Long id, @Valid @ModelAttribute("editedBook") Book book, BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		else {
			Book newBook=bService.update(id, book.getTitle(),book.getDescription(), book.getLanguage(), book.getNumber_of_pages());
		}
		return "redirect:/books";
	}

}
