package com.mybatis.mapper;

import com.mybatis.pojo.Student;

import java.util.List;

public interface StudentMapper {
  Student selectBySid(Integer sId);

  Student selectStudentByid(Integer sId);

  Student selectBySidStep(Integer sId);

  List<Student> selectByCid(Integer cid);
}
