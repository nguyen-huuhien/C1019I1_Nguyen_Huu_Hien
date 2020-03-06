package com.huuhien.casestudy.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface Service<T> {

    Page<T> getAll(Pageable pageable);
    T getById(Long id);
    void save(T t);
    void deleteById(Long id);
    Page<T> finAllByNameContaining(String name,Pageable pageable);

}
