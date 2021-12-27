package com.coding.dn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.dn.models.Dojo;
import com.coding.dn.models.Ninja;
import com.coding.dn.services.DojoService;
import com.coding.dn.services.NinjaService;

@RestController
public class ApiController {

	@Autowired
	private DojoService dService;
	
	@Autowired
	private NinjaService nService;
	
//	get all dojos;
	@GetMapping("/allDojos")
	private List<Dojo> allDojosApi(){
		return dService.allDojos();
	}
	
//	create a dojo
	@PostMapping("/create/Dojo/api")
	private Dojo createDojoApi(Dojo d) {
		return dService.create(d);
	}
	
//	create a ninja
	@PostMapping("/create/Ninja/api")
	private Ninja createNinjaApi(Ninja ninja) {
		return nService.create(ninja);
	}
	
//	get all ninjas
	@PostMapping("/get/Ninja/api")
	private List<Ninja> getNinjaApi(Ninja ninja) {
		return nService.allNinja();
	}
	
	@GetMapping("/show/{id}")
	public Dojo dojo_id(@PathVariable ("id") Long id){
		return dService.getOne(id);
		
	}
	
	@GetMapping("ninja/show/{id}")
	public Ninja ninja_id(@PathVariable ("id") Long id){
		return nService.ninja_id(id);
		
	}
}
