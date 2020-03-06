package com.huuhien.casestudy.service;

import com.huuhien.casestudy.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> getAllCustomers(Pageable pageable);
    Customer getCustomerById(Long id);
    void saveCustomer(Customer customer);
    void deleteCustomerById(Long id);
    Page<Customer> findAllByNameContaining(String name,Pageable pageable);

}
