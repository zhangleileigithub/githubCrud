package com.gongsi.githubcrud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackages = "com.gongsi.githubcrud.mapper")
@EnableScheduling
//不需要使用@ComponentScan，因为springboot默认扫描启动类所在同级目录下的所有类
//@ComponentScan(basePackages = {"com.gongsi.githubcrud.conroller","com.gongsi.githubcrud.service"})
public class GithubCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubCrudApplication.class, args);
    }

}
