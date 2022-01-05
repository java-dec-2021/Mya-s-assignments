package com.coding.products_and_categories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.products_and_categories.models.Category;
import com.coding.products_and_categories.models.Product;
import com.coding.products_and_categories.repositories.CategoryRepository;
import com.coding.products_and_categories.repositories.ProductRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository cRepo;
	
	@Autowired
	private ProductRepository pRepo;
	
//	public CategoryService(CategoryRepository cRepo) {
//		this.cRepo = cRepo;
//	}
	public List<Category> allCategories(){
		return cRepo.findAll();
	}

	public Category createCategory(Category c) {
		return cRepo.save(c);
	}
	
	public Category getOneCategory(Long id) {
		return cRepo.findById(id).orElse(null);
	}
	
	public List<Category> findCategoryNotInList(Product pro){
		return cRepo.findByProductsNotContains(pro);
	}
	
	public void addProductToCategory(Product pro, Category cat) {
		List<Product> existingProduct=cat.getProducts();
		existingProduct.add(pro);
		cRepo.save(cat);
		}
	
//	add a category to a product
//	public Category categoryWithProduct() {
////		product id
////		category id
////		create connection with category id and product id
////		get getId from models
//		
//	}
	
//	find categories which is not contain in the dropdown list
//	public List<Category> dropDownListCategories(Product p){
//		return cRepo.findAllTheProductsNotContains(p);
//	}
}