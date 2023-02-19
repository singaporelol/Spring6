package com.atguigu.springboot.service;

import com.atguigu.springboot.model.Student;
import org.springframework.stereotype.Service;


public interface StudentService {

    Student queryStudent(Integer id);
}
