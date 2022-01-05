package com.coding.products_and_categories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.products_and_categories.models.Category;
import com.coding.products_and_categories.models.Product;
import com.coding.products_and_categories.repositories.CategoryRepository;
import com.coding.products_and_categories.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository pRepo;
	
	@Autowired
	private CategoryRepository cRepo;
	
	
//	public ProductService(ProductRepository pRepo) {
//		this.pRepo = pRepo;
//	}
	public List<Product> allProducts(){
		return pRepo.findAll();
	}

	public Product createProduct(Product p) {
		return pRepo.save(p);
	}
	
	public Product getOne(Long id) {
		return pRepo.findById(id).orElse(null);
	}
	
	public List<Product> findProductNotInList(Category category){
		return pRepo.findByCategoriesNotContains(category);
	}
	
	public void addCategoryToProduct(Product pro, Category cat) {
		List<Category> existingCategory=pro.getCategories();
		existingCategory.add(cat);
		pRepo.save(pro);
		}

//	public void addProductToCategory(Product pro, Category cat) {
//		List<Product> existingProduct=cat.getProducts();
//		existingProduct.add(pro);
//		cRepo.save(cat);
//		}

}
