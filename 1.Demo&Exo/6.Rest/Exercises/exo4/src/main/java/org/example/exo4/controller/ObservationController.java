package org.example.exo4.controller;

import jakarta.validation.Valid;
import org.example.exo4.dto.ObservationReceiveDto;
import org.example.exo4.dto.ObservationResponseDto;
import org.example.exo4.service.ObservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/observations")
public class ObservationController {

    private ObservationService service;

    public ObservationController(ObservationService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ObservationResponseDto>> getAll(){
        return ResponseEntity.ok(service.get());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ObservationResponseDto> get (@PathVariable long id){
        return ResponseEntity.ok(service.get(id));
    }

    @PostMapping
    public ResponseEntity<ObservationResponseDto> create (@Valid @RequestBody ObservationReceiveDto observationReceiveDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(observationReceiveDto));
    }

    @GetMapping("/by-location/{location}")
    public ResponseEntity<List<ObservationResponseDto>> get_by_location(@PathVariable String location){
        return ResponseEntity.ok(service.get_by_location(location));
    }

    @GetMapping("/by-species/{speciesId}")
    public ResponseEntity<List<ObservationResponseDto>> get_by_species(@PathVariable long speciesId){
        return ResponseEntity.ok(service.get_by_species(speciesId));
    }




}
