package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Date;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public ModelAndView getAllProduct(@PageableDefault(value = 5) Pageable pageable,
                                       @RequestParam(name = "name") Optional<String> name, Model model) {
        Page<Product> productList;
        if (name.isPresent()) {
            productList = productService.findAllByNameContaining(name.get(), pageable);
            model.addAttribute("name", name.get());
        } else {
            productList = productService.getAllProducts(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("product/list");
        modelAndView.addObject("productList", productList);
        return modelAndView;
    }

    @GetMapping("/product/create")
    public ModelAndView createProductForm() {
        ModelAndView modelAndView = new ModelAndView("/product/create");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    @PostMapping("/product/create")
    public ModelAndView createProduct(@Valid @ModelAttribute(name = "product") Product product, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("/product/create");
        } else {
            product.setDate(new Date());
            productService.saveProduct(product);
            ModelAndView modelAndView = new ModelAndView("product/create");
            modelAndView.addObject("product", new Product());
            modelAndView.addObject("status", "New product created successfully");
            return modelAndView;
        }
    }

    @GetMapping("/product/edit/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        ModelAndView modelAndView = new ModelAndView("/product/edit");
        modelAndView.addObject("product",product);
        return modelAndView;
    }
    @PostMapping("/product/update")
    public ModelAndView updateProduct(@Valid @ModelAttribute("product") Product product,BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("/product/edit");
        } else {
            product.setDate(new Date());
            productService.saveProduct(product);
            ModelAndView modelAndView = new ModelAndView("/product/edit");
            modelAndView.addObject("product",new Product());
            modelAndView.addObject("message","product updated successfully!");
            return modelAndView;
        }
    }

    @GetMapping("/product/delete/{id}")
    public ModelAndView showDeLeTeForm(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        ModelAndView modelAndView = new ModelAndView("/product/delete");

        modelAndView.addObject("product",product);
        return modelAndView;
    }
    @PostMapping("/product/delete")
    public String deleteProduct(@ModelAttribute("product") Product product) {
        productService.deleteProductById(product.getId());
        return "redirect:/products";
    }

}
