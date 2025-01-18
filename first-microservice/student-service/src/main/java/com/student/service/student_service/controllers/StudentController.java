package com.student.service.student_service.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class StudentController {
    
    @GetMapping("/")
    public String getMethodName() {
        return "This is Student-Service Test Response!!";
    }
    
}
