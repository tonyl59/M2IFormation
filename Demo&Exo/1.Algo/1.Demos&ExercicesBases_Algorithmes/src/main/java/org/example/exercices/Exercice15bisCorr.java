package org.example.exercices;

public class Exercice15bisCorr {
    public static void main(String[] args) {
        int nombreAnnees = 0;
        while (96809*Math.pow(1+0.0089, nombreAnnees) < 120000){
            nombreAnnees = nombreAnnees + 1;
            System.out.println(96809*Math.pow(1+0.0089, nombreAnnees));
        }
        System.out.println("Au bout de "+nombreAnnees+" ans à partir de 2015, Tourcoing aura dépassé les 120000 habitants.");
    }

}
