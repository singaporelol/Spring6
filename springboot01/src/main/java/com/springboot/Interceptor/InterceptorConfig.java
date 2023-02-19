package com.springboot.Interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        HandlerInterceptor loginInterceptor = new LoginInterceptor();
        //定义需要拦截的路径
        String addPathPatterns []={
                "/user/**"
        };
        //定义不需要拦截的路径
        String exlcudePathPatterns []={
                "/user/error",
                "/user/verifyRealName"
        };
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns(addPathPatterns);
    }
}
