package com.mxl.hd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.mxl.project.*.*.mapper")
public class HdApplication {

    public static void main(String[] args) {
        SpringApplication.run(HdApplication.class, args);
    }



}
