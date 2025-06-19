package org.example.exo4kitchen.controller;

import org.example.exo4kitchen.model.Category;
import org.example.exo4kitchen.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService){this.categoryService = categoryService;};


    // Create
    @GetMapping("/createcategory")
    public String addCategory(Model model){
        model.addAttribute("category", new Category());
        return "categoryT/createpage";
    }

    @PostMapping("/addcategory")
    public String submitCategory(@ModelAttribute("category") Category category){
        categoryService.create(category);
        return "redirect:/categoryT/createpage";
    }

    //Get
    @GetMapping("/categories")
    public String list(Model model){

        model.addAttribute("categories", categoryService.get_all());
        return "categoryT/listpage";
    }

    @GetMapping("/categories/detail/{id}")
    public String detail(@PathVariable("id") int id, Model model){
        Category category = categoryService.get_by_id(id);
        model.addAttribute(category);
        return "categoryT/detailpage";
    }
}
