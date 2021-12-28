package com.coding.roster_1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coding.roster_1.models.Contact;
import com.coding.roster_1.models.Student;
import com.coding.roster_1.repositories.ContactRepository;

@Service
public class ContactService {

	private ContactRepository cRepo;

	public ContactService(ContactRepository sRepo) {
		this.cRepo = sRepo;
	}
	
//	list contacts
	public List<Contact> allContacts(){
		return cRepo.findAll();
	}
	
//	create a new contact
	public Contact createContact(Contact contact) {
		return cRepo.save(contact);
	}
}
