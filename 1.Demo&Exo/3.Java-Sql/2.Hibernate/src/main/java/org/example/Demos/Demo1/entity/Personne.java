package org.example.Demos.Demo1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder

@Inheritance(strategy = InheritanceType.JOINED) // Remplacer le joined en "SINGLE_TABLE" pour avoir toute la vue... ca influe rien.
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Auto permet de me faire une table hibernate_sequence qui va dire que sera le prochain id
    protected int id;

    protected String name;
    protected int age;
}
