 package com.coding.roster_1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.roster_1.models.Contact;
import com.coding.roster_1.models.Student;
import com.coding.roster_1.services.ContactService;
import com.coding.roster_1.services.StudentService;

@RestController
public class ApiController {
	@Autowired
	private StudentService sService;

	@Autowired
	private ContactService cService;
	
//	list of students
	@GetMapping("/api//allStudents")
	private List<Student> getStudents(){
		return this.sService.allStudent();
	}
	
//	create a student
	@PostMapping("/create/student/Api")
	private Student createOneApi(Student student) {
		return sService.create(student);
	}
	
//	create a contact
	@PostMapping("/create/contact/Api")
	private Contact createContactApi(Contact contact) {
		return cService.createContact(contact);
	}
	
//	list of contacts
	@GetMapping("/api/allContacts")
	private List<Contact> getContacts(){
		return this.cService.allContacts();
	}
}