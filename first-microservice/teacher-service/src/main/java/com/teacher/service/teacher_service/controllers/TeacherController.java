package com.teacher.service.teacher_service.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.teacher.service.teacher_service.model.Teacher;
import com.teacher.service.teacher_service.services.TeacherService;

import java.util.List;

import org.apache.hc.core5.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/v1")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/")
    public String getMethodName() {
        return "This is Teacher-Service Test Response!!";
    }

    @GetMapping("/teachers")
    public List<Teacher> getTeachers() {
        return teacherService.getTeachers();
    }

    @PostMapping("/teachers")
    public ResponseEntity<Teacher> addTeachers(@RequestBody Teacher teacher) {

        Teacher response = teacherService.addTeacher(teacher);
        return ResponseEntity.status(HttpStatus.SC_CREATED).body(response);
    }

    @DeleteMapping("/teachers/{id}")
    public List<Teacher> addTeachers(@PathVariable Integer id) {

        return teacherService.removeTeacher(id);

    }
}
