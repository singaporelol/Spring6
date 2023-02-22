package com.atguigu.springboot;

import com.atguigu.springboot.demo.CartoonCatAndMouse;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Arrays;

@SpringBootApplication
@MapperScan(basePackages = {"com.atguigu.springboot.dao"})
/*
* 启用事务管理器
* */
@EnableTransactionManagement
public class SpringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringbootApplication.class, args);
		CartoonCatAndMouse bean = run.getBean(CartoonCatAndMouse.class);
		bean.play();
	}

}
