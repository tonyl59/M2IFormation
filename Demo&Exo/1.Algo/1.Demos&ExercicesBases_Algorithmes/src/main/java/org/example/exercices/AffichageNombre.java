package org.example.exercices;

import java.util.Scanner;

public class AffichageNombre {
    public static void main(String[] args) {
        int a; // Préparer le terrain avant d'y travailler
        int b;

        Scanner scanner = new Scanner(System.in); // Scanner pour mettre une interaction

        System.out.println("entrer le nombre"); // Info pour l'utilisateur
        a = scanner.nextInt(); // sera la réponse en entier de l'utilisateur, permet d'éviter qu'on tape un type erroné
        System.out.println(a);
        b = 2*a; // on aurait pu retirer le B est affiché directement de le println 2*A pour ce cas
        System.out.println("le double de " + a + " est " + b);


    }
}
