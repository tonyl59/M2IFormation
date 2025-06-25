package org.example.exo3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.exo3.entity.Product;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class ProductReceiveDto {
    String name;
    double price;

    public Product dtoToEntity() {

        return Product.builder()
                .name(getName())
                .price(getPrice())
                .build();
    }
}
