package com.example.student.repository;

import com.example.student.model.Classes;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClassesRepository extends PagingAndSortingRepository<Classes,Long> {
}
