package org.example.exo1.controller;

import org.example.exo1.entity.Todo;
import org.example.exo1.service.TodoService;
import org.example.exo1.service.TodoServiceEN;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {

    private TodoServiceEN todoService;

    public TodoController(TodoServiceEN todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/home/todos")
    public String allTodos(Model model){
        List<Todo> todos = todoService.getTodolist();
        model.addAttribute("todos",todos);
        return "todo/details";
    }

    @RequestMapping("/home/todo")
    public String aTodo(Model model){
        int id = 2;
        Todo todo = todoService.display_one(id);
        model.addAttribute("todo",todo);
        return "todo/detail";
    }

}
