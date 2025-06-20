package org.example.exo4kitchen.service;

import org.example.exo4kitchen.model.Category;
import org.example.exo4kitchen.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RecipeService {
    Map<Integer, Recipe> recipes = new HashMap<>();
    private int cid = 4;
    CategoryService categoryService = new CategoryService();

    public RecipeService(){
        List<String> ingredients1 = new ArrayList<>();
        Collections.addAll(ingredients1, "tomato sauce", "flour");
        List<String> ingredients2 = new ArrayList<>();
        Collections.addAll(ingredients2, "tomato sauce", "flour","basil","mozzarella");
        List<String> ingredients3 = new ArrayList<>();
        Collections.addAll(ingredients3, "pasta", "carbonara sauce");

        Category category1 = categoryService.get_by_id(1); // Pizza
        Category category2 = categoryService.get_by_id(2);


        Recipe recipe1 = Recipe.builder().id(1).category_id(1).name("Plain").category(category1).ingredients(ingredients1).instructions("prepare flour, put tomate sauce and cook then cook on oven").build();
        Recipe recipe2 = Recipe.builder().id(2).category_id(1).name("Margherita").category(category1).ingredients(ingredients2).instructions("prepare flour, put tomate sauce, mozzarella & basil then cook on oven").build();
        Recipe recipe3 = Recipe.builder().id(3).category_id(2).name("Carbonara").category(category2).ingredients(ingredients3).instructions("Cook pasta and put carbonara sauce in it").build();
        recipes.put(recipe1.getId(), recipe1);
        recipes.put(recipe2.getId(), recipe2);
        recipes.put(recipe3.getId(), recipe3);

    }

    public void create(Recipe recipe) {
        recipe.setId(cid);
        this.recipes.put(cid,recipe);
        cid++;
    }

    public List<Recipe> get_all(){
        return recipes.values().stream().toList();
    }

    public Recipe get_by_id(int id){
        return this.recipes.get(id);
    }

    public void delete(int id){
        this.recipes.remove(id);
    }

}
