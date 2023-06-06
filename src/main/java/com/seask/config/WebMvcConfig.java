package com.seask.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//컴포넌트 스캔이 config class인걸 인지함
@Configuration // 설정파일 빈 등록
@EnableAspectJAutoProxy
//@MapperScan(basePackages = {"com.ssafy.back.model.mapper"}) //mapper 인터페이스 빈 등록
public class WebMvcConfig implements WebMvcConfigurer {
    public void test()
    {
        System.out.println("");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*");
    }

}
