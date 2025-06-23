package org.example.exo2.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.exo2.dto.DirectorResponseDto;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="director")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

public class Director {

    @Id
    @GeneratedValue
    private Long id;
    private String lastname;
    private String firstname;
    private LocalDate birthday;
    private String nationality;

    @OneToMany(mappedBy = "director")
    private List<Movie> movies;

    public DirectorResponseDto entityToDto(){
        return DirectorResponseDto.builder()
                .id(getId())
                .lastname(getLastname())
                .firstname(getFirstname())
                .birthday(getBirthday())
                .nationality(getNationality())
                .build();
    }

}
