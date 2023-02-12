package com.mybatis.test;

import com.mybatis.mapper.StudentMapper;
import com.mybatis.pojo.Student;
import com.mybatis.utils.SqlSessionUtil;
import org.junit.Test;

public class StudentMapperTest {
    @Test
    public void testSelectByStep(){
        StudentMapper mapper=SqlSessionUtil.openSession().getMapper(StudentMapper.class);
        Student student = mapper.selectBySidStep(1);
        System.out.println(student.getSname());
//        System.out.println(student.getClazz().getCname());
    }
    @Test
    public void testSelectBySid(){
        StudentMapper mapper = SqlSessionUtil.openSession().getMapper(StudentMapper.class);
        Student student = mapper.selectBySid(1);
        System.out.println(student);
    }
    @Test
    public void testselectStudentByid(){
        StudentMapper mapper = SqlSessionUtil.openSession().getMapper(StudentMapper.class);
        Student student = mapper.selectStudentByid(1);
        System.out.println(student);
    }
}
