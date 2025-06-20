package org.example.exo4kitchen.controller;

import jakarta.validation.Valid;
import org.example.exo4kitchen.model.Category;
import org.example.exo4kitchen.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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
    public String submitCategory(@Valid @ModelAttribute("category") Category category, BindingResult bindingResult){ //Valid verifies that everything is correct in category
        // Binding result will check if attributes are  valid with hasErrors, returning true if  category does not respect conditions, else false if its correct
        // Binding result & Valid allow to get message when null or not corresponding condition
        if(bindingResult.hasErrors()){
            return "categoryT/createpage"; // if i use redirect:/createcategory, it wont display the "error message null".
            // its because binding result will say that my object page has an error, redirect says that i finished my job... so it "throws everything" away.
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

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id){
        categoryService.delete(id);
        return "redirect:/categories";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") int id, Model model){
        Category category = categoryService.get_by_id(id);
        model.addAttribute("category", category);
        return "categoryT/createpage"; // reutilisation de la même page html
    }
}
