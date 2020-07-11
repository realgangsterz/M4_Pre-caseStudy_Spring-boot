package com.example.student.service;

import com.example.student.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    Iterable<Student> findAll();

    void save(Student student);
}
