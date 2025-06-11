package org.example.exo5.model;

import java.time.LocalDate;

public class Dog {
    static private int count = 0;
    private int id;
    private String name;
    private String breed;
    private LocalDate bdate;

    public Dog(String breed, String name, LocalDate bdate) {
        count +=1;
        this.id = count;
        this.breed = breed;
        this.name = name;
        this.bdate = bdate;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Dog.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBdate() {
        return bdate;
    }

    public void setBdate(LocalDate bdate) {
        this.bdate = bdate;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

