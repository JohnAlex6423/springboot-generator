package com.generator.springbootgenerator.controller;

import com.lqs.starter.LoveQwc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lqs
 */
@RestController
public class SayLoveController {

    @Autowired
    /**
     * LoveQwc
     */
     LoveQwc loveQwc;

    @GetMapping("/sayLove/{name}")
    public String sayLove(@PathVariable("name") String name) {
        return loveQwc.sayLoveQwc(name);
    }
}
