package com.codegym.cms.quanlykhachhang.service;

import com.codegym.cms.quanlykhachhang.model.Customer;

import java.util.Optional;

public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}