package org.example.studentform.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="student")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "first_name")
    private String firstname;
    private String lastname;
    private int age;
    private String mail;



}
