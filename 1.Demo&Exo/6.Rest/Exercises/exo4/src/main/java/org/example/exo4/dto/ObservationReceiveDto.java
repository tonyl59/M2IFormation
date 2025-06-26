package org.example.exo4.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo4.entity.Observation;
import org.example.exo4.entity.Species;
import org.example.exo4.exception.NotFoundException;
import org.example.exo4.repository.SpeciesRepository;
import org.example.exo4.service.ObservationService;
import org.example.exo4.service.SpeciesService;

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
    //@NotEmpty(message = "Please input a valid species")
    private long idSpecies;


    public Observation dtoToEntity(SpeciesRepository speciesRepository) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return Observation.builder()
                .observerName(getObserverName())
                .location(getLocation())
                .latitude(getLatitude())
                .longitude(getLongitude())
                .observationDate(LocalDate.parse(getObservationDate(), dateTimeFormatter))
                .comment(getComment())
                .species(speciesRepository.findById(idSpecies).orElseThrow(NotFoundException::new))
                .build();
    }

}

