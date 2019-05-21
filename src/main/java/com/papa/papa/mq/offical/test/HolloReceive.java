package com.papa.papa.mq.offical.test;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author luyi
 * @create 2019/5/21 0021 下午 3:28
 */
@Component
public class HolloReceive {

    @RabbitListener(queues = "queue")
    public void processC(String str){
        System.out.println("receive : "+ str);
    }

    @RabbitListener(queues = "indexSend")
    public void indexReceiver(String str){
        System.out.println("receive : "+ str);
    }
}
