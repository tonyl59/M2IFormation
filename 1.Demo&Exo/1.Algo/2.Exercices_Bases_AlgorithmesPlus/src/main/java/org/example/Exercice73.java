package org.example;

import java.util.Scanner;

public class Exercice73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un numéro de mois");
        int mois = scanner.nextInt();
        if (mois <1 || mois>12){
            System.out.println("Ce chiffre n'est pas associé à un mois. Veuillez saisir un chiffre entre 1 à 12");
        }else if(mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12){
            System.out.println("31 jours");
        }else if(mois== 2){
            System.out.println("28 ou 29 jours");
        }else{
            System.out.println("30 jours");
        }

        /* Correction => Autre méthode:
        switch (mois){
        case 2 -> System.out.println("28 ou 29 jours");
        case 4,6,9,11 -> System.out.println("30 jours");
        case 1,3,5,7,8,10,12 -> System.out.println("31 jours");
        case default -> System.out.println("Saisie invalide!!!"); */
    }
}
