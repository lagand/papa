package com.papa.mq.offical.test;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author luyi
 * @create 2019/5/21 0021 下午 3:35
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue queue(){
        return new Queue("queue");
    }

    @Bean
    public Queue indexQueue(){
        return new Queue("indexSend");
    }
}
