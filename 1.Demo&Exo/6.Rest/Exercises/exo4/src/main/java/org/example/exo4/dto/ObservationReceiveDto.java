package org.example.exo4.dto;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo4.entity.Observation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class ObservationReceiveDto {
    private String observerName;
    private String location;
    private double latitude;
    private double longitude;

    @Pattern(regexp= "[0-9]{4}[-|\\/]{1}[0-9]{2}[-|\\/]{1}[0-9]{2}" , message = "Date should be as yyyy-MM-dd format!")
    private String observationDate;
    private String comment;

    public Observation dtoToEntity() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        return Observation.builder()
                .observerName(getObserverName())
                .location(getLocation())
                .latitude(getLatitude())
                .longitude(getLongitude())
                .observationDate(LocalDate.parse(getObservationDate(), dateTimeFormatter))
                .comment(getComment())
                .build();
    }
}
