package org.example.exo4kitchen.service;

import lombok.Getter;
import org.example.exo4kitchen.model.Category;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Service
public class CategoryService {
    Map<Integer, Category> categories = new HashMap<>();
    private static int cid = 3;

    public CategoryService(){
        Category category1 = Category.builder().id(1).name("Pizza").description("Italian specialty consisting of a flat base of leavened wheat-based dough ").build();
        Category category2 = Category.builder().id(2).name("Pasta").description("Italian specialty consisting of an unleavened dough of wheat flour mixed with water or eggs").build();
        categories.put(category1.getId(), category1);
        categories.put(category2.getId(), category2);
    }

    public void create(Category category) {
        category.setId(cid);
        this.categories.put(cid,category);
        cid++;
    }

    public List<Category> get_all(){
        return categories.values().stream().toList();
    }

    public Category get_by_id(int id){
        return this.categories.get(id);
    }

    public void delete(int id){
        this.categories.remove(id);
    }

}
