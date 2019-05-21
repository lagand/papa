package com.papa.papa.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @Author luyi
 * @create 2019/5/13 0013 下午 4:37
 */
@Component
public class RedisClientTemplate {

    @Autowired
    private JedisPool jedisPool;

    public <T> String set(String key, T value, long time){
        if(null == value){
            return null;
        }
        Jedis jedis = jedisPool.getResource();
        if(null == jedis){
            return null;
        }
        return jedis.set(key.getBytes(), value.toString().getBytes(), "EX".getBytes(),  time);
    }

    public <T> Object get(String key){
        if(null == key){
            return null;
        }
        Jedis jedis = jedisPool.getResource();
        if(null == jedis){
            return null;
        }
        return jedis.get(key);
    }
}
