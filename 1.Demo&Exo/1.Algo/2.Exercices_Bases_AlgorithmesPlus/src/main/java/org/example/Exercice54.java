package org.example;

import java.util.Scanner;

public class Exercice54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un age");
        int nbr = scanner.nextInt();
        boolean is_major;
        is_major = nbr > 17;
        System.out.println(is_major);



    }
}
