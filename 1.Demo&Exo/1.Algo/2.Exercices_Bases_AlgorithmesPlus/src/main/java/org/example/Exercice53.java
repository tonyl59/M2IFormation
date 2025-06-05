package org.example;

import java.util.Scanner;

public class Exercice53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir a");
        int a = scanner.nextInt();
        System.out.println("Saisir b");
        int b = scanner.nextInt();
        int carre_ab = (int)Math.pow(a,2) + (int)Math.pow(b,2);

        System.out.println("la somme des carrés de a et b est "+ carre_ab);


    }
}
