package com.coding.products_and_categories.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.products_and_categories.models.Category;
import com.coding.products_and_categories.models.Product;
import com.coding.products_and_categories.services.CategoryService;
import com.coding.products_and_categories.services.ProductService;

@RestController
public class ApiController {
	
	@Autowired
	private ProductService pService;
	
	@Autowired
	private CategoryService cService;
	

//	public ApiController(ProductService pService) {
//		this.pService = pService;
//	}
	
	@PostMapping("/create/product/api")
	private Product createProductApi(Product p){
		return pService.createProduct(p);
	}
	
	@PostMapping("/create/category/api")
	private Category createCategoryApi(Category category){
		return cService.createCategory(category);
	}
	
	@GetMapping("/allProductApi")
	private List<Product> allProducts(){
		return pService.allProducts();
	}
	
	@GetMapping("/product/{id}/api")
	private Product getOneProduct(@PathVariable ("id") Long id) {
		return pService.getOne(id);
	}
	
	@GetMapping("/category/{id}/api")
	private Category getOneCategory(@PathVariable ("id") Long id) {
		return cService.getOneCategory(id);
	}
	
	@GetMapping("/allCategories")
	private List<Category> allCategories() {
		return cService.allCategories();
	}
	
//	@GetMapping("/dropDownListForCategories")
//	private List<Product> dropDownListCategories(Category cat) {
//		return pService.findCategoryNotInList(cat);
//	}
	
	
}
