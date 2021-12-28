package com.coding.roster_1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.coding.roster_1.models.Student;
import com.coding.roster_1.services.ContactService;
import com.coding.roster_1.services.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService sService;
	
	@Autowired
	private ContactService cService;
	@GetMapping("/students/new")
	public String index(@ModelAttribute ("newStudent")Student student) { 
		return "new_student.jsp";		
	} 
	
	@PostMapping("/students/new")
	public String index(@ModelAttribute ("newStudent")Student student, 
			@RequestParam (value="firstName") String fName,
			@RequestParam (value="lastName") String lName,
			@RequestParam (value="age") String age, Model model) {
		model.addAttribute("firstName", fName);
		model.addAttribute("lastName", lName);
		model.addAttribute("age", age);
		return "new_student.jsp";		
	}
	
//	@GetMapping(value="/create/student", method=RequestMethod.POST)
	@PostMapping("/create/student")
	public String newStudent(Student student ) {
		Student newStu = sService.create(student);
		return "redirect:/students/new";
	}
	
	@GetMapping("/students")
	public String allStudents(Model model) {
		model.addAttribute("students", sService.allStudent());
//		model.addAttribute("contacts", cService.allContacts());
		return "show.jsp";
	}
	
}
