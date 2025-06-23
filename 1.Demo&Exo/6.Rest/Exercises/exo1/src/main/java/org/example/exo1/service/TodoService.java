package org.example.exo1.service;

import org.example.exo1.dto.TodoReceiveDto;
import org.example.exo1.dto.TodoResponseDto;
import org.example.exo1.entity.Todo;
import org.example.exo1.exception.NotFoundException;
import org.example.exo1.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {


    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public Todo create (TodoReceiveDto todoReceiveDto){
        return todoRepository.save(todoReceiveDto.dtoToEntity());
    }

    public Todo get(long id){
        return todoRepository.findById(id).orElseThrow(NotFoundException::new);
    }

    public List<Todo> get(){
        return todoRepository.findAll().stream().toList();
    }

    public Todo update(long id, TodoReceiveDto todoReceiveDto){
        Todo todoFound = todoRepository.findById(id).orElseThrow(NotFoundException::new);
        Todo todoGet = todoReceiveDto.dtoToEntity();
        todoFound.setTitle(todoGet.getTitle());
        todoFound.setDescription(todoGet.getDescription());
        todoFound.setDate(todoGet.getDate());
        todoFound.setDone(todoGet.isDone());
        return todoRepository.save(todoFound);
    }

    public void delete(long id){
        todoRepository.deleteById(id);
    }

    public List<Todo> get_done(){
        List<Todo> todos_done = new ArrayList<>();
        for (Todo t : todoRepository.findAll()){
            if (t.isDone()){
                todos_done.add(t);
            }
        }
        return todos_done;
    }

    public List<Todo> get_notdone(){
        List<Todo> todos_notdone = new ArrayList<>();
        for (Todo t : todoRepository.findAll()){
            if (!t.isDone()){
                todos_notdone.add(t);
            }
        }
        return todos_notdone;
    }



}
