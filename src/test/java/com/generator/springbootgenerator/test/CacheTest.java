package com.generator.springbootgenerator.test;

import com.generator.springbootgenerator.model.Baby;
import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CacheTest {

    /**
     * 操作字符串的
     */
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    /**
     * map<Object, Object>
     */
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    RedisTemplate LqsRedisTemplate;

    @Test
    public void testO1() {
//        stringRedisTemplate.opsForValue().append("who", "lqs");
        String temp = stringRedisTemplate.opsForValue().get("who");
        System.err.println(temp);
    }

    @Test
    public void testO2() throws JSONException {
        Baby baby = new Baby();
        baby.setBirthday(new Date("1997/09/23"));
        baby.setName("邱文慈");
        baby.setSex(false);
        // 默认保存数据，使用jdk序列化的方式，序列化后存入redis
//        redisTemplate.opsForValue().set("baby-01", baby);
        LqsRedisTemplate.opsForValue().set("baby-01", baby);
    }

}
