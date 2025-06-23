package org.example.exo2.controller;

import org.example.exo2.dto.DirectorReceiveDto;
import org.example.exo2.entity.Director;
import org.example.exo2.service.DirectorService;
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
    public List<Director> getAll(){
        return service.get();
    }

    @GetMapping("/{id}")
    public Director get (@PathVariable long id){
        return service.get(id);
    }

    @PostMapping
    public Director create (@RequestBody DirectorReceiveDto directorReceiveDto){
        return service.create(directorReceiveDto);
    }

    @PutMapping("/{id}") //put met une nouvelle donnée
    public Director update (@PathVariable long id, @RequestBody DirectorReceiveDto directorReceiveDto){
        return service.update(id, directorReceiveDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable long id){
        service.delete(id);
        return ResponseEntity.ok(String.format("todo at id : %s is deleted", id));

    }

}
