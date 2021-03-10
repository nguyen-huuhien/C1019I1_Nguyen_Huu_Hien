package com.huuhien.casestudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("/")
    public ModelAndView showHome() {
        ModelAndView modelAndView = new ModelAndView("/home/home");
        return modelAndView;
    }

}