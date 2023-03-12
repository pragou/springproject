package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/api/{name}")
    public String test(@PathVariable String name){
        return "Hi , hello Mr."+name;
    }
}
