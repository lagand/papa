package com.papa.papa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.papa.papa"})
public class PapaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PapaApplication.class, args);
    }

}
