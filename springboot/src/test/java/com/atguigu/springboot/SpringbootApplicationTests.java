package com.atguigu.springboot;

import com.atguigu.springboot.model.Student;
import com.atguigu.springboot.service.StudentService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

	@Resource
	private StudentService studentService;
	@Test
	void contextLoads() {
	}

	@Test
	public void testStudent(){
		Student student = new Student(null,"张三三", 18);
		Integer count = studentService.insertStudent(student);
		System.out.println(count);
	}

}
