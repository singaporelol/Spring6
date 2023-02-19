package com.example.springbootatguigu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
    @RequestMapping("/main")
    public String main(){
        return "main";
    }
}
