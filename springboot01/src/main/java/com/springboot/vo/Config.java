package com.springboot.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;

@Controller
@ConfigurationProperties(prefix = "person")
public class Config {

    // @Value("${person.userName}")
    private String userName;
    // @Value("${person.age}")
    private Integer age;

    @Override
    public String toString() {
        return "Config{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Config() {
    }

    public Config(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }
}
