package org.example.exercices;

import java.util.Scanner;

public class AffichageNomComplet {
    public static void main(String[] args) {
        String nom, prenom, nom_complet;
        Scanner scanner = new Scanner(System.in);


        System.out.println("entrez votre nom");
        nom = scanner.nextLine();
        System.out.println(nom);

        System.out.println("entrez votre prénom");
        prenom = scanner.nextLine();
        System.out.println(prenom);

        nom_complet = nom + " " + prenom;
        System.out.println("Votre nom complet est " +nom_complet);
    }
}
