package com.generator.springbootgenerator.test;

import com.generator.springbootgenerator.model.Person;
import com.generator.springbootgenerator.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigurationTest {

    @Autowired
    private Person person;

    @Autowired
    private Student student;

    @Autowired
    private ApplicationContext ioc;

    /**
     * 测试默认配置文件注入属性
     */
    @Test
    public void test01() {
        System.err.println(person);
    }

    /**
     * 测试配置类
     */
    @Test
    public void test02() throws ClassNotFoundException {
        boolean b = ioc.containsBean("helloStudent");
        System.err.println(b);
        System.err.println(student); //@Configuration把student也交由spring容器管理了
    }
}
