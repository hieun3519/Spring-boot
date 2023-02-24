package com.starter.Springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// CTRL ALT O to remove all unused import
// can run using mvn name:run
@RestController
public class HelloController {


    @GetMapping("/")
    public String helloworld() {
        return "Welcome to Springboot";
    }

}
