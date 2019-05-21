package com.papa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author luyi
 * @create 2019/5/14 0014 下午 4:54
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(String name, String password){
        return "login";
    }

    @PostMapping("/login")
    public void validate(){

    }
}
