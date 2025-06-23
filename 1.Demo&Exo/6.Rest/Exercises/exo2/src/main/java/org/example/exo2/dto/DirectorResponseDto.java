package org.example.exo2.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DirectorResponseDto {
    private Long id;
    private String lastname;
    private String firstname;
    private LocalDate birthday;
    private String nationality;
    // ici le response est pas necessaire mais on peut l'utiliser quand même pour prendre l'habitude
}
