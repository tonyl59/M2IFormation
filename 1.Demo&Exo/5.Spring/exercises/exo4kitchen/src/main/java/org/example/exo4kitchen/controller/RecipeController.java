package org.example.exo4kitchen.controller;

import org.example.exo4kitchen.model.Recipe;
import org.example.exo4kitchen.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService){this.recipeService = recipeService;};

    // Create
    @GetMapping("/createrecipe")
    public String addRecipe(Model model){
        model.addAttribute("recipe", new Recipe());
        return "recipeT/createpage";
    }

    @PostMapping("/addrecipe")
    public String submitRecipe(@ModelAttribute("recipe") Recipe recipe){
        recipeService.create(recipe);
        return "redirect:/recipeT/createpage";
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

