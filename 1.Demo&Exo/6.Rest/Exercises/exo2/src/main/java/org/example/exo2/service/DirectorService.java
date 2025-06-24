package org.example.exo2.service;

import org.example.exo2.dto.DirectorReceiveDto;
import org.example.exo2.dto.DirectorResponseDto;
import org.example.exo2.entity.Director;
import org.example.exo2.exception.NotFoundException;
import org.example.exo2.repository.DirectorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class DirectorService {


    private final DirectorRepository directorRepository;

    public DirectorService(DirectorRepository directorRepository){
        this.directorRepository = directorRepository;
    }

    public DirectorResponseDto create (DirectorReceiveDto directorReceiveDto){
        return directorRepository.save(directorReceiveDto.dtoToEntity()).entityToDto();
    }

    public DirectorResponseDto get(long id){
        return directorRepository.findById(id).orElseThrow(NotFoundException::new).entityToDto();
    }

    public List<DirectorResponseDto> get(){
        return directorRepository.findAll().stream().map(Director::entityToDto).toList();
    }



    public DirectorResponseDto update(long id, DirectorReceiveDto directorReceiveDto){
        Director directorFound = directorRepository.findById(id).orElseThrow(NotFoundException::new);
        Director directorGet = directorReceiveDto.dtoToEntity();
        directorFound.setLastname(directorGet.getLastname());
        directorFound.setFirstname(directorGet.getFirstname());
        directorFound.setBirthday(directorGet.getBirthday());
        return directorRepository.save(directorFound).entityToDto();
    }

    public void delete(long id){
        directorRepository.deleteById(id);
    }





}
