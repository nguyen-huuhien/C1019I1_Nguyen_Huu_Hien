package com.orm.demo.repository;

import com.orm.demo.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepository extends PagingAndSortingRepository<Category,Long> {
}
