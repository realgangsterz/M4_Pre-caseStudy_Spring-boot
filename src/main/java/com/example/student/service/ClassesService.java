package com.example.student.service;

import com.example.student.model.Classes;
import com.example.student.model.Student;
import org.springframework.stereotype.Service;

@Service
public interface ClassesService {
    Iterable<Classes> findAll();
}
