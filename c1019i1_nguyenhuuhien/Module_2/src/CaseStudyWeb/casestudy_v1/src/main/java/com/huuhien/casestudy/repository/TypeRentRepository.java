package com.huuhien.casestudy.repository;

import com.huuhien.casestudy.entity.customer.Customer;
import com.huuhien.casestudy.entity.service.TypeRent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRentRepository extends JpaRepository<TypeRent,Long> {

}
