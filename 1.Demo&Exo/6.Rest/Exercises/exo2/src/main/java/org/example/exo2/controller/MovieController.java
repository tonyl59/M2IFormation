package org.example.exo2.controller;

import org.example.exo2.dto.MovieReceiveDto;
import org.example.exo2.dto.MovieResponseDto;
import org.example.exo2.entity.Director;
import org.example.exo2.entity.Movie;
import org.example.exo2.service.DirectorService;
import org.example.exo2.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/movie")
public class MovieController {
    //TODO à faire (voir comment l'objet directeur s'associe dans l'objet film)
    private MovieService service;
    private DirectorService directorService;

    public MovieController(MovieService service){
        this.service = service;
        this.directorService = directorService;
    }

    @GetMapping
    public ResponseEntity<List<MovieResponseDto>> getAll(){
        return ResponseEntity.ok(service.get());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MovieResponseDto> get (@PathVariable long id){
        return ResponseEntity.ok(service.get(id));
    }

    @PostMapping("/{directorId}")
    public ResponseEntity<MovieResponseDto> create (@PathVariable long directorId, @RequestBody MovieReceiveDto movieReceiveDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(movieReceiveDto, directorId));
    }

    @PutMapping("/{id}") //put met une nouvelle donnée
    public ResponseEntity<MovieResponseDto> update (@PathVariable long id, @RequestBody MovieReceiveDto movieReceiveDto){
        return ResponseEntity.ok(service.update(id, movieReceiveDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable long id){
        service.delete(id);
        return ResponseEntity.ok(String.format("Movie at id : %s is deleted", id));

    }

    @GetMapping("/director/{directorId}")
    public ResponseEntity<List<MovieResponseDto>> get_by_director (@PathVariable long directorId){
        return ResponseEntity.ok(service.get_by_director(directorId));
    }
}
