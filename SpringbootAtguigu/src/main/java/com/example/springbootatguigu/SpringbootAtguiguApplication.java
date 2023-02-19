package com.example.springbootatguigu;

import com.example.springbootatguigu.configure.MyConfig;
import com.example.springbootatguigu.vo.Pet;
import com.example.springbootatguigu.vo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootAtguiguApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext run = SpringApplication.run(SpringbootAtguiguApplication.class, args);

    MyConfig bean = run.getBean(MyConfig.class);
    User user = bean.user01();
    User user1 = bean.user01();
    System.out.println(user == user1);

  }

}
