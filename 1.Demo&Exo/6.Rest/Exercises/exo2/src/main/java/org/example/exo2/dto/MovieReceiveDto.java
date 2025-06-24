package org.example.exo2.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo2.entity.Director;
import org.example.exo2.entity.Movie;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieReceiveDto {

    private String name;

    @Pattern(regexp = "[0-9]{4}[-|\\/]{1}[0-9]{2}[-|\\/]{1}[0-9]{2}" , message = "Date should be as yyyy-MM-dd format!")
    private String releasedateStr;

    private String description;

    private int duration; // Minute
    private String genre;

    @NotEmpty(message = "Please input a valid director")
    private Director director;



    public Movie dtoToEntity() {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        return Movie.builder()
                .name(getName())
                .releasedate(LocalDate.parse(getReleasedateStr(), dateTimeFormatter))
                .description(getDescription())
                .duration(getDuration())
                .genre(getGenre())
                .director(getDirector())
                .build();
    }
}
