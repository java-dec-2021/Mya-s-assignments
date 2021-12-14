package com.coding.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
//	@RequestMapping("/")
//	public String index() {
//		return "index.jsp";
//	}
	@RequestMapping("/")
	public String index(
			@RequestParam (value="name", required=false, defaultValue="human") String name,
			@RequestParam (value="lname", required=false, defaultValue="") String lastName,
			@RequestParam (value="times", required=false, defaultValue="") String times,
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("lname", lastName);
		model.addAttribute("times", times);
		return "index.jsp";
	}
//	
}
