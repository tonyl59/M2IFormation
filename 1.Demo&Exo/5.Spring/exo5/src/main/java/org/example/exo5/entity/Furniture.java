package org.example.exo5.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="furniture")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Furniture {

    @Id
    @GeneratedValue
    private Long idFurniture;

    private String name;
    private String description;
    private double price;
    private int stock;

    @OneToOne(mappedBy = "furniturecart")
    private CartItem cartitem;




}
