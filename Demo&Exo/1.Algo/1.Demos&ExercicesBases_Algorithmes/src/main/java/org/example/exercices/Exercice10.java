package org.example.exercices;

import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {

        int nombre=0;
        Scanner scanner = new Scanner(System.in);

        while (nombre < 1 || nombre > 3) {
            System.out.println("Veuillez saisir un nombre compris entre 1 à 3");
            nombre = scanner.nextInt();

        }
        System.out.println("Nous pouvons désormais procéder");
    }

}
