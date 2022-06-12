package com.dai.zeus.finance.server.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Test
    public void test1() {
        redisTemplate.opsForValue().set("name", "zhangsan");
        System.out.println(redisTemplate.opsForValue().get("name"));
    }
}
