package com.atguigu.springboot.service.impl;

import com.atguigu.springboot.dao.StudentDao;
import com.atguigu.springboot.model.Student;
import com.atguigu.springboot.service.StudentService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    @Override
    public Student queryStudent(Integer id) {
        Student student = studentDao.selectById(id);
        return student;
    }

    @Override
    @Transactional
    public Integer insertStudent(Student student) {
        System.out.println("准备执行SQL语句。。。。。。。");
        Integer result = studentDao.insertStudent(student);
        System.out.println("执行结果：========================" + result);
        int m=10/0;

        return result;
    }
}
