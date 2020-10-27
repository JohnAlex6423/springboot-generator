package com.generator.springbootgenerator.service;

import com.generator.springbootgenerator.mapper.BabyMapper;
import com.generator.springbootgenerator.model.Baby;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lqs
 */
@Service
public class BabyService {

    @Autowired
    private BabyMapper babyMapper;

    public List<Baby> getBaby() {
        return babyMapper.getBaby();
    }

    public int insertBaby(Baby baby) {
        return babyMapper.insertBaby(baby);
    }
}
