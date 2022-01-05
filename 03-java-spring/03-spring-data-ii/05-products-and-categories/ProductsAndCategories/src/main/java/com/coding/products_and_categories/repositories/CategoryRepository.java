package com.coding.products_and_categories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.products_and_categories.models.Category;
import com.coding.products_and_categories.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository <Category, Long> {
	
	List<Category> findAll(); 
	
	List<Category> findByProductsNotContains(Product product);
	
}
