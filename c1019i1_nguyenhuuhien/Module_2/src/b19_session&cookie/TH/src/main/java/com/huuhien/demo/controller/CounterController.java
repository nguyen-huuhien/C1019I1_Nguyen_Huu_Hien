package com.huuhien.demo.controller;

import com.huuhien.demo.entity.MyCounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("mycounter")
public class CounterController {
    //add my counter in model attribute
    @ModelAttribute("mycounter")
    public MyCounter setupCounter() {
        return new MyCounter();
    }

    @GetMapping("/")
    public String get(@ModelAttribute("mycounter") MyCounter myCounter ) {
        myCounter.increment();
        return "index";
    }

}
