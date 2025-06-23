package org.example.exo2.service;

import org.example.exo2.dto.DirectorReceiveDto;
import org.example.exo2.entity.Director;
import org.example.exo2.exception.NotFoundException;
import org.example.exo2.repository.DirectorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DirectorService {


    private final DirectorRepository directorRepository;

    public DirectorService(DirectorRepository directorRepository){
        this.directorRepository = directorRepository;
    }

    public Director create (DirectorReceiveDto directorReceiveDto){
        return directorRepository.save(directorReceiveDto.dtoToEntity());
    }

    public Director get(long id){
        return directorRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    public List<Director> get(){
        return directorRepository.findAll().stream().toList();
    }



    public Director update(long id, DirectorReceiveDto directorReceiveDto){
        Director directorFound = directorRepository.findById(id).orElseThrow(NotFoundException::new);
        Director directorGet = directorReceiveDto.dtoToEntity();
        directorFound.setLastname(directorGet.getLastname());
        directorFound.setFirstname(directorGet.getFirstname());
        directorFound.setBirthday(directorGet.getBirthday());
        return directorRepository.save(directorFound);
    }

    public void delete(long id){
        directorRepository.deleteById(id);
    }





}
