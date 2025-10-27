package com.resilience4j.service_B.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/b")
public class ServiceB {

    @GetMapping
    public String serviceB(){
        return "this is service B";
    }
}
