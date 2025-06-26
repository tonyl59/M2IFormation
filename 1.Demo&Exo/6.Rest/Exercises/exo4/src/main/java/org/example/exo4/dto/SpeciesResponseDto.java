package org.example.exo4.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo4.entity.Category;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class SpeciesResponseDto {
    private long idSpecies;
    private String commonName;
    private String scientificName;
    private Enum<Category> category;

}
