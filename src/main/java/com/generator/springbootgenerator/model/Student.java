package com.generator.springbootgenerator.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置学生类
 */
@Configuration
public class Student extends Person {

    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Bean
    public Student helloStudent() {
        Student student = new Student();
        student.score = 100;
        System.err.println("醉后不知天在水，满船清梦压星河");
        return student;
    }
}
