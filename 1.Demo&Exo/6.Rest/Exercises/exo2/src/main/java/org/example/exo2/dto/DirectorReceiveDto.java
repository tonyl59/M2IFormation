package org.example.exo2.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo2.entity.Director;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DirectorReceiveDto {
    private String lastname;
    private String firstname;

    @Pattern(regexp = "[0-9]{4}[-|\\/]{1}[0-9]{2}[-|\\/]{1}[0-9]{2}" , message = "Date should be as yyyy-MM-dd format!")
    private String birthdayStr;

    private String nationality;


    public Director dtoToEntity() {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        return Director.builder()
                .lastname(getLastname())
                .firstname(getFirstname())
                .birthday(LocalDate.parse(getBirthdayStr(), dateTimeFormatter))
                .nationality(getNationality())
                .build();
    }
}
