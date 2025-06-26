package org.example.exo4.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.exo4.dto.SpeciesResponseDto;

import java.util.List;

@Entity
@Table(name="species")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

public class Species {
    @Id
    @GeneratedValue
    private long idSpecies;

    private String commonName;
    private String scientificName;
    private Category category;

    @OneToMany(mappedBy = "species")
    private List<Observation> observations;

    public SpeciesResponseDto entityToDto(){
        return SpeciesResponseDto.builder()
                .idSpecies(idSpecies)
                .commonName(commonName)
                .scientificName(scientificName)
                .category(String.valueOf(category))
                .build();
    }
}
