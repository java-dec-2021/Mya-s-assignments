package com.coding.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.languages.models.Languages;

// on line 10,the name of the Languages is the name of the model
@Repository
public interface LanguagesRepository extends CrudRepository<Languages, Long> {
	
	List<Languages>findAll();
//	Create
//	Read
//	Update 
//	Delete
}
