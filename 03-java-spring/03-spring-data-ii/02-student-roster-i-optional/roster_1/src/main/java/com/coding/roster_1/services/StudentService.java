package com.coding.roster_1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coding.roster_1.models.Student;
import com.coding.roster_1.repositories.StudentRepository;

@Service
public class StudentService {

	private StudentRepository sRepo;

	public StudentService(StudentRepository sRepo) {
		this.sRepo = sRepo;
	}
	
//	list students
	public List<Student> allStudent(){
		return sRepo.findAll();
	}
	
//	create a new student
	public Student create(Student stu) {
		return sRepo.save(stu);
	}
}
