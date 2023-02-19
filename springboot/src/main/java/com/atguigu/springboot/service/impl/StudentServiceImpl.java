package com.atguigu.springboot.service.impl;

import com.atguigu.springboot.dao.StudentDao;
import com.atguigu.springboot.model.Student;
import com.atguigu.springboot.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;
    @Override
    public Student queryStudent(Integer id) {
        Student student = studentDao.selectById(id);
        return  student;
    }
}
