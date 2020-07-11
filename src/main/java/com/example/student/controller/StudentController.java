package com.example.student.controller;

import com.example.student.model.Classes;
import com.example.student.model.Student;
import com.example.student.service.ClassesService;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private ClassesService classesService;

    @ModelAttribute("classList")
    public Iterable<Classes> classes (){
        return classesService.findAll();
    }

    @GetMapping
    public ModelAndView showListStudent(){
        Iterable<Student> students = studentService.findAll();
        ModelAndView modelAndView = new ModelAndView("student/list");
        modelAndView.addObject("students", students);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("student/create");
        modelAndView.addObject("student",new Student());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView saveStudent(@ModelAttribute Student student){
        studentService.save(student);
        ModelAndView modelAndView = new ModelAndView("student/create");
        modelAndView.addObject("message", "A new student was created !");
        modelAndView.addObject("student", new Student());
        return modelAndView;
    }
}
