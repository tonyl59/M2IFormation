package org.example.exo4.controller;

import jakarta.validation.Valid;
import org.example.exo4.dto.TravelObservationResponseDto;
import org.example.exo4.dto.TravellogReceiveDto;
import org.example.exo4.dto.TravellogResponseDto;
import org.example.exo4.service.TravellogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/travel-logs")
public class TravellogController {

    private TravellogService service;

    public TravellogController(TravellogService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TravellogResponseDto> create (@Valid @RequestBody TravellogReceiveDto travellogReceiveDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(travellogReceiveDto));
    }

    @GetMapping
    public ResponseEntity<List<TravellogResponseDto>> getAll(){
        return ResponseEntity.ok(service.get());
    }

    @GetMapping("stats/{idObservation}")
    public ResponseEntity<TravelObservationResponseDto> get_by_observation(@PathVariable long idObservation){
        return ResponseEntity.ok(service.get_by_observations(idObservation));

    }




}
