package org.example.exo3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.example.exo3.dto.ProductResponseDto;

@Entity
@Table(name="product")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

public class Product {
    @Id
    @GeneratedValue
    long id;
    String name;
    double price;

    public ProductResponseDto entityToDto(){
        return ProductResponseDto.builder()
                .id(getId())
                .name(getName())
                .price(getPrice())

                .build();
    }


}
