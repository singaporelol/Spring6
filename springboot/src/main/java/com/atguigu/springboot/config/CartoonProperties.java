package com.atguigu.springboot.config;

import com.atguigu.springboot.model.Cat;
import com.atguigu.springboot.model.Mouse;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "cartoon")
@Data
@ToString
public class CartoonProperties {
    private Cat cat;
    private Mouse mouse;

}
