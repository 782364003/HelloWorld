package com.example.helloworld.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    @ResponseStatus(HttpStatus.OK)
    public String helloWorld() {
        return "Hello World";
    }
}
