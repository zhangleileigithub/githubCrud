package com.gongsi.githubcrud.junit;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 张雷雷
 * 2022/10/6
 */
/*
*使用单元测试  pom中spring-boot-starter-test依赖可使用@sprigbootTest注解与@Test注解
* @SpringBootTest：@SpringBootTest后，Spring将加载所有被管理的bean，
*                  基本等同于启动了整个服务，此时便可以开始功能测试
* @Test：是该方法可以不用在main方法中调用就可以测试出运行结果的一种测试工具
*        ，不过需要注意被测试的方法必须是public修饰的。
* @RunWith()：一个运行器
* SpringJUnit4ClassRunner.class:让测试运行于Spring测试环境 或 JUnit4.class:指用JUnit4来运行
* 或Suite.class:一套测试集合
* */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class JunitTest {
    @Test
    public void ceShi(){
        System.out.println("启用单元测试");
    }
    
}
