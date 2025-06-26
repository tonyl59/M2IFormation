package org.example.exo4.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.exo4.dto.SpeciesResponseDto;

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
    private Enum<Category> category;

    @OneToOne
    @JoinColumn(name = "idObservation")
    private Observation observation;

    public SpeciesResponseDto entityToDto(){
        return SpeciesResponseDto.builder()
                .idSpecies(getIdSpecies())
                .commonName(getCommonName())
                .scientificName(getScientificName())
                .category(getCategory())
                .build();
    }
}
