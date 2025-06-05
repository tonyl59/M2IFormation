package org.example.demos;

import java.util.Arrays;

public class Tableaux {
    public static void main(String[] args) {
        // declaration d'un tableau
        //int[] ages;

        // Allocation de la mémoire pour 5 éléments
        //ages = new int[5]; // ici on a crée un tableau de 5 elements
        int[] ages = new int[5];
        ages[0] = 10;
        ages[1] = 15;
        ages[2] = 8;
        ages[3] = 9;
        ages[4] = 12;
        //System.out.println(ages); // on a un sorte de charabia incompréhensif
        System.out.println(Arrays.toString(ages)); // on voit ce que contient le tableau

        System.out.println("Element à l'index 0 : "+ages[0]);
        System.out.println("Element à l'index 1 : "+ages[1]);
        System.out.println("Element à l'index 2 : "+ages[2]);
        System.out.println("Element à l'index 3 : "+ages[3]);
        System.out.println("Element à l'index 4 : "+ages[4]);

        // Taille de mon tableau
        System.out.println("Taille de mon tableau : "+ages.length); // m'affiche la taille du tableau

        // parcourir un tableau avec une boucle for
        for (int i = 0; i< ages.length;i++){
            System.out.println("Element à l'index "+i+" : "+ages[i]);

        }
        String[] prenoms = {"toto","tata","titi"};


    }
}
