package org.example.exo4kitchen.controller;

import jakarta.validation.Valid;
import org.example.exo4kitchen.model.Category;
import org.example.exo4kitchen.model.Recipe;
import org.example.exo4kitchen.service.CategoryService;
import org.example.exo4kitchen.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class RecipeController {
    private final RecipeService recipeService;
    private final CategoryService categoryService;

    public RecipeController(RecipeService recipeService, CategoryService categoryService){
        this.recipeService = recipeService;
        this.categoryService = categoryService;
    };

    // Create
    @GetMapping("/createrecipe")
    public String addRecipe(Model model){
        model.addAttribute("recipe", new Recipe());
        List<Category> categories = categoryService.get_all();
        model.addAttribute("categories",categories);

        return "recipeT/createpage";
    }

    @PostMapping("/addrecipe")
    public String submitRecipe(@Valid @ModelAttribute("recipe") Recipe recipe, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "recipeT/createpage"; //TODO : slide bar becomes void
        }
        recipe.setCategory(categoryService.get_by_id(recipe.getCategory_id()));
        recipeService.create(recipe);
        return "redirect:/createrecipe";
    }

    //Get
    @GetMapping("/recipes")
    public String list(Model model){
        model.addAttribute("recipes", recipeService.get_all());
        return "recipeT/listpage";
    }

    @GetMapping("/recipes/detail/{id}")
    public String detail(@PathVariable("id") int id, Model model){
        Recipe recipe = recipeService.get_by_id(id);
        model.addAttribute(recipe);
        return "recipeT/detailpage";
    }

}

