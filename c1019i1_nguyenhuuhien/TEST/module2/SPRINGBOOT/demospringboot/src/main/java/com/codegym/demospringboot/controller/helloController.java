package com.codegym.demospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloController {
    @GetMapping("/")
    public String testSpringboot() {
        return "hello";
    }
}
