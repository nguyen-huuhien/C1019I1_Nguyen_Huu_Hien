package com.orm.demo.service;

import com.orm.demo.model.Blog;
import com.orm.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Blog findById(Long id);

    void save (Blog blog);

    void remove(Long id);

    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);
    Iterable<Blog> findAllByCategory(Category category);
}
