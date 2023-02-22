package com.atguigu.springboot;

import com.atguigu.springboot.bean.CartoonCatAndMouse;
import com.atguigu.springboot.config.CartoonProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = {"com.atguigu.springboot.dao"})
/*
* 启用事务管理器
* */
@EnableTransactionManagement
@Import(CartoonCatAndMouse.class)
public class SpringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringbootApplication.class, args);
		CartoonCatAndMouse bean = run.getBean(CartoonCatAndMouse.class);
		bean.play();

	}

}
