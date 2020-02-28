package com.orm.demo.controller;

import com.orm.demo.model.Blog;
import com.orm.demo.model.Category;
import com.orm.demo.service.BlogService;
import com.orm.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private CategoryService categoryService;
    @ModelAttribute("categories")
    public Iterable<Category> categories() {
        return categoryService.findAll();
    }

    @Autowired
    private BlogService blogService;

    @GetMapping("/")
    public ModelAndView showCreateBlog() {
        ModelAndView modelAndView = new ModelAndView("blog/create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView saveBlog(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("blog/create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("message", "New blog created successfully");
        return modelAndView;
    }

    @GetMapping("/listBlogs")
    public ModelAndView listBlogs(@PageableDefault(value = 3 )Pageable pageable, @RequestParam("s")Optional<String> s, Model model) {
        Page<Blog> blogs ;
        if (s.isPresent()) {
            blogs = blogService.findAllByTitleContaining(s.get(), PageRequest.of(pageable.getPageNumber(),5, Sort.by("title").ascending()));
        } else {
            blogs = blogService.findAll(PageRequest.of(pageable.getPageNumber(),5, Sort.by("title").ascending()));
        }
        ModelAndView modelAndView = new ModelAndView("blog/list");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }

    @GetMapping("/edit-blog/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Blog blog = blogService.findById(id);
        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("blog/edit");
            modelAndView.addObject("blog", blog);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-blog")
    public ModelAndView updateBlog(@ModelAttribute("blog") Blog blog) {
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("blog/edit");
        modelAndView.addObject("message", "Blog updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-blog/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
    Blog blog = blogService.findById(id);
        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/delete");
            modelAndView.addObject("blog", blog);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }
    @PostMapping("/delete-blog")
    public String deleteBlog(@ModelAttribute("blog")Blog blog) {
        blogService.remove(blog.getId());
        return "redirect:listBlogs";
    }
}
