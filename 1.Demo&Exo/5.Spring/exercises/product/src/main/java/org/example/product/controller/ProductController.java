package org.example.product.controller;

import jdk.jfr.Category;
import org.example.product.model.Product;
import org.example.product.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class ProductController {

    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String homePage(){return "page_home";}

    @GetMapping("/products")
    public String list(Model model) {
    List<Product> products = productService.getProducts();
    Set<String> categories = productService.getCategories();
    model.addAttribute("products",products);
        model.addAttribute("categories", categories);
    return "page_products";
    }

    @GetMapping("/products/detail/{id}")
    public String detail(@PathVariable("id") int id, Model model){
        Product product = productService.getByID(id);
        model.addAttribute(product);
        return "page_productdetail";
    }

    @GetMapping("/products/category/{category}")
    public String get_by_category(@PathVariable("category") String category, Model model){
        List<Product> products = productService.getByCategory(category);
        model.addAttribute("products",products);
        return "page_category";
    }



}
