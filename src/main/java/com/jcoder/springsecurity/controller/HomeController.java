package com.jcoder.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/home")
    public String home(){

        return "will stay in same service";
    }
    @GetMapping("/admin")
    public String admin(){
        return "will call other microservice";
    }
}
