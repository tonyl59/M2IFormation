package org.example.exo5.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="cart")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {

    @Id
    @GeneratedValue
    private Long idCart;
    private int quantity;

    @OneToOne // colonne de jointure
    @JoinColumn(name = "idFurniture")
    private Furniture furniturecart;

}
