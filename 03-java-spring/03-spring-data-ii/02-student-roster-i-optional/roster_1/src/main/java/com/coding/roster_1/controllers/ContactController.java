package com.coding.roster_1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.coding.roster_1.models.Contact;
import com.coding.roster_1.services.ContactService;
import com.coding.roster_1.services.StudentService;

@Controller
public class ContactController {

	@Autowired
	private ContactService cService;
	
	@Autowired
	private StudentService sService;
	
	@GetMapping("/contact/new")
	private String new_contact(@ModelAttribute ("newContact") Contact contact, Model model) {
		model.addAttribute("students", sService.allStudent());
		return "new_contact.jsp";
	}
	@PostMapping("/create/contact")
	private String create_contact(@ModelAttribute ("newContact") Contact contact) {
		
		Contact newContact =cService.createContact(contact);
		return "redirect:/contact/new";
	}
	
}
