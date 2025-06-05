package org.example.exercices;

import java.util.Scanner;

public class Exercice20 {
    public static void main(String[] args) {
        // ici je crée deux scanner à travers les deux fonctions... c'est mieux de créer un scanner en main
        // pour les réutiliser sur les deux fonctions en le mettant en paramètre
        // ex : nomfonction(int[] tableau, Scanner paramScan)

        System.out.println("Initialisation du tableau à 15 chiffres");
        int[] table_test = fifteen_marks();
        for (int i=0; i<= table_test.length-1;i++){
            System.out.print(table_test[i]+" ");
        }

        System.out.println("\nInitialisation du tableau à n chiffres");
        int[] table_test2 = n_marks();
        for (int i=0; i<= table_test2.length-1;i++){
            System.out.print(table_test2[i]+" ");
        }


    }
    public static int[] fifteen_marks(){
        // ici public... veut dire que c'est accessible.
        Scanner scanner = new Scanner(System.in);
        int[] table15 = new int[15];

        for (int i=0; i <= table15.length-1 ; i++){
            System.out.println("donner le chiffre n° "+(i+1));
            table15[i]= scanner.nextInt();

        }
        return table15;



    }
    public static int[] n_marks(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("combien de notes voulez vous saisir ?");
        int n;
        n = scanner.nextInt();
        int[] table = new int[n];

        for (int i=0; i <= table.length-1 ; i++){
            System.out.println("donner le chiffre n° "+(i+1));
            table[i]= scanner.nextInt();

        }
        return table;}

    public static void afficheMessage(String message){
        System.out.println("########### "+message+" ############");
        System.out.println(message);
    }
}

// Exercice 20 correction du prof peut être intéressante à voir aussi, vu que la méthode est différente.
