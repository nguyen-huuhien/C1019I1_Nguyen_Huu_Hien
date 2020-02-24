package controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichController {
    @GetMapping("/giavi")
    public String input(){
        return "giavi";
    }
    @PostMapping("/giavi")
    public ModelAndView modelAndView (@RequestParam( name = "condiment",required = true) String[] condiment ){
        return new ModelAndView("giavi","mess", condiment);
    }
}