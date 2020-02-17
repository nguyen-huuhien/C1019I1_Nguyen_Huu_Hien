package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculator {
    @GetMapping("/calculator")
    public String calculator() {
        return "index";
    }

    @RequestMapping("/1")
    public ModelAndView conveter(@RequestParam("usd") String usd ,@RequestParam("rate") String rate) {
       float usd1 =  Float.parseFloat(usd) * Float.parseFloat(rate);
       return new ModelAndView("index","usd1",usd1);
    }
}
