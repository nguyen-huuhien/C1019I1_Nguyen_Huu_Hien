package com.orm.demo.fomatter;

import com.orm.demo.model.Category;
import com.orm.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class CategoryFomatter implements Formatter<Category> {
    private CategoryService categoryService;

    @Autowired
    public CategoryFomatter(CategoryService categoryService) {
        this.categoryService=categoryService;
    }
    @Override
    public Category parse(String text, Locale locale) throws ParseException {
        return categoryService.findById(Long.parseLong(text));
    }

    @Override
    public String print(Category object, Locale locale) {
        return  "[" + object.getId() + ", " +object.getName() + "]";
    }
}
