package com.gongsi.githubcrud;

import org.aspectj.weaver.ast.Var;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.gongsi.githubcrud.mapper")
@EnableScheduling //具有开启定时任务注解的功能
@EnableTransactionManagement  //使具有事务管理的功能
//不需要使用@ComponentScan，因为springboot默认扫描启动类所在同级目录下的所有类
//@ComponentScan(basePackages = {"com.gongsi.githubcrud.conroller","com.gongsi.githubcrud.service"})
/*
* 因为需要打包成war包，所以需要继承SpringBootServletInitializer类，
* 重写configure方法。
* */
public class GithubCrudApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(GithubCrudApplication.class, args);
        System.out.println("aa");
        System.out.println("bb");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GithubCrudApplication.class);
    }
}
