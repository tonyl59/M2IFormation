package org.example.product.controller;

import org.example.product.model.Product;
import org.example.product.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String homePage(){return "page_home";}

    @GetMapping("/list")
    public String list(Model model) {
    List<Product> products = productService.getProducts();
    model.addAttribute("products",products);
    return "page_products";
    }
}
