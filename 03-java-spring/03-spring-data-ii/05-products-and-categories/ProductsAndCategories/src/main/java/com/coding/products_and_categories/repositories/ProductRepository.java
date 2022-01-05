package com.coding.products_and_categories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.products_and_categories.models.Category;
import com.coding.products_and_categories.models.Product;

@Repository
public interface ProductRepository extends CrudRepository <Product, Long> {
	
	List<Product> findAll(); 
	
	List<Product> findByCategoriesNotContains(Category category);
}
