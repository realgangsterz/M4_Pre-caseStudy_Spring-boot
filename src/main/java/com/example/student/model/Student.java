package com.example.student.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String address;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Classes classes;


    public Student() {
    }

    public Student(String name, String address, Classes classes) {
        this.name = name;
        this.address = address;
        this.classes = classes;
    }

    public Student(Long id, String name, String address, Classes classes) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.classes = classes;
    }
}
