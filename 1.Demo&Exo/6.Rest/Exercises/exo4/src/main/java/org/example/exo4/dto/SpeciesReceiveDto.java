package org.example.exo4.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo4.entity.Category;
import org.example.exo4.entity.Species;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class SpeciesReceiveDto {

    private String commonName;
    private String scientificName;
    private String category;

    public Species dtoToEntity(){
        return Species.builder()
                .commonName(getCommonName())
                .scientificName(getScientificName())
                .category(Category.valueOf(category))
                .build();
    }
}
