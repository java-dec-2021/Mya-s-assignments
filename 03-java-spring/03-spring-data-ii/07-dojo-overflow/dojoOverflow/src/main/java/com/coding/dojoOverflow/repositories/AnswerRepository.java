package com.coding.dojoOverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.dojoOverflow.models.Answer;

@Repository
public interface AnswerRepository extends CrudRepository <Answer, Long>{

	List <Answer> findAll();
}
