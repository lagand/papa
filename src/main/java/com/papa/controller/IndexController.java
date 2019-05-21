package com.papa.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author luyi
 * @create 2019/4/23 0023 下午 1:54
 */
@Controller
@Slf4j
public class IndexController {

    @Autowired
    private AmqpTemplate rabbitmqTemplate;

    @GetMapping("/index")
    public String index(){
        log.info("============================================");
        return "index";
    }

    @GetMapping("/mq/send")
    @ResponseBody
    public String send(@RequestParam(value="msg") String msg){
        rabbitmqTemplate.convertAndSend("indexSend",msg);
        log.info("message "+msg+"send ...");
        return "ok";
    }
}
