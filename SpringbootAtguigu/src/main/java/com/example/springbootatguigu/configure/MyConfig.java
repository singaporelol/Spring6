package com.example.springbootatguigu.configure;


import com.example.springbootatguigu.vo.Pet;
import com.example.springbootatguigu.vo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
//@Component
public class MyConfig {
    @Bean(value = "tom")
    public Pet tomcatPet() {
        return new Pet("tomcat");
    }

    @Bean(value = "user01")
    public User user01() {
        User zhangsan = new User("zhangsan", 18);
        zhangsan.setPet(tomcatPet());
        return zhangsan;
    }


}
