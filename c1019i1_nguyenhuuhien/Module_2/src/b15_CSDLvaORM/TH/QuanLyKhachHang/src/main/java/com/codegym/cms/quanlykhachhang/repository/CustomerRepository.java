package com.codegym.cms.quanlykhachhang.repository;


import com.codegym.cms.quanlykhachhang.model.Customer;
import com.codegym.cms.quanlykhachhang.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
