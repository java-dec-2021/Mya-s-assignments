package com.coding.products_and_categories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coding.products_and_categories.models.Product;
import com.coding.products_and_categories.services.CategoryService;
import com.coding.products_and_categories.services.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService pService;
	
	@Autowired
	private CategoryService cService;
	
	
//	public ProductController(ProductService pService) {
//		this.pService = pService;
//	}

	@GetMapping("/products/new")
	public String new_product(@ModelAttribute ("newProduct") Product product) {
		return "new_product.jsp";
	}
	
	@PostMapping("/create/product")
	public String create_product(Product product) {
		pService.createProduct(product);
		return "redirect:/products/new";
	}
	
	@GetMapping("/products/{id}")
	public String getOneProduct(@PathVariable ("id") Long id, Model model, Product pro) {
		Product product = pService.getOne(id);
		model.addAttribute("product", product);
		model.addAttribute("cat", cService.findCategoryNotInList(pro));
		return "product.jsp";
	}
	@PostMapping("/add/product/{id}")
	public String create_category(@PathVariable ("id") Long categoryId, Model model, @RequestParam ("pros") Long id) {
		cService.addProductToCategory(pService.getOne(id), cService.getOneCategory(categoryId));
		return "redirect:/categories/{id}";
	}
	
}
