package org.example.exo4.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo4.entity.TravelMode;
import org.example.exo4.entity.Travellog;

import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class TravellogReceiveDto {

    double distanceKm;
    Enum<TravelMode> mode;

    public Travellog dtoToEntity(){
        Travellog travellog =
                Travellog.builder()
                .distanceKm(getDistanceKm())
                .mode(getMode())
                .build();
        travellog.setEstimatedCo2Kg(travellog.get_co2kg());
        return travellog;
    }

}
