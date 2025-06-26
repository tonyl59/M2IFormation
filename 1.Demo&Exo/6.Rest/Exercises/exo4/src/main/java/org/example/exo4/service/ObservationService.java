package org.example.exo4.service;

import org.example.exo4.dto.ObservationReceiveDto;
import org.example.exo4.dto.ObservationResponseDto;
import org.example.exo4.entity.Observation;
import org.example.exo4.exception.NotFoundException;
import org.example.exo4.repository.ObservationRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ObservationService {

    private final ObservationRepository observationRepository;

    public ObservationService(ObservationRepository observationRepository){
        this.observationRepository = observationRepository;
    }

    public ObservationResponseDto create (ObservationReceiveDto observationReceiveDto){
        return observationRepository.save(observationReceiveDto.dtoToEntity()).entityToDto();
    }

    public ObservationResponseDto get(long id){
        return observationRepository.findById(id).orElseThrow(NotFoundException::new).entityToDto();
    }

    public List<ObservationResponseDto> get(){
        return observationRepository.findAll().stream().map(Observation::entityToDto).toList();
    }

    public List<ObservationResponseDto> get_by_location(String location){
        List<ObservationResponseDto> location_obs = new ArrayList<>();
        for (Observation o : observationRepository.findAll().stream().toList()){
            if (o.getLocation().equals(location)){
                location_obs.add(o.entityToDto());
            }

        }
        return location_obs;
    }

    public List<ObservationResponseDto> get_by_species(long species_id){
        List<ObservationResponseDto> species_obs = new ArrayList<>();
        for (Observation o : observationRepository.findAll().stream().toList()){
            if (o.getSpecies().getIdSpecies() == species_id){
                species_obs.add(o.entityToDto());
            }

        }
        return species_obs;
    }







}
