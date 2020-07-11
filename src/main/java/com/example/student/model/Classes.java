package com.example.student.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

//    @OneToMany
//    private List<Student> studentList;

    public Classes() {
    }

    public Classes(String name) {
        this.name = name;
    }

    public Classes(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
