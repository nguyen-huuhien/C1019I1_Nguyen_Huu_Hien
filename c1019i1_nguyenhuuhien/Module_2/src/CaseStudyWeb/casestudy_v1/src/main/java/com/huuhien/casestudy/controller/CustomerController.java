package com.huuhien.casestudy.controller;

import com.huuhien.casestudy.entity.customer.Customer;

import com.huuhien.casestudy.entity.customer.TypeCustomer;
import com.huuhien.casestudy.service.CustomerService;
import com.huuhien.casestudy.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    TypeCustomerService typeCustomerService;
    @Autowired
    CustomerService customerService;

    @GetMapping("/customer/list")
    public ModelAndView getAllCustomer(@PageableDefault(value = 5) Pageable pageable,
                                       @RequestParam(name = "name") Optional<String> name, Model model) {
        Page<Customer> customerList;
        if (name.isPresent()) {
            customerList = customerService.findAllByNameContaining(name.get(), pageable);
        } else {
            customerList = customerService.getAllCustomers(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customerList", customerList);
        return modelAndView;
    }

    @GetMapping("/customer/create")
    public ModelAndView createCustomerForm() {
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/customer/create")
    public ModelAndView createCustomer(@Valid @ModelAttribute(name = "customer") Customer customer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("/customer/create");
        } else {
            customerService.saveCustomer(customer);
            ModelAndView modelAndView = new ModelAndView("customer/create");
            modelAndView.addObject("customer", new Customer());
            modelAndView.addObject("status", "New customer created successfully");
            return modelAndView;
        }
    }

    //    @PostMapping("/customer/create")
//    public ModelAndView createCustomer(Customer customer, BindingResult bindingResult) {
//
//            customerService.saveCustomer(customer);
//            ModelAndView modelAndView = new ModelAndView("customer/create");
//            modelAndView.addObject("customer",new Customer());
//            modelAndView.addObject("status","New customer created successfully");
//            return modelAndView;
//
//    }
    @GetMapping("/customer/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Customer customer = customerService.getCustomerById(id);
        ModelAndView modelAndView = new ModelAndView("/customer/edit");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping("/customer/update")
    public ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.saveCustomer(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/edit");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("message", "Customer updated successfully!");
        return modelAndView;
    }

    @GetMapping("/customer/delete/{id}")
    public ModelAndView showDeLeTeForm(@PathVariable Long id) {
        Customer customer = customerService.getCustomerById(id);
        ModelAndView modelAndView = new ModelAndView("/customer/delete");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping("/customer/delete")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.deleteCustomerById(customer.getId());
        return "redirect:/customer/list";
    }

    //drop down type customer
    @ModelAttribute("typeCustomers")
    public Iterable<TypeCustomer> typeCustomers() {
        return typeCustomerService.findAll();
    }


}
