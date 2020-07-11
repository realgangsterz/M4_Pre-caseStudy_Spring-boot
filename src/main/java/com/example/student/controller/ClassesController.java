package com.example.student.controller;

import com.example.student.model.Classes;
import com.example.student.model.Student;
import com.example.student.service.ClassesService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/classes")
public class ClassesController {

    @Autowired
    private ClassesService classesService;

    @GetMapping("/create")
    public ModelAndView showCreateClassForm(){
        ModelAndView modelAndView = new ModelAndView("classes/create");
        modelAndView.addObject("class",new Classes());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView saveClasses(@ModelAttribute Classes classes){
        classesService.save(classes);
        ModelAndView modelAndView = new ModelAndView("classes/create");
        modelAndView.addObject("message","A new class was created !");
        modelAndView.addObject("class",new Classes());
        return modelAndView;
    }
}
