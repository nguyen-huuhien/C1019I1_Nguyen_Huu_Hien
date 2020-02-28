package com.orm.demo.service;

import com.orm.demo.model.Category;

public interface CategoryService {
    Iterable<Category> findAll();

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);

}
