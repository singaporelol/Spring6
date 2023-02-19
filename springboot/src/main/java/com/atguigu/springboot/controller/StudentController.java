package com.atguigu.springboot.controller;

import com.atguigu.springboot.model.Student;
import com.atguigu.springboot.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Resource
    private StudentService studentService;
    @RequestMapping("/student/{id}")
    @ResponseBody
    public String queryStudent(@PathVariable int id){
        Student student = studentService.queryStudent(id);
        return student.toString();
    }
}
