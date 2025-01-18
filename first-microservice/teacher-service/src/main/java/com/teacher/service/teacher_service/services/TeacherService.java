package com.teacher.service.teacher_service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teacher.service.teacher_service.model.Teacher;
import com.teacher.service.teacher_service.repository.TeacherRepo;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepo teacherRepo;

    public Teacher addTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    public List<Teacher> getTeachers() {
        List<Teacher> teachersList = teacherRepo.findAll();
        return teachersList;
    }

    public List<Teacher> removeTeacher(int id) {
        teacherRepo.deleteById(id);
        return teacherRepo.findAll();
    }
}
