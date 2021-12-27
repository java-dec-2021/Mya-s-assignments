package com.coding.dn.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.coding.dn.models.Dojo;
import com.coding.dn.repositories.DojoRepository;

@Service
public class DojoService {

	private DojoRepository dRepo;

	public DojoService(DojoRepository dRepo) {
		this.dRepo = dRepo;
	}
	
//	get all dojos
	public List<Dojo> allDojos(){
		return dRepo.findAll();
	}
//	create a dojo
	public Dojo create(Dojo dojo) {
		return dRepo.save(dojo);
	}
	
//	get dojo id
	public Dojo getOne(Long id) {
		return dRepo.findById(id).orElse(null);
	}
}
