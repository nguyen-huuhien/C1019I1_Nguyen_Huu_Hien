package com.huuhien.casestudy.repository;

import com.huuhien.casestudy.entity.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findAllByFullNameContaining(String name, Pageable pageable);
}
