package com.teacher.service.teacher_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teacher.service.teacher_service.model.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Integer>{
    
}
