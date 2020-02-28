package com.orm.demo.repository;

import com.orm.demo.model.Blog;
import com.orm.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<Blog,Long> {
Page<Blog> findAllByTitleContaining(String title, Pageable pageable);
Iterable<Blog> findAllByCategory(Category category);
}
