package org.example;

import java.util.Scanner;

public class Exercice52 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir a");
        int a = scanner.nextInt();
        System.out.println("Saisir b");
        int b = scanner.nextInt();

        int a_old = a;
        a = b;
        b = a_old;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
}
