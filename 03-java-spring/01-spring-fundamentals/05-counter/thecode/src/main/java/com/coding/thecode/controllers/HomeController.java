package com.coding.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String index(@ModelAttribute("errors") String errors, Model model) {
		System.out.println(errors);
		model.addAttribute("error", errors);
		
		return "index.jsp";
	}
	@RequestMapping(path="/submit",  method=RequestMethod.POST)
	public String code (@RequestParam(value="code") String code,Model model, RedirectAttributes redirect) {
			if (code.equals("bushido")) {
				model.addAttribute("codes", code);
				return "redirect:/code";
			}
			else {
				redirect.addFlashAttribute("errors", "You must train harder!");
//				System.out.println("code");
			return "redirect:/";
			}
	}
	
	@RequestMapping("/code")
	public String codedisplay() {
		return "code.jsp";
	}
	
	
}
