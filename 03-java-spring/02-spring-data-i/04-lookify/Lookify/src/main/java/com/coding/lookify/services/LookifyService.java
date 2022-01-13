package com.coding.lookify.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.lookify.models.Lookify;
import com.coding.lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	@Autowired
	private LookifyRepository lRepo;
	
// get all lookify/artists
	public List<Lookify> getAll(){
		return lRepo.findAll();
	}
	
//	get one Artist
	public Lookify getOneArtist(Long id) {
		return lRepo.findById(id).orElse(null);
	}
	
	
}
