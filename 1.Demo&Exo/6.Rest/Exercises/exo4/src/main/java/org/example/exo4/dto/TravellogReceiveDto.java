package org.example.exo4.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo4.entity.TravelMode;
import org.example.exo4.entity.Travellog;
import org.example.exo4.exception.NotFoundException;
import org.example.exo4.repository.ObservationRepository;

import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class TravellogReceiveDto {

    double distanceKm;
    String mode;
    long idObservation;

    public Travellog dtoToEntity(ObservationRepository observationRepository){
        Travellog travellog = Travellog.builder()
                .distanceKm(distanceKm)
                .mode(TravelMode.valueOf(mode))
                .observation(observationRepository.findById(idObservation).orElseThrow(NotFoundException::new))
                .build();
        travellog.setEstimatedCo2Kg(travellog.get_co2kg());
        return travellog;
    }
/*Category.valueOf(category)*/
}
