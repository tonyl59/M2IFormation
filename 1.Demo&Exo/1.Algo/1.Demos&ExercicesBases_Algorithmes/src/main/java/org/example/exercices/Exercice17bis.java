package org.example.exercices;

import java.util.Scanner;

//Concevoir un algorithme qui imprime, pour n saisi par l'utilisateur :
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5...
//1 2 3 4 5 6 ... n

public class Exercice17bis {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner un chiffre");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
        }
    }
}
