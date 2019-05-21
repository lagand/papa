package com.papa.papa.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author luyi
 * @create 2019/4/23 0023 下午 1:54
 */
@Controller
@Slf4j
public class IndexController {

    @GetMapping("/index")
    public String index(){
        log.info("============================================");
        return "index";
    }
}
