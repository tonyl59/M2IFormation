package org.example.exo4kitchen.controller;

import jakarta.validation.Valid;
import org.example.exo4kitchen.model.Category;
import org.example.exo4kitchen.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
    public String submitCategory(@Valid @ModelAttribute("category") Category category, BindingResult bindingResult){ // Binding result & Valid allow to get message when null or not corresponding condition
        if(bindingResult.hasErrors()){
            return "categoryT/createpage"; // if i use redirect:/createcategory, it wont display the "error message null"
        }
        categoryService.create(category);
        return "redirect:/createcategory";
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
