package org.example.exo2.entity;

import jakarta.persistence.*;
import lombok.*;
import org.example.exo2.dto.MovieResponseDto;

import java.time.LocalDate;

@Entity
@Table(name="movie")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

public class Movie {

    @Id
    @GeneratedValue
    private Long movieId;
    private String name;
    private LocalDate releasedate;
    private String description;
    private int duration; // Minute
    private String genre;

    @ManyToOne(cascade ={CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "directorId")
    private Director director;


    public MovieResponseDto entityToDto(){
        return MovieResponseDto.builder()
                .id(getMovieId())
                .name(getName())
                .releasedate(getReleasedate())
                .description(getDescription())
                .duration(getDuration())
                .genre(getGenre())
                .directorId(getDirector().getDirectorId())
                .build();
    }

}
