package com.techstack.ds.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping(path = "/student/new/{name}")
    public void newStudent(@PathVariable String name) {
        Student student = new Student("Eng2015001", name);
        studentRepository.save(student);
    }

    @GetMapping(path = "/student/{id}")
    public Student getStudent(@PathVariable String id)  {
        return studentRepository.findById(id).get();
    }

}
