package com.lemon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.lemon.mapper")
public class Sign09Application {

    public static void main(String[] args) {

        SpringApplication.run(Sign09Application.class, args);
    }

}
