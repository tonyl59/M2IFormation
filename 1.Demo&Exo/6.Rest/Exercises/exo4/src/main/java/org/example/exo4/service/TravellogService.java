package org.example.exo4.service;

import org.example.exo4.dto.TravelObservationResponseDto;
import org.example.exo4.dto.TravellogReceiveDto;
import org.example.exo4.dto.TravellogResponseDto;
import org.example.exo4.entity.TravelMode;
import org.example.exo4.entity.Travellog;
import org.example.exo4.exception.NotFoundException;
import org.example.exo4.repository.ObservationRepository;
import org.example.exo4.repository.TravellogRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TravellogService {

    private final TravellogRepository travellogRepository;
    private final ObservationService observationService;

    public TravellogService(TravellogRepository travellogRepository, ObservationService observationService){
        this.travellogRepository = travellogRepository;
        this.observationService = observationService;
    }

    public TravellogResponseDto create(TravellogReceiveDto travellogReceiveDto){
        return travellogRepository.save(travellogReceiveDto.dtoToEntity()).entityToDto();
    }



    public List<TravellogResponseDto> get(){
        return travellogRepository.findAll().stream().map(Travellog::entityToDto).toList();
    }

    public TravelObservationResponseDto get_by_observations(long id){
        double totalDistanceKm = 0;
        double totalEmissionsKg = 0;
        List <Enum<TravelMode>> byMode = new ArrayList<>();
        for (TravellogResponseDto t : this.get()){
            if (t.getObservationId() == id){
                byMode.add(t.getMode());
                totalDistanceKm += t.getDistanceKm();
                totalEmissionsKg += t.getEstimatedCo2Kg();
            }

        }

        return TravelObservationResponseDto.builder().totalDistanceKm(totalDistanceKm).totalEmissionsKg(totalEmissionsKg).byMode(byMode).build();
    }
}
