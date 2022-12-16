package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.student.domain.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
