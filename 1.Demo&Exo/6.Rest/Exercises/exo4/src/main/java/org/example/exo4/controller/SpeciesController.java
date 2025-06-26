package org.example.exo4.controller;

import jakarta.validation.Valid;
import org.example.exo4.dto.SpeciesReceiveDto;
import org.example.exo4.dto.SpeciesResponseDto;
import org.example.exo4.service.SpeciesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/species")
public class SpeciesController {

    private SpeciesService service;

    public SpeciesController(SpeciesService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<SpeciesResponseDto>> getAll(){
        return ResponseEntity.ok(service.get());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SpeciesResponseDto> get (@PathVariable long id){
        return ResponseEntity.ok(service.get(id));
    }



    @PostMapping
    public ResponseEntity<SpeciesResponseDto> create (@Valid @RequestBody SpeciesReceiveDto speciesReceiveDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(speciesReceiveDto));
    }


}
