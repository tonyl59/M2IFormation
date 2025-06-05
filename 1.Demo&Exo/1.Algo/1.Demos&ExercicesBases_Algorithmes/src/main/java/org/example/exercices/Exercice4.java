package org.example.exercices;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("entrer un nombre entier"); // Info pour l'utilisateur
        number = scanner.nextInt();
        int numberdiv3 = number%3;
        switch (numberdiv3){
            case 0-> System.out.println("Le nombre est bien divisible par 3");
            default-> System.out.println("Le nombre n'est pas divisible par 3");}
            // en switch eviter d'utiliser flèche et ":" en même temps. La fleche va considérer un break, le ":" non
    }

}

