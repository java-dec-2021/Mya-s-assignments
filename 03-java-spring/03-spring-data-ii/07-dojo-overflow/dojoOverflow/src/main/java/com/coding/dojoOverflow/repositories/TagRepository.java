package com.coding.dojoOverflow.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.dojoOverflow.models.Tag;

@Repository
public interface TagRepository extends CrudRepository <Tag, Long>{
	
	List <Tag> findAll();
	
	boolean existsByTag(String tag);
	
	Tag findByTag(String tag);
//	Optional <Tag> findByTags(String subject);
	
	
}
