package com.venky.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venky.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	
}
