package com.resilience4j.service_A.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.name;

@RestController
@RequestMapping("/a")
public class ServiceA {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    @CircuitBreaker(name="Service_A",fallbackMethod = "serviceAfallBack")
    public String ServiceA(){
        String result = restTemplate.getForObject("http://localhost:8080/b", String.class);
        return "serviceb is calling form serviceA : "+result;
    }

    public String serviceAfallBack(Exception e){
        return "sorry service B is down..";
    }
}
