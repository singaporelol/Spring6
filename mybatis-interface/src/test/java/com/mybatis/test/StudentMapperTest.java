package com.mybatis.test;

import com.mybatis.mapper.ClazzMapper;
import com.mybatis.mapper.StudentMapper;
import com.mybatis.pojo.Clazz;
import com.mybatis.pojo.Student;
import com.mybatis.utils.SqlSessionUtil;
import org.junit.Test;

public class StudentMapperTest {
    @Test
    public void testOneToManyStep(){
        ClazzMapper mapper = SqlSessionUtil.openSession().getMapper(ClazzMapper.class);
        Clazz clazz = mapper.selectClazzAndStudentByCid(1001);
        System.out.println(clazz.getCname());
        System.out.println(clazz.getStudents());
    }
    @Test
    public void testOneToMany(){
        ClazzMapper mapper = SqlSessionUtil.openSession().getMapper(ClazzMapper.class);
        Clazz clazz = mapper.selectClazzAndStusByCid(1001);
        System.out.println(clazz);
    }
    @Test
    public void testSelectByStep(){
        StudentMapper mapper=SqlSessionUtil.openSession().getMapper(StudentMapper.class);
        Student student = mapper.selectBySidStep(1);
        System.out.println(student.getSname());
        System.out.println(student.getClazz().getCname());
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
