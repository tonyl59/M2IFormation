package org.example.exo1.service;

import org.example.exo1.entity.Todo;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("todolist")
@Profile("EN")
public class TodoServiceEN implements TodoService{
    List<Todo> todolist = new ArrayList<>();

    public TodoServiceEN() {
        Todo todo1 = new Todo(1,"todonameA", "actionA", false);
        Todo todo2 = new Todo(2,"todonameB", "actionB", true);
        Todo todo3 = new Todo(3,"todonameC", "actionC", false);
        todolist.add(todo1);
        todolist.add(todo2);
        todolist.add(todo3);
    }

    public List<Todo> getTodolist() {
        return todolist;
    }

    public void setTodolist(List<Todo> todolist) {
        this.todolist = todolist;
    }


    @Override
    public Todo display_one(int id) {
        for (Todo todo: todolist){
            if(todo.getId() == id){
                return todo;
            }
        }
        return null;
    }
}
