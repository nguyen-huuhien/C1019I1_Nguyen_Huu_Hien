package com.codegym.cms.quanlykhachhang.service;

import com.codegym.cms.quanlykhachhang.model.Customer;
import com.codegym.cms.quanlykhachhang.model.Province;

import java.util.Optional;

public interface CustomerService {
    Iterable<Customer> findAllByProvince(Province province);

    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}