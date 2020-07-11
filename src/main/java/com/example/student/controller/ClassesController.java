package com.example.student.controller;

import com.example.student.model.Classes;
import com.example.student.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
}
