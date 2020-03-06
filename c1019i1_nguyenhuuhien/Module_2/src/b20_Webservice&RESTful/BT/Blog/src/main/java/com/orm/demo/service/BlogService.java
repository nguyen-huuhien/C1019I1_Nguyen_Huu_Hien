package com.orm.demo.service;

import com.orm.demo.model.Blog;

import java.util.List;

public interface BlogService {
    Iterable<Blog> findAll();

    Blog findById(Long id);

    void save (Blog blog);

    void remove(Long id);
}
