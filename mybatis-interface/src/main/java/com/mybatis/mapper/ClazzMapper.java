package com.mybatis.mapper;

import com.mybatis.pojo.Clazz;

public interface ClazzMapper {

  Clazz selectByCid(Integer cid);

  Clazz selectClazzAndStusByCid(Integer cid);

  Clazz selectClazzAndStudentByCid(Integer cid);
}
