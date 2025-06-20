package org.example.exo4kitchen.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {
    private int id;

    @NotNull
    @NotBlank(message = "Please complete field")
    private String name;

    private List<String> ingredients;

    @NotNull
    @NotBlank(message = "Please complete field")
    private String instructions;

    private int category_id;

//    @NotNull
//    @NotBlank(message = "Please choose category !")
    private Category category;

}
