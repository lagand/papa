package com.papa.mq.offical.test;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author luyi
 * @create 2019/5/21 0021 下午 3:07
 */
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate template;

    public void send() {
        template.convertAndSend("queue", "hello,rabbit~");
    }
}
