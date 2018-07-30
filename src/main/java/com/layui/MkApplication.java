package com.layui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//开启事物
@EnableTransactionManagement
@SpringBootApplication
@ComponentScan(basePackages = { "com.layui" })
public class MkApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MkApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MkApplication.class);
    }
}
