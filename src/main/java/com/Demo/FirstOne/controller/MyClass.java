package com.Demo.FirstOne.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
    @GetMapping("/sayName")
    public String sayName()
    {
         return "My Name is Pablo Bar";
    }
}
