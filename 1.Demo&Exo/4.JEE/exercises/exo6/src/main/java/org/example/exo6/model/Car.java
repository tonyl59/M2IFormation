package org.example.exo6.model;

import java.time.LocalDate;

public class Car {
    private int id; //on peut aussi mettre en Long
    private String model;
    private int year;
    private String color;

    public Car() {
    }

    public Car(int id, String model, int year, String color) {
        this.id = id;
        this.model = model;
        this.year = year;
        this.color = color;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


