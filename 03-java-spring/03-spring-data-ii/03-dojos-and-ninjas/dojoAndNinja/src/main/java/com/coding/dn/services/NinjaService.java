package com.coding.dn.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coding.dn.models.Dojo;
import com.coding.dn.models.Ninja;
import com.coding.dn.repositories.NinjaRepository;

@Service
public class NinjaService {

	private NinjaRepository nRepo;

	public NinjaService(NinjaRepository nRepo) {
		this.nRepo = nRepo;
	}
	
//	get all ninjas
	public List<Ninja> allNinja(){
		return nRepo.findAll();
	}
//	create a ninja
	public Ninja create(Ninja n) {
		return nRepo.save(n);
	}
	
//	get ninja id
	public Ninja ninja_id(Long id) {
		return nRepo.findById(id).orElse(null);
	}
}
