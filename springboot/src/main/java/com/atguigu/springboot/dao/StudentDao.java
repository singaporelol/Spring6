package com.atguigu.springboot.dao;

import com.atguigu.springboot.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

//@Mapper
public interface StudentDao {
    Student selectById(@Param("stuId") Integer id);
    Integer insertStudent(Student student);
}
