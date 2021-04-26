package com.abhishek.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentRepository studRepo;

    @GetMapping("/getStudents")
    public List<Student> getStudents() {
        return studRepo.findAll();
    }
}
