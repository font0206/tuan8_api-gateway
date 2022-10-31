package com.example.servicehi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {

    @GetMapping("/hi")
    public String getHelllo(){
        return "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
    }
}
