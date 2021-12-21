package com.coding.languages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.languages.models.Languages;
import com.coding.languages.services.LanguagesService;

@RestController
public class APIController {
	@Autowired
	private LanguagesService lService;
	
	@GetMapping("/langPage")
	private List<Languages> getLanguages() {
		return this.lService.allLanguages();
	}
	
//	find one language
	@GetMapping("/langPage/{id}")
	private Languages getOne(@PathVariable (value="id") Long id) {
		return this.lService.findOne(id);
	}
	
//	create
	@PostMapping("/create/languages")
	public Languages create(Languages language){
		 return lService.create(language);
	}
	
//	delete
	@DeleteMapping("/delete/languages/{id}")
	public void delete(@PathVariable (value="id")Long id){
		 lService.delete(id);
		 
	}
//	update
		
}
