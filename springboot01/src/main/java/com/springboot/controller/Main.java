package com.springboot.controller;


import com.springboot.vo.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Main {

    @Autowired
    private Config config;

    @RequestMapping("/main")
    @ResponseBody
    public String main(){
        return "hello";
    }



    @RequestMapping("/testProperties")
    @ResponseBody
    public String testProperties(){
        return "hello"+ config.getUserName()+ "age:"+config.getAge();


    }
    @RequestMapping("/user/error")
    @ResponseBody
    public String testInterceptor2(){
        return "测试Interceptor拦截器";
    }








}
