package com.thymeleaf.quanlykhachhangspringbootthymeleaf.controller;

import com.thymeleaf.quanlykhachhangspringbootthymeleaf.model.Customer;
import com.thymeleaf.quanlykhachhangspringbootthymeleaf.service.CustomerService;
import com.thymeleaf.quanlykhachhangspringbootthymeleaf.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public ModelAndView index() {
        List<Customer> customers;
        customers = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("index", "customers", customers);
        return modelAndView;
    }

}
