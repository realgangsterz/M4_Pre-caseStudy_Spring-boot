package com.example.student.service.impl;

import com.example.student.model.Classes;
import com.example.student.repository.ClassesRepository;
import com.example.student.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassesServiceImpl implements ClassesService {

    @Autowired
    private ClassesRepository classesRepository;

    @Override
    public Iterable<Classes> findAll() {
        return classesRepository.findAll();
    }

    @Override
    public void save(Classes classes) {
        classesRepository.save(classes);
    }
}
