package org.example.exo4.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo4.entity.TravelMode;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class TravelObservationResponseDto {
    double totalDistanceKm;
    double totalEmissionsKg;
    List<Enum<TravelMode>> byMode ;


}
