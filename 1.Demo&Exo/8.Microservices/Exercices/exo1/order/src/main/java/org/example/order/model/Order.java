package org.example.order.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Order {
    private int id;
    private String description;
    private Customer customer;
    private Product product;


}
