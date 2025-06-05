package org.example.exercices;

import java.util.Scanner;

public class Exercice9AND {
    public static void main(String[] args) {
        double taille, poids;
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer la taille de la personne");
        taille = scanner.nextDouble();
        System.out.println("entrer son poids");
        poids = scanner.nextDouble();

        int vetement;
        if (poids < 43 || poids > 77 || taille < 145 || taille > 183) {
            vetement = 0; // on est en dehors du tableau

        } else if (poids < 48 &&taille>171 || poids<54 && taille>182 || poids>65 &&taille<160 || poids>71 && taille<163){
            vetement = 0; // Les cases blanches du tableau
            // si je met pas le "else if" ligne 18, les cases blanches vont être catégorisées en un type de vetement.

        } else if (poids < 66 && taille < 172) { // Check vetement 1 + overlap vetement 2
            if (poids>47 &&taille>168 || poids>53 && taille>165||poids >59 && taille >162){
                System.out.println("test1");
                vetement=2;
            }else{
                vetement=1;
            }
        } else if (poids <72 && taille < 179) { // check vetement 2 + overlap vetement 3
            // j'ai pas besoin de check les 6 cases du vetement 1 qui overlap avec les vetements 2 car je serais déja sorti du "if" ligne19 si j'étais vetement 1
            if (poids>53 && taille>177 || poids>59 && taille>174 || poids>65 && taille>171){
                vetement =3;
            }else{
                System.out.println("test2");
                vetement =2;
            }
        }else{ // Ici j'ai pas besoin de if, parce que tout ce qui n'est pas hors catégorie ou vetement 1 ou vetement 2 sera toujours vetement 3
            vetement=3;
        }
        if (vetement == 0){
            System.out.println("La taille, le poids ou la combinaison des deux n'est pas compatible à un taille de vêtement");
        }else {
            System.out.println("La taille de vêtement pour cette personne est " + vetement);
        }
    }
}




