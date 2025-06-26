package org.example.exo4.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.example.exo4.dto.TravellogResponseDto;

@Entity
@Table(name="travellog")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

public class Travellog {
    @Id
    @GeneratedValue
    long idTravellog;

    @NotNull(message = "Please input a distance")
    double distanceKm;

    @NotNull(message = "Please input a travel mode")
    Enum<TravelMode> mode;


    double estimatedCo2Kg;

    @OneToOne(mappedBy = "travellog")
    private Observation observation;

    public double get_co2kg(){
        Enum<TravelMode> mode = getMode();
        double distance = getDistanceKm();
        double mode_co2 = 0;
        double total_co2;
        switch(mode){
            case TravelMode.WALKING, TravelMode.BIKE:
                mode_co2 = 0;
                break;
            case TravelMode.CAR:
                mode_co2 = 0.22;
                break;
            case TravelMode.BUS:
                mode_co2 = 0.11;
                break;
            case TravelMode.TRAIN:
                mode_co2 = 0.03;
                break;
            case TravelMode.PLANE:
                mode_co2 = 0.259;
            default:
                break;
        }
        total_co2 = distance*mode_co2;
        return total_co2;

    }
    public TravellogResponseDto entityToDto(){
        return TravellogResponseDto.builder()
                .idTravellog(getIdTravellog())
                .distanceKm(getDistanceKm())
                .mode(getMode())
                .estimatedCo2Kg(getEstimatedCo2Kg())
                .build();
    }





}
