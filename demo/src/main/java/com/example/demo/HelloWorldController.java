package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping()
    public String name() {
        return "Successfully started Hello World!";
    }
    
    @GetMapping(value = "hello")
    public String getHelloWorld() {
        return "Hello Paul";
    }
    
}
