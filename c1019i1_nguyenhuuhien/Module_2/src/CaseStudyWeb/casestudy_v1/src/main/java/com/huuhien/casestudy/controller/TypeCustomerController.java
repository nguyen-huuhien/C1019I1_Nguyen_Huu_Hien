package com.huuhien.casestudy.controller;

import com.huuhien.casestudy.entity.customer.TypeCustomer;
import com.huuhien.casestudy.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TypeCustomerController {

    @Autowired
    private TypeCustomerService typeCustomerService;

    //show list customer
    @GetMapping("/customer/typecustomer/list")
    public ModelAndView listTypeCustomer() {
        Iterable<TypeCustomer> typeCustomers = typeCustomerService.findAll();
        ModelAndView modelAndView = new ModelAndView("/customer/typecustomer/list");
        modelAndView.addObject("typeCustomers", typeCustomers);
        return modelAndView;
    }

    // create new typeCustomer
    @GetMapping("/customer/typecustomer/create")
    public ModelAndView showCreateTypeCustomerForm() {
        ModelAndView modelAndView = new ModelAndView("/customer/typecustomer/create");
        modelAndView.addObject("typeCustomer", new TypeCustomer());
        return modelAndView;
    }

    @PostMapping("/customer/typecustomer/create")
    public ModelAndView saveTypeCustomer(@ModelAttribute("typeCustomer") TypeCustomer typeCustomer) {
        typeCustomerService.save(typeCustomer);

        ModelAndView modelAndView = new ModelAndView("/customer/typecustomer/create");
        modelAndView.addObject("typeCustomer", new TypeCustomer());
        modelAndView.addObject("message", " New type customer created successfully!");
        return modelAndView;
    }

    // edit type
    @GetMapping("/customer/typecustomer/edit/{id}")
    public ModelAndView showEditTypeCustomerForm(@PathVariable Long id) {
        TypeCustomer typeCustomer = typeCustomerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/customer/typecustomer/edit");
        modelAndView.addObject("typeCustomer", typeCustomer);
        return modelAndView;
    }

    @PostMapping("/customer/typecustomer/edit")
    public ModelAndView updateTypeCustomer(@ModelAttribute("typeCustomer") TypeCustomer typeCustomer) {
        typeCustomerService.save(typeCustomer);
        ModelAndView modelAndView = new ModelAndView("/customer/typecustomer/edit");
        modelAndView.addObject("typeCustomer",new TypeCustomer());
        modelAndView.addObject("message","Update successfully");
        return modelAndView;
    }

    @GetMapping("/customer/typecustomer/delete/{id}")
    public ModelAndView showDeleteTypeCustomerForm(@PathVariable Long id) {
        TypeCustomer typeCustomer = typeCustomerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/customer/typecustomer/delete");
        modelAndView.addObject("typeCustomer",typeCustomer);
        return modelAndView;
    }
    @PostMapping("/customer/typecustomer/delete")
    public String deleteTypeCustomer(@ModelAttribute("typeCsutomer")TypeCustomer typeCustomer) {
        typeCustomerService.remove(typeCustomer.getIdTypeCustomer());
        return "redirect:/customer/typecustomer/list";
    }
}
