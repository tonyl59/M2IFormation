package org.example.exercices;

import java.util.Scanner;

// Ici le prof a plutot utiliser le "string message" pour faire ça plutot qu'une boucle imbriquée.

public class Exercice17biscorr {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner un chiffre");
        n = scanner.nextInt();
        String message = "";
        for (int i = 1; i <= n; i++) {
            message = message + i + " ";
            System.out.println(message);
            }
        }
    }
