package com.example.jeopardy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JeopardyApplication {

    public static void main(String[] args) {
        SpringApplication.run(JeopardyApplication.class, args);
    }

}

@RestController
class HelloWorldController {
    @RequestMapping ("/")
    public String index(){return "Hello World!!!";}
}