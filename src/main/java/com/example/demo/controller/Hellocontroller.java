package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

    @GetMapping("/")
    public String hello() {
        return "Hello, CI/CD M1!";
    }

    @GetMapping("/subtractTest")
    public int subtractTest() {
        int a = 10;
        int b = 3;
        return a - b;
    }

    @GetMapping("/subtract3Test")
    public int subtractThreeTest() {
        int a = 10;
        int b = 3;
        int c = 2;
        return a - b - c;
    }

}