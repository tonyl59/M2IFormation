package org.example.exo1.controller;

import org.example.exo1.dto.TodoReceiveDto;
import org.example.exo1.entity.Todo;
import org.example.exo1.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/todo")
public class TodoController {

    private TodoService service;

    public TodoController(TodoService service){
        this.service = service;
    }

    @GetMapping
    public List<Todo> getAll(){
        return service.get();
    }

    @GetMapping("/{id}")
    public Todo get (@PathVariable long id){
        return service.get(id);
    }

    @PostMapping("/{id}")
    public Todo create (@RequestBody TodoReceiveDto todoReceiveDto){
        return service.create(todoReceiveDto);
    }

    @PutMapping("/{id}") //put met une nouvelle donnée
    public Todo update (@PathVariable long id, @RequestBody TodoReceiveDto todoReceiveDto){
        return service.update(id, todoReceiveDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable long id){
        service.delete(id);
        return ResponseEntity.ok(String.format("todo at id : %s is deleted", id));

    }

    @GetMapping
    public List<Todo> getDones(){
        return service.get_done();
    }

    @GetMapping
    public List<Todo> getNotDones (){
        return service.get_notdone();
    }


}
