package com.spring6.service;


import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void generate(){
        System.out.println("订单已生成！");
    }
}
