package org.example;

import java.util.Scanner;

public class Exercice72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un jour de la semaine");
        int jour = scanner.nextInt();
        if (jour == 1){
            System.out.println("Lundi");
        }else if (jour ==2){
            System.out.println("Mardi");
        }else if (jour ==3){
        System.out.println("Mercredi");
        }else if (jour ==4){
            System.out.println("Jeudi");
        }else if (jour ==5){
            System.out.println("Vendredi");
        }else if (jour ==6){
            System.out.println("Samedi");
        }else if (jour ==7){
            System.out.println("Dimanche");
        }else{
            System.out.println("Ce chiffre n'est pas associé à un jour. Veuillez saisir un chiffre entre 1 à 7");
        } // A partir de 4 else if... c'est mieux de passer en switch case car c'est plus beau... switch case devrait être plus efficace en terme de performance

        /* Correction => Autre méthode:
        switch (jour){
        case 1 -> System.out.println("Lundi");
        case 2 -> System.out.println("Mardi");
        case 3 -> System.out.println("Mercredi");
        case 4 -> System.out.println("Jeudi");
        case 5 -> System.out.println("Vendredi");
        case 6 -> System.out.println("Samedi");
        case 7 -> System.out.println("Dimanche");
        case default -> System.out.println("Saisie invalide!!!");




         */
    }
}

