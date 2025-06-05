package org.example.demos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Boucles {
    public static void main(String[] args) {

        // Tant que
        // While
        int compteur = 1;
        while (compteur < 11) {
            System.out.println("Compteur est égal à : " + compteur);
            compteur++;
        }

        /*
        // Création d'une boucle infinie
        Scanner scanner = new Scanner(System.in);
        int nbr = 0;

        while (true){
            System.out.println("Saisir le résultat de 2+1 pour sortir de la boucle:");
            nbr = scanner.nextInt();
            if (nbr==3){
                System.out.println("Bravo");
                break;
            }
        } */

        int som, i;
        i = 0;
        som = 0;
        while (som<=100){
            som = som + i;
            i = i + 1;
            System.out.println("valeur de i " +i);
            System.out.println("Somme est à : "+som);
        }
        System.out.println("La valeur cherchée est : "+i);

        // Je veux manger des parts de pizza
        int partDePizza = 10;
        int cpt = 0;
        while (partDePizza > 0){
            //partDePizza = partDePizza - 1;
            //partDePizza -= 1;
            cpt++;
            partDePizza--;
            System.out.println("Manger une part de pizza "+cpt);
        }
        System.out.println("Plus de pizza disponibles");

        int compteur2 = 0;
        int age = 5;
        while (age < 18){
            age++;
            compteur2++;
            System.out.println("Une année passe j'ai maintenant "+age+" ans");
        }
        System.out.println("je suis majeur apres "+compteur2+ " années");

        //Boucle for
        for (int cpt2 = 1; cpt2 < 10 ; cpt2++){
            System.out.println("compteur : "+cpt2);
        }

        // DO WHILE
        int nombre = 10; // si je met -10 à la place, j'aurais fait une fois.
        do{
            System.out.println(nombre);
            nombre--;
        }while (nombre>0); // ca va decompter 10, 9, 8 ... 1.
            // la différence principale entre do while et while, c'est que le do while je suis toujours garanti de faire au moins une fois l'instruction
            // Avec le do while on voit ce qu il y a à l'interieur, le while je passe tout de suite

        // break et continue
        for (int cpt3 = 0; cpt3 <11; cpt3++){
            if (cpt3 == 3){
                continue;
            }
            if(cpt3 == 8){
                break;
            }
            System.out.println(cpt3);
        }

    }
}
