package org.example.exo4kitchen.model;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private int id;
    private String name;
    private String description;
}
