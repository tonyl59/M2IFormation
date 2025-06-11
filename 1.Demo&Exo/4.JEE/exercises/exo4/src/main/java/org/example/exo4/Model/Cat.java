package org.example.exo4.Model;

public class Cat {
    private String name;
    private String breed;
    private String favmeal;
    private String bdate;

    public Cat(String name, String breed, String favmeal, String bdate) {
        this.name = name;
        this.breed = breed;
        this.favmeal = favmeal;
        this.bdate = bdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getFavmeal() {
        return favmeal;
    }

    public void setFavmeal(String favmeal) {
        this.favmeal = favmeal;
    }
}

