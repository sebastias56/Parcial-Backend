package com.dh.msstudent.controllers;

import com.dh.msstudent.models.Student;
import com.dh.msstudent.services.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentRestController {
    private final StudentService studentService;

    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return studentService.findAll();
    }
}

