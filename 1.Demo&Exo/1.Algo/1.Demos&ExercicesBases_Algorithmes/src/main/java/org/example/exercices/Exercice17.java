package org.example.exercices;

import java.util.Scanner;

//➡Ecrire un programme qui demande à l’uKlisateur de saisir des notes d’élèves et qui propose le menu
//suivant :
//- Afficher la plus peKte note
//- Afficher la plus grande note
//- Afficher la moyenne des notes
//On arrête la saisie quand l’utilisateur saisie la valeur zéro

// J'ai mal compris la consigne : je peux saisir autant de notes que je veux jusqu'à que je mette la note de 0.
// Travailler avec une table dessus c'est pas ouf... il faudra écraser le tableau à chaque fois qu'on rajoute une note
public class Exercice17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("combien de notes voulez vous saisir ?");
        int n, lowest_number = 0, highest_number = 0;
        double somme = 0, moyenne;

        n = scanner.nextInt();
        int[] table = new int[n];

        for (int i = 0; i <= table.length - 1; i++) {
            System.out.println("donner le chiffre n° " + (i + 1));
            table[i] = scanner.nextInt();
            somme = somme + table[i];
            if (i == 1) {
                lowest_number = table[i];
                highest_number = table[i];
            } else if (table[i] < lowest_number) {
                lowest_number = table[i];
            }
            if (table[i] > highest_number) {
                highest_number = table[i];
            }
        }
        moyenne = somme / table.length ;


        int choixMenu;
        do {
            System.out.println("Voulez vous:");
            System.out.println("0-quitter le programme");
            System.out.println("1-afficher la plus petite note");
            System.out.println("2-afficher la plus grande note");
            System.out.println("3-afficher la moyenne des notes");
            choixMenu = scanner.nextInt();
            if (choixMenu == 1) {
                System.out.println("La plus petite note est " + lowest_number);
            } else if (choixMenu == 2) {
                System.out.println("La plus grande note est " + highest_number);
            } else if (choixMenu == 3) {
                System.out.println("La moyenne des notes est " + moyenne);
            } else if (choixMenu == 0) {
                System.out.println("Vous avez decidé de quitter le programme");
            } else {
                System.out.println("Choix invalide !!!");
            }
        }while (choixMenu != 0) ;
    }
}


