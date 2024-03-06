package com.example.quant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class QuantApplication {

    @RequestMapping("/")
    public String home(){
        return "home is hcdsjnj";
    }

    public static void main(String[] args) {
        SpringApplication.run(QuantApplication.class, args);
    }

}
