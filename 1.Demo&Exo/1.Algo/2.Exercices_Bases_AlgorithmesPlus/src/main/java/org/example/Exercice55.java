package org.example;

import java.util.Scanner;

public class Exercice55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un rayon");
        int rayon = scanner.nextInt();
        System.out.println("Saisir une hauteur");
        int hauteur = scanner.nextInt();
        double volume_cone = (Math.PI* Math.pow(rayon,2) * hauteur)/3;
        double volume_cone_deci =  Math.round(volume_cone*100)/100.0d;
        System.out.println("Le volume du cône est de "+volume_cone_deci+" cm3");
    }
}
