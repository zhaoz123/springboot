package com.wiwj.testSpringBoot;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@RestController
@EnableAutoConfiguration
*/
@SpringBootApplication
//mapper mybatis接口路径（mapper接口地址）
@MapperScan("com.wiwj.testSpringBoot.mapper")

public class Application {

 /*
  @RequestMapping("/hello")
  public String home() {
    return "Hello";
  }
  */
  
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}