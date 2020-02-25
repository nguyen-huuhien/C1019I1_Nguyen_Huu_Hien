package com.codegym.cms.quanlykhachhang.service;

import com.codegym.cms.quanlykhachhang.model.Customer;
import com.codegym.cms.quanlykhachhang.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CustomerService {
    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAll(Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Page<Customer> findAllByFirstNameContaining(String fistName,Pageable pageable);
}