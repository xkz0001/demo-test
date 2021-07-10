package com.example.demo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/rest/docker/hello")
public class Hello {
    @GetMapping
    public String hello(){
        return "Hello everyone";
    }
}
