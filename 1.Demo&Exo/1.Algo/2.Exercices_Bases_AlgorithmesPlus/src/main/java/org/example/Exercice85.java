package org.example;

import java.util.Random;
import java.util.Scanner;

public class Exercice85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Random rand = new Random();
        double random = rand.nextInt(101-1)+1;
        int tentative = 0;
        int nombre = 0;
        while (nombre != random){
            System.out.println("Saisir un nombre");
            nombre = scanner.nextInt();
            tentative ++;
            if (nombre > random){
                System.out.println("Le nombre est plus petit");
            }else if(nombre < random){
                System.out.println("Le nombre est plus grand");
            }
        }
        System.out.println("Vous avez gagné en "+ tentative + " tentative(s), le nombre est "+(random*100)/100.0d);
    }
}
