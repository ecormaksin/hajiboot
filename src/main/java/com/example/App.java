package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController  // (1)
@EnableAutoConfiguration // (2)
public class App 
{

    @GetMapping("/") // (3)
    String home() {
        return "Hello Spring Boot!"; // (4)
    }

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args); // (5)
    }
}
