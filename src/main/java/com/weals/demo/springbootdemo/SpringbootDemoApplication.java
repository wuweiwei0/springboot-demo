package com.weals.demo.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(
        //exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class},
        scanBasePackages = {
                "com.weals.demo.controller",
                "com.weals.demo.service"
        })
@MapperScan(basePackages = {
        "com.weals.demo.mapper"
})
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }
}
