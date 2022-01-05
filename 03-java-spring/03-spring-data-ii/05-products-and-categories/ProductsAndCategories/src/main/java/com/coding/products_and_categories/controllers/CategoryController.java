package com.coding.products_and_categories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coding.products_and_categories.models.Category;
import com.coding.products_and_categories.services.CategoryService;
import com.coding.products_and_categories.services.ProductService;


@Controller
public class CategoryController {

	@Autowired
	private CategoryService cService;
	
	@Autowired
	private ProductService pService;
	
//	public CategoryController(CategoryService cService) {
//		this.cService = cService;
//	}

	@GetMapping("/categories/new")
	public String newCategory(@ModelAttribute ("newCategory") Category category) {
		return "new_category.jsp";
	}
	
	@PostMapping("/create/category")
	public String createCategory(@ModelAttribute ("newCategory") Category category) {
		Category new_Category=cService.createCategory(category);
		return "redirect:/categories/new";
	}
	
	@PostMapping("/add/category/{id}")
	public String create_product( @PathVariable ("id") Long productId, Model model, @RequestParam("cats") Long id ) {
		cService.getOneCategory(id);
		pService.getOne(productId);
		pService.addCategoryToProduct(pService.getOne(productId), cService.getOneCategory(id));
		
		return "redirect:/products/{id}";
	}
	
	@GetMapping("/categories/{id}")
	public String getOneCategory(@PathVariable ("id") Long id, Model model, Category category) {
		model.addAttribute("OneCategory",cService.getOneCategory(id));
		model.addAttribute("listOfProducts", pService.findProductNotInList(category));
		return "category.jsp";
	}
	

}
