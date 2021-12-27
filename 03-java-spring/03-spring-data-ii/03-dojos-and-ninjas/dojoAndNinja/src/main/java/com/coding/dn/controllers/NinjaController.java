package com.coding.dn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coding.dn.models.Dojo;
import com.coding.dn.models.Ninja;
import com.coding.dn.services.DojoService;
import com.coding.dn.services.NinjaService;

@Controller
public class NinjaController {
	
	@Autowired
	private NinjaService nService;
	
	@Autowired
	private DojoService dService;
	
	@GetMapping("/ninjas/new")
	public String index_2(@ModelAttribute ("newNinja") Ninja n, Model model) {
		model.addAttribute("Dojos", dService.allDojos());
		return "ninja.jsp";
	}

	@PostMapping("/ninjas/new")
	public String new_ninja( @ModelAttribute ("newNinja") Ninja ninja,
			@RequestParam (value="firstName") String firstName,
			@RequestParam (value="lastName") String lastName,
			@RequestParam (value="age") int age, Model model) {
		model.addAttribute("firstname", firstName);
		model.addAttribute("lastname", lastName);
		model.addAttribute("age", age);
		return "dojo.jsp";
	}
	
//	create a dojo
	@PostMapping("/create/ninja")
	public String create( @ModelAttribute ("newNinja")  Ninja n) {
		Ninja createNinja= nService.create(n);
		return "redirect:/ninjas/new";
	}
	
	
}
