package org.example.exo4.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.exo4.dto.ObservationResponseDto;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="observation")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Observation {
    @Id
    @GeneratedValue
    private long idObservation;
    private String observerName;
    private String location;
    private double latitude;
    private double longitude;
    private LocalDate observationDate;
    private String comment;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "idSpecies")
    private Species species;

    @OneToMany(mappedBy = "observation")
    private List<Travellog> travellogs;

    public ObservationResponseDto entityToDto(){
        return ObservationResponseDto.builder()
                .idObservation(getIdObservation())
                .observerName(getObserverName())
                .location(getLocation())
                .latitude(getLatitude())
                .longitude(getLongitude())
                .observationDate(getObservationDate())
                .comment(getComment())
                .idSpecies(getSpecies().getIdSpecies())
                .build();

    }








}
