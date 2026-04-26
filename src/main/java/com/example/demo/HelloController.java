package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final String message;

    public HelloController(@Value("${app.message:default}") String message) {
        this.message = message;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello, " + message + "!\n";
    }
}
