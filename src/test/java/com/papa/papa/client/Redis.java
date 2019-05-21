package com.papa.papa.client;

import com.papa.papa.PapaApplication;
import com.papa.papa.redis.RedisClientTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author luyi
 * @create 2019/4/25 0025 下午 9:10
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PapaApplication.class)
public class Redis {


    @Autowired
    private RedisClientTemplate redisClientTemplate;

    @Test
    public void test(){
        //Set result = redisUtil.get("\\xac\\xed\\x00\\x05t\\x00\\x03123");
        //boolean result = redisUtil.set("lulu", "654654g");
        String result = redisClientTemplate.set("lulu", "123", 1000000);
        System.out.println(result);
    }

    @Test
    public void test1(){
        System.out.println(redisClientTemplate.get("lulu").toString());
    }
}
