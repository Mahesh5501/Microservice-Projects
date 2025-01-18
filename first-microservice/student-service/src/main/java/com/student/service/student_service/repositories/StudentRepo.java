package com.student.service.student_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.service.student_service.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
    
}
