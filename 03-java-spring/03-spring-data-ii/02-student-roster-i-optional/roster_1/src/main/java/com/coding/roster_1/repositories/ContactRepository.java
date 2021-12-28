package com.coding.roster_1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.roster_1.models.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {

	List<Contact> findAll();
}
