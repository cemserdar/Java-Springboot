package com.example.demo.Controller;

import com.example.demo.Repository.StudentRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Business.StudentService;
import com.example.demo.Model.StudentModel;

@CrossOrigin
@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;
    private StudentRepository studentRepository;

    public StudentController(StudentService studentService, StudentRepository studentRepository) {
        this.studentService = studentService;
        this.studentRepository = studentRepository;
    }

    @PostMapping("/add")
    public StudentModel Add(StudentModel model) {

        return this.studentService.Add(model);
    }
}
