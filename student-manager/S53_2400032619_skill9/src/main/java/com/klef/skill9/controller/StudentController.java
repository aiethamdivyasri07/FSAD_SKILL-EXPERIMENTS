package com.klef.skill9.controller;

import org.springframework.web.bind.annotation.*;

import com.klef.skill9.exception.InvalidInputException;
import com.klef.skill9.exception.StudentNotFoundException;
import com.klef.skill9.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable long id) {

        if(id <= 0) {
            throw new InvalidInputException("Student ID must be greater than zero");
        }

        if(id != 101) {
            throw new StudentNotFoundException("Student with ID " + id + " not found");
        }

        return new Student(101,"DivyaSri","Artificial Intelligence");
    }
}