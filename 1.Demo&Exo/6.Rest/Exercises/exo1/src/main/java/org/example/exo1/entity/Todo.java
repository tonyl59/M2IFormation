package org.example.exo1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.example.exo1.dto.TodoResponseDto;

import java.time.LocalDate;

@Entity
@Table(name="todo")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

public class Todo {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String description;
    private LocalDate date;
    private boolean isDone;

    public TodoResponseDto entityToDto(){
        return TodoResponseDto.builder()
                .id(getId())
                .title(getTitle())
                .date(getDate())
                .isDone(isDone())
                .build();
    }

}
