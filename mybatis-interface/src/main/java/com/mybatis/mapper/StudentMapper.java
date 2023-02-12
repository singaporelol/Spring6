package com.mybatis.mapper;

import com.mybatis.pojo.Student;

public interface StudentMapper {
    Student selectBySid(Integer sId);
    Student selectStudentByid (Integer sId);
    Student selectBySidStep(Integer sId);
}
