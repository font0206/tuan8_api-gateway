package com.example.servicehello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

    @GetMapping("/hello")
    public String getHelllo(){
        return "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
    }
}
