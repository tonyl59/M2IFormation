package org.example.exo6;

import java.time.LocalDate;

public class Car {
    private int id;
    private String model;
    private LocalDate birthdate;
    private String color;
    private static int count = 0;

    public Car(){}

    public Car(String model, LocalDate birthdate, String color) {
        count+=1;
        this.id = count;
        this.model = model;
        this.birthdate = birthdate;
        this.color = color;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
