package com.example.student.repository;

import com.example.student.model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
}
