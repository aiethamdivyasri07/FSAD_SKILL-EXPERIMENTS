package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.model.Student;
import com.example.service.StudentService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public ResponseEntity<Student> add(@RequestBody Student s) {
        return ResponseEntity.ok(service.addStudent(s));
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        return ResponseEntity.ok(service.getAllStudents());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@PathVariable Long id, @RequestBody Student s) {
        return ResponseEntity.ok(service.updateStudent(id, s));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        service.deleteStudent(id);
        return ResponseEntity.ok("Deleted Successfully");
    }
}