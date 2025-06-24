package org.example.exo2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo2.entity.Director;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MovieResponseDto {

    private Long id;
    private String name;
    private LocalDate releasedate;
    private String description;
    private int duration; // Minute
    private String genre;
    private long directorId;
}
