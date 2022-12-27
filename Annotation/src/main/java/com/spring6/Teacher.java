package com.spring6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("teacher")
public class Teacher {
    @Value("张三")
    String name;
    @Value("18")
    Integer age;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
