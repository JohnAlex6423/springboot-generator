package com.generator.springbootgenerator.test;

import com.generator.springbootgenerator.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class loggerTest {
    @Autowired
    private Person person;

    @Test
    public void test01() {
        Logger logger = LoggerFactory.getLogger(person.getClass());
        logger.trace("trace--------hello " + person.getName());
        logger.debug("debug--------hello " + person.getName());
        logger.info("info--------hello " + person.getName());
        logger.warn("warn--------hello " + person.getName());
        logger.error("error--------hello " + person.getName());
    }
}
