package com.gongsi.githubcrud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.gongsi.githubcrud.mapper")
@EnableScheduling //具有开启定时任务注解的功能
@EnableTransactionManagement  //使具有事务管理的功能
//不需要使用@ComponentScan，因为springboot默认扫描启动类所在同级目录下的所有类
//@ComponentScan(basePackages = {"com.gongsi.githubcrud.conroller","com.gongsi.githubcrud.service"})
public class GithubCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubCrudApplication.class, args);
        System.out.println("aa");
        System.out.println("bb");
    }

}
