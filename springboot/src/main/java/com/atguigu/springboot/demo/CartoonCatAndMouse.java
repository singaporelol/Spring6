package com.atguigu.springboot.demo;

import com.atguigu.springboot.config.CartoonProperties;
import com.atguigu.springboot.model.Cat;
import com.atguigu.springboot.model.Mouse;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class CartoonCatAndMouse {

    private CartoonProperties cartoonProperties;
    
    public CartoonCatAndMouse(CartoonProperties cartoonProperties){
        this.cartoonProperties = cartoonProperties;
        cat = new Cat();
        cat.setName(cartoonProperties.getCat()!=null &&
                StringUtils.hasText(cartoonProperties.getCat().getName())?
                cartoonProperties.getCat().getName():"tom");
    }
    private Cat cat;
    private Mouse mouse;
    public void play(){
        System.out.println(cat.getAge()+"岁的"+cat.getName()+
                "与"+mouse.getAge()+"岁的"+mouse.getName()+"打起来了");
    }
}
