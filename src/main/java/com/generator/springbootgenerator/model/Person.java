package com.generator.springbootgenerator.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.xml.stream.Location;
import java.util.Date;

@Component
@ConfigurationProperties(prefix = "person")
//@PropertySource(value = {"classpath:person.yml"}) // 该注解不支持后缀名称为yaml的文件
public class Person {

//    @Value("${person.name}") // 给属性注入值
    private String name;

    @Value("#{1+7*3}")
    private int age;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }
}
