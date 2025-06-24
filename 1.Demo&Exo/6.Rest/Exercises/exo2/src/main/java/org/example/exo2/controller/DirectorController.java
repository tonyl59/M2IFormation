package org.example.exo2.controller;

import jakarta.validation.Valid;
import org.example.exo2.dto.DirectorReceiveDto;
import org.example.exo2.dto.DirectorResponseDto;
import org.example.exo2.entity.Director;
import org.example.exo2.service.DirectorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/director")
public class DirectorController {

    private DirectorService service;

    public DirectorController(DirectorService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<DirectorResponseDto>> getAll(){
        return ResponseEntity.ok(service.get());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DirectorResponseDto> get (@PathVariable long id){
        return ResponseEntity.ok(service.get(id));
    }

    @PostMapping
    public ResponseEntity<DirectorResponseDto> create (@Valid @RequestBody DirectorReceiveDto directorReceiveDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(directorReceiveDto));
    }

    @PutMapping("/{id}") //put met une nouvelle donnée
    public ResponseEntity<DirectorResponseDto> update (@PathVariable long id, @RequestBody DirectorReceiveDto directorReceiveDto){
        return ResponseEntity.ok(service.update(id, directorReceiveDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable long id){
        service.delete(id);
        return ResponseEntity.ok(String.format("Director at id : %s is deleted", id));

    }

}
