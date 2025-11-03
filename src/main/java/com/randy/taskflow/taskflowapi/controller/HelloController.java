package com.randy.taskflow.taskflowapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String sayHello() {
        return "👋 Hello Randy! Your TaskFlow API is running successfully 🚀";
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to TaskFlow API 🧩";
    }
}
