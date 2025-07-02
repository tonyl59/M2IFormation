package org.example.order.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    int id;
    String name;
    double price;

}
