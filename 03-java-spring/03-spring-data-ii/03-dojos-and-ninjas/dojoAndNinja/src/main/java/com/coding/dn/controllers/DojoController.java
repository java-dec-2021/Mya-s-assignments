package com.coding.dn.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coding.dn.models.Dojo;
import com.coding.dn.models.Ninja;
import com.coding.dn.services.DojoService;
import com.coding.dn.services.NinjaService;

@Controller
public class DojoController {
	
	@Autowired
	private DojoService dService;
	
	@Autowired
	private NinjaService nService;
	
	
	@GetMapping("/dojos/new")
	public String index(@ModelAttribute ("newDojo") Dojo dojo) {
		return "dojo.jsp";
	}

	@PostMapping("/dojos/new")
	public String new_dojo( @ModelAttribute ("newDojo") Dojo dojo,
			@RequestParam (value="name") String Name, Model model) {
		model.addAttribute("name", Name);
		return "dojo.jsp";
	}
	
//	create a dojo
	@PostMapping("/create/dojo")
	public String create(@ModelAttribute ("newDojo") Dojo dojo) {
		Dojo createDojo= dService.create(dojo);
		return "redirect:/dojos/new";
	}
	
	@GetMapping("/dojos/{id}")
	public String dojo_id(@PathVariable ("id") Long id, Model model ){
		List<Ninja> ninja= nService.allNinja();
		Dojo getOneDojo= dService.getOne(id);
		model.addAttribute("ninjas", ninja);
		model.addAttribute("dojo", getOneDojo);
		return "show.jsp";
	}
	
}
