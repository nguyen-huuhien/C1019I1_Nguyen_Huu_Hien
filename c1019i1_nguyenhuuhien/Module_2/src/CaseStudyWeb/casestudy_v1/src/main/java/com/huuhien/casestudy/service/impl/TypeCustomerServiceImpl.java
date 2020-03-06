package com.huuhien.casestudy.service.impl;

import com.huuhien.casestudy.entity.customer.TypeCustomer;
import com.huuhien.casestudy.repository.TypeCustomerRepository;
import com.huuhien.casestudy.service.TypeCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeCustomerServiceImpl implements TypeCustomerService {
    @Autowired
    private TypeCustomerRepository typeCustomerRepository;

    @Override
    public Iterable<TypeCustomer> findAll() {
        return typeCustomerRepository.findAll();
    }

    @Override
    public TypeCustomer findById(Long id) {
        return typeCustomerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(TypeCustomer typeCustomer) {
    typeCustomerRepository.save(typeCustomer);
    }

    @Override
    public void remove(Long id) {
        typeCustomerRepository.deleteById(id);
    }
}
