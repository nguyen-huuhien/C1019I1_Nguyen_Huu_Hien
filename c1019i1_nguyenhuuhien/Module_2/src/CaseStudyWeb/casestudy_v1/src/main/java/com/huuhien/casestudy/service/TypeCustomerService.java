package com.huuhien.casestudy.service;

import com.huuhien.casestudy.entity.customer.TypeCustomer;

public interface TypeCustomerService {
    Iterable<TypeCustomer> findAll();
    TypeCustomer findById(Long id);
    void save(TypeCustomer typeCustomer);
    void remove(Long id);
}
