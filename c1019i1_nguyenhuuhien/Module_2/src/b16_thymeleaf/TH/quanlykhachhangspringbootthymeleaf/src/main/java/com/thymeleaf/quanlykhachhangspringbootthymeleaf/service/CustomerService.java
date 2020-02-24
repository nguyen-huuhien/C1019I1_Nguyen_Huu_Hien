package com.thymeleaf.quanlykhachhangspringbootthymeleaf.service;

import com.thymeleaf.quanlykhachhangspringbootthymeleaf.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
