package com.example.demo.controller;

import com.example.demo.annotation.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @Log("hello")
    @GetMapping("/hello")
    public void hello() {
        System.out.println("hello");
    }
}