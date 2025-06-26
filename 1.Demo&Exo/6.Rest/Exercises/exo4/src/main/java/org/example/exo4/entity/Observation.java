package org.example.exo4.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.exo4.dto.ObservationResponseDto;

import java.time.LocalDate;

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

    public ObservationResponseDto entityToDto(){
        return ObservationResponseDto.builder()
                .idObservation(getIdObservation())
                .observerName(getObserverName())
                .location(getLocation())
                .latitude(getLatitude())
                .longitude(getLongitude())
                .observationDate(getObservationDate())
                .comment(getComment())
                .build();

    }


    @OneToOne(mappedBy = "observation")
    private Species species;

    @OneToOne(mappedBy = "observation")
    @JoinColumn(name = "idTravellog")
    private Travellog travellog;





}
