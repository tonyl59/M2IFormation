package org.example.exercices;

import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
        double taille, poids;
        Scanner scanner = new Scanner(System.in);

        System.out.println("entrer la taille de la personne");
        taille =scanner.nextDouble();

        System.out.println("entrer son poids");
        poids =scanner.nextDouble();
        int vetement;
        if (poids < 43 || poids >77 || taille < 145 || taille > 183){
            vetement = 0;


        }else if(poids<48){
            if (taille <172){
                vetement = 1;

            }else{
                vetement = 0;

            }
        }else if(poids<54){
            if (taille <169){
                vetement = 1;

            }else if(taille<183){
                vetement = 2;

            }else{
                vetement = 0;
            }
        }else if(poids<60){
            if (taille <166){
                vetement = 1;

            }else if (taille <178){
                vetement = 2;
            }else{
                vetement = 3;
            }
        }else if(poids<66){
            if (taille <163){
                vetement = 1;

            }else if(taille <175){
                vetement = 2;
            }else{
                vetement = 3;
            }
        }else if(poids<72){
            if (taille <160){
                vetement = 0;
            }else if(taille <172){
                vetement = 2;
            }else{
                vetement = 3;
            }
        }else{
            if (taille <163){
                vetement = 0;
            }else{
                vetement = 3;
            }
        }

        if (vetement == 0){
            System.out.println("La taille, le poids ou la combinaison des deux n'est pas compatible à un taille de vêtement");
        }else{
            System.out.println("La taille de vêtement pour cette personne est " + vetement);
        }
    }
}
