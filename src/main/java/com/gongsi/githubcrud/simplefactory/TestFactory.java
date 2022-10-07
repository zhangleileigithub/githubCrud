package com.gongsi.githubcrud.simplefactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 张雷雷
 * 2022/10/7
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TestFactory {
    @Test
    public  void testFactory() throws Exception {
//        创建工厂对象
        Factory factory = new Factory();
//        创建公交车对象
        Parent parent = factory.creatObject("bus");
//        创建火车对象
        Parent parent1 = factory.creatObject("train");
        parent.creat();
        parent1.creat();
    }
}
