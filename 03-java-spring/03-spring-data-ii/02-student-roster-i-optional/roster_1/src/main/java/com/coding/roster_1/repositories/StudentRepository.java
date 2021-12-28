package com.coding.roster_1.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coding.roster_1.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

	List<Student> findAll();
}
