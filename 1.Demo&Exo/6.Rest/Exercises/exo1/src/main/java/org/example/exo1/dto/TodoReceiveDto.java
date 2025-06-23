package org.example.exo1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo1.entity.Todo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoReceiveDto {
    private String title;
    private String description;
    private String dateStr;
    private boolean isDone;

    public Todo dtoToEntity() {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return Todo.builder()
                .title(getTitle())
                .description(getDescription())
                .date(LocalDate.parse(getDateStr(), dateTimeFormatter))
                .isDone(isDone())
                .build();
    }
}
