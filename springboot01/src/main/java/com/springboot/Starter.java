package com.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class Starter implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("容器创建好执行2");
    }
}
