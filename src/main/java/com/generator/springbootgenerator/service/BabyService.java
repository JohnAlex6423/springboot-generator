package com.generator.springbootgenerator.service;

import com.generator.springbootgenerator.mapper.BabyMapper;
import com.generator.springbootgenerator.model.Baby;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lqs
 */
@Service
@CacheConfig(cacheNames = "baby")
public class BabyService {

    @Autowired
    private BabyMapper babyMapper;


    @Cacheable(cacheNames = {"baby"}, key = "root.method.name")
    public List<Baby> getBaby() {
        return babyMapper.getBaby();
    }

    public int insertBaby(Baby baby) {
        return babyMapper.insertBaby(baby);
    }

    /**
     *
     * @param id
     * @return
     */
    @Cacheable(cacheNames = {"baby"}, keyGenerator = "LqsKeyGenerator")
    public Baby getBabyById(Long id) {
        return babyMapper.getBabyById(id);
    }
}
