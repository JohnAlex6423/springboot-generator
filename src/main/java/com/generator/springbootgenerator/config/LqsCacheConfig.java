package com.generator.springbootgenerator.config;

import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author lqs
 */
@Configuration
public class LqsCacheConfig {

    @Bean("LqsKeyGenerator")
    public KeyGenerator keyGenerator() {
        return new KeyGenerator() {
            @Override
            public Object generate(Object target, Method method, Object... params) {
                return target.getClass().toString() + '-' + method.getName() + '-' + Arrays.asList(params);
            }
        };
    }
}
