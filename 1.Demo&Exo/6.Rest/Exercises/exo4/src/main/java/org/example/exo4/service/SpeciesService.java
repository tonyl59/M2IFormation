package org.example.exo4.service;

import org.example.exo4.dto.SpeciesReceiveDto;
import org.example.exo4.dto.SpeciesResponseDto;
import org.example.exo4.entity.Species;
import org.example.exo4.exception.NotFoundException;
import org.example.exo4.repository.SpeciesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeciesService {

    private final SpeciesRepository speciesRepository;

    public SpeciesService(SpeciesRepository speciesRepository){
        this.speciesRepository = speciesRepository;
    }

    public SpeciesResponseDto create (SpeciesReceiveDto speciesReceiveDto){
        return speciesRepository.save(speciesReceiveDto.dtoToEntity()).entityToDto();
    }

    public SpeciesResponseDto get(long id){
        return speciesRepository.findById(id).orElseThrow(NotFoundException::new).entityToDto();
    }

    public List<SpeciesResponseDto> get(){
        return speciesRepository.findAll().stream().map(Species::entityToDto).toList();
    }

}
