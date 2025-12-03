package com.example.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Simple text response
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring Boot REST API!";
    }

    // JSON response
    @GetMapping("/info")
    public UserInfo getInfo() {
        return new UserInfo("Vaishnavi", "Learning Spring Boot", "First REST API Created Successfully!");
    }
}

// DTO / Model class
class UserInfo {
    private String name;
    private String topic;
    private String message;

    public UserInfo(String name, String topic, String message) {
        this.name = name;
        this.topic = topic;
        this.message = message;
    }

    // Getters
    public String getName() { return name; }
    public String getTopic() { return topic; }
    public String getMessage() { return message; }
}
