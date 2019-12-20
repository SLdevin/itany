package com.example.demo_a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@ComponentScan("com.example.demo_a.controller")
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DemoAApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoAApplication.class, args);
    }

}
