package com.coding.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

//	@RequestMapping("/")
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("your_name", "name" );
		return "index.jsp";
	}
//	@RequestMapping("/result")
	
	@RequestMapping(path="/result", method=RequestMethod.POST)
	@PostMapping(path="/result")
	public String result(@RequestParam("your_name") String name, @RequestParam("dojo_location") String dojo_location,
						@RequestParam("fav_language") String fav_language,
						@RequestParam("comment") String comment, Model model) {
		model.addAttribute("your_name", name);
		model.addAttribute("dojo_location", dojo_location);
		model.addAttribute("fav_language", fav_language);
		model.addAttribute("comment", comment);
		return "result.jsp";
	}
}
