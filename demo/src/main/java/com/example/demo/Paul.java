package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("/rest")
public class Paul {
    @GetMapping("/paul") String getPaul() { return "Paul"; }
    
}