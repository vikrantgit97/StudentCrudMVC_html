package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.domain.Student;
import com.student.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo repo;

	public List<Student> listAll() {
		return repo.findAll();
	}

	public void save(Student std) {
		repo.save(std);
	}

	public Student get(int id) {
		return repo.findById(id).get();
	}

	public void delete(int id) {
		repo.deleteById((int) id);
	}
}
