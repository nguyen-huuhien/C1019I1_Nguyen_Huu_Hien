package com.codegym.cms.quanlykhachhang.repository;


import com.codegym.cms.quanlykhachhang.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {

}
