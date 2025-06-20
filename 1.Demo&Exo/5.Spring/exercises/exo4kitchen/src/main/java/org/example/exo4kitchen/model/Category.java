package org.example.exo4kitchen.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private int id;

    @NotNull
    @NotBlank(message = "Please complete field")
    private String name;

    @NotNull
    @NotBlank(message = "Please complete field")
    private String description;
}
