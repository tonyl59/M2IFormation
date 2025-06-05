package org.example;

import java.util.Scanner;

public class Exercice82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre");
        int nombre = scanner.nextInt();
        for (int i = 1; i <= (nombre+1)/2; i++) { // alternative je peux ecrire i <= nombre/2+1, c'est plus propre
            int somme = 0;
            String message_somme = "";
            while (somme < nombre) {
                for (int j = i; j <= (nombre+1)/2; j++) {
                    somme += j;
                    if (message_somme.isEmpty()) {
                        message_somme += Integer.toString(j);
                    } else {
                        message_somme += " + " + Integer.toString(j);
                        if (somme == nombre) {
                            System.out.println(message_somme + " = " + somme);
                            break;
                        }
                    }
                }
            }
        }
    }
}


