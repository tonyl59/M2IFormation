package org.example.exo4.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class ObservationResponseDto {
    private long idObservation;
    private String observerName;
    private String location;
    private double latitude;
    private double longitude;
    private LocalDate observationDate;
    private String comment;

}
