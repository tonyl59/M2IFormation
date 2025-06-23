package org.example.exo1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TodoResponseDto {

    private Long id;

    private String title;
    private String description;
    private LocalDate date;
    private boolean isDone;
    // ici le response est pas necessaire mais on peut l'utiliser quand même pour prendre l'habitude
}
