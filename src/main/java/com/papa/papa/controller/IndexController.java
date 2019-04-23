package com.papa.papa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author luyi
 * @create 2019/4/23 0023 下午 1:54
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "hello world";
    }
}
