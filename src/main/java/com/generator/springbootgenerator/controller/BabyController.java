package com.generator.springbootgenerator.controller;

import com.generator.springbootgenerator.model.Baby;
import com.generator.springbootgenerator.service.BabyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lqs
 */
@RestController
public class BabyController {

    @Autowired
    private BabyService babyService;

    @RequestMapping("/getBabyList")
    public List<Baby> getBabyList() {
        return babyService.getBaby();
    }
    @RequestMapping("/getBabyById/{id}")
    Baby getBabyById(@PathVariable("id") Long id) {
        Baby baby = babyService.getBabyById(id);
        return baby;
    }
}
