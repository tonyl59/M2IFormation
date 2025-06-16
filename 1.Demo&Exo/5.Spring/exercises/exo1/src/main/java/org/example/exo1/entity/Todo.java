package org.example.exo1.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Todo {
    int id;
    String name;
    String description;
    boolean state;

    public Todo() {}

    public Todo(int id, String name, String description, boolean state) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", state=" + state +
                '}';
    }
}

