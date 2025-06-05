package org.example.exercices;

import java.util.Scanner;
//➡ Ecrire un programme qui demande à l’utlisateur de saisir 20 notes d’élèves et qui propose le menu
//suivant :
//- Afficher la plus peKte note
//- Afficher la plus grande note
//- Afficher la moyenne des notes
public class Exercice16 {
    public static void main(String[] args) {
        double lowest_number = 0,highest_number = 0, new_number, somme = 0, moy;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i<=20;i++){
            System.out.println("entrez le nombre n°"+i);
            new_number =scanner.nextInt();
            somme = somme + new_number;
            //System.out.println(somme);
            if (i==1){
                lowest_number = new_number;
                highest_number = new_number;
            }else
                if (new_number < lowest_number){
                    lowest_number = new_number;
                }
                if (new_number > highest_number){
                    highest_number = new_number;

            }

        }
        moy = somme/20;
        System.out.println("le nombre le plus bas est "+lowest_number);
        System.out.println("le nombre le plus haut est "+highest_number);
        System.out.println("La moyenne de notes de la classe est "+moy);


    }
}
