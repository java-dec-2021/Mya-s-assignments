package com.coding.book.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.book.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	
	List<Book>findAll();

//	Create
	
//	Read
	
//	Update 
	
//	Delete
}
