package com.example.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
public class JokeappApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokeappApplication.class, args);
    }

}
