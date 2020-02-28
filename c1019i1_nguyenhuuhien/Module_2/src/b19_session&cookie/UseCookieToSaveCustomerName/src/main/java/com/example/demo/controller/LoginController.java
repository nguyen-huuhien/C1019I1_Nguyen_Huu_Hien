package com.example.demo.controller;

import com.example.demo.entity.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@SessionAttributes("user")
public class LoginController {

    //add a user in model attribute
    @ModelAttribute("user")
    public User setUpUserForm() {
        return new User();
    }

    @RequestMapping("/login")
    public String doLogin(@CookieValue(value = "setUser", defaultValue = "") String setUser, Model model) {
        Cookie cookie = new Cookie("setUser",setUser);
        model.addAttribute("cookieValue",cookie);
        return "login";
    }

    @RequestMapping("/dologin")
    public String doLogin(@ModelAttribute("user") User user, Model model, @CookieValue(value = "setUser",defaultValue = "")String setUser,
                          HttpServletResponse response, HttpServletRequest request) {
    //implement business logic
        if (user.getEmail().equals("admin@gmail.com") && user.getPassword().equals("12345")) {
            if (user.getEmail() != null) {
                setUser = user.getEmail();
            }

            // create cookie and set in in response
            Cookie cookie = new Cookie("setUser", setUser);
            cookie.setMaxAge(24 * 60 * 60);
            response.addCookie(cookie);

            // get all cookies
            Cookie[] cookies = request.getCookies();
            // iterate each cookie
            for (Cookie ck : cookies) {
                // dis[lay only the cookie with the name 'setUser'
                if (ck.getName().equals("setUser")) {
                    model.addAttribute("cookieValue", ck);
                    break;
                } else {
                    ck.setValue("");
                    model.addAttribute("cookieValue", ck);
                    break;
                }
            }
            model.addAttribute("message", "Login success . quéo come");

        } else {
            user.setEmail("");
            Cookie cookie = new Cookie("setUser",setUser);
            model.addAttribute("cookieValue",cookie);
            model.addAttribute("message","Login failed . pls try again");
        }
        return "login";
    }


}
