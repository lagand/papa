package com.papa.papa.mq.offical;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Author luyi
 * @create 2019/4/25 0025 上午 11:34
 */
public class Recv {

    public static void main(String[] args){
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("119.23.57.42");
        factory.setPort(15672);
        factory.setUsername("luyi");
        factory.setPassword("luyi963852");
        factory.setAutomaticRecoveryEnabled(true);
        Connection connection = null;
        Channel channel = null;
        try {
            connection = factory.newConnection();
            channel = connection.createChannel();
            channel.queueDeclare("luyi_test", false, false, false, null);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                channel.close();
                connection.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        }
        System.out.println("end");
    }
}
