package org.example.exo4.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo4.entity.TravelMode;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class TravellogResponseDto {
    private long idTravellog;
    private double distanceKm;
    private double estimatedCo2Kg;
    private Enum<TravelMode> mode;
    private long observationId;

}
