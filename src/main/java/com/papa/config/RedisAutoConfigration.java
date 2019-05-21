package com.papa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author luyi
 * @create 2019/5/13 0013 下午 4:31
 */
@Configuration
public class RedisAutoConfigration {

    @Autowired
    private RedisProperties properties;

//    private static final String hostAndPorts = "192.168.42.128:6379||192.168.42.128:6380||"
//            + "192.168.42.128:6381||192.168.42.128:6382||"
//            + "192.168.42.128:6383||192.168.42.128:6384";

    @Bean
    public JedisPool getJedisPool() {
        JedisPoolConfig config = new JedisPoolConfig();
        return new JedisPool(config, properties.getHost(), properties.getPort(),
                (int) properties.getTimeout().toMillis(), properties.getPassword());
    }

    @Bean
    public JedisCluster getJedisCluster(){
//        int timeOut = 10000;
//        Set<HostAndPort> nodes = new HashSet<>();
//        JedisPoolConfig poolConfig = new JedisPoolConfig();
//        poolConfig.setMaxTotal(200);
//        poolConfig.setMaxIdle(50);
//        poolConfig.setMaxWaitMillis(1000 * 100);
//        poolConfig.setTestOnBorrow(false);
//
//        String[] hosts = hostAndPorts.split("\\|\\|");
//        for(String hostport:hosts){
//            String[] ipport = hostport.split(":");
//            String ip = ipport[0];
//            int port = Integer.parseInt(ipport[1]);
//            nodes.add(new HostAndPort(ip, port));
//            jedisCluster = new JedisCluster(nodes,timeOut, poolConfig);
//        }

//        JedisPoolConfig config = new JedisPoolConfig();
//        Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
//        jedisClusterNodes.add(new HostAndPort(properties.getHost(), properties.getPort()));
//        return new JedisCluster(jedisClusterNodes, properties.getTimeout().getNano(), properties.getTimeout().getNano(), 3, properties.getPassword(), config);
        return null;
    }

}
