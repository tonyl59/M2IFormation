package org.example.exo4kitchen.model;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    private int id;
    private String name;
    private List<String> ingredients;
    private String instructions;
    private Category category;

}
