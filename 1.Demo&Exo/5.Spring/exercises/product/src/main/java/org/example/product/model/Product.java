package org.example.product.model;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private int count = 0;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
