package com.coding.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coding.languages.models.Languages;
import com.coding.languages.repositories.LanguagesRepository;

@Service
public class LanguagesService {
//	@Autowired
	private LanguagesRepository languagesRepository;
	
//	can get rid of this constuctor if you have @Autowired on line 12.
	public LanguagesService(LanguagesRepository languagesRepository) {
		this.languagesRepository = languagesRepository;
	}
	
//	return all languages
	public List<Languages> allLanguages(){
		return languagesRepository.findAll();
	}
	
//	find one language
	public Languages findOne(Long id){
		return languagesRepository.findById(id).orElse(null);
	}
	
// create
	public Languages create(Languages language){
		return languagesRepository.save(language);
	}
	
// delete
	public void delete(Long id){
		languagesRepository.deleteById(id);
	}
	
//	update 
	public Languages update(Long id, String name, String creator, Float version) {
//		queries 
		Languages ls = findOne(id);
		ls.setName(name);
		ls.setCreator(creator);
		ls.setVersion(version);
		return languagesRepository.save(ls);
	}

	
}
