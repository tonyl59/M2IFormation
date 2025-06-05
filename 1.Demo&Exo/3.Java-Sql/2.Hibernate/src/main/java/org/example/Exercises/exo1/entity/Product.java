package org.example.Exercises.exo1.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    private String name;
    private String brand;
    private String reference;
    private LocalDate purchase_date;
    private double price;
    private int stock;

    @OneToMany(mappedBy = "product")
    private List<Comment> comments;


    @OneToMany(mappedBy = "product")
    private List<Image> images;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + productId +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", reference='" + reference + '\'' +
                ", purchase_date=" + purchase_date +
                ", price=" + price +
                ", stock=" + stock +
                ", comments=" + comments +
                ", images=" + images +
                '}';
    }

}

