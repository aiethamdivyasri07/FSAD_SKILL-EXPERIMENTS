package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.model.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student addStudent(Student student) {
        return repo.save(student);
    }

    public Student updateStudent(Long id, Student newData) {
        Student s = repo.findById(id).orElseThrow();
        s.setName(newData.getName());
        s.setEmail(newData.getEmail());
        s.setCourse(newData.getCourse());
        return repo.save(s);
    }

    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }
}