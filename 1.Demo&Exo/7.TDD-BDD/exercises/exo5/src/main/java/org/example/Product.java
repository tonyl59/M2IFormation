package org.example;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Product {
    private int sellin;
    private int quality;
    private String name;
    private String type;

    @Override
    public String toString() {
        return "Product{" +
                "sellin=" + sellin +
                ", quality=" + quality +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
