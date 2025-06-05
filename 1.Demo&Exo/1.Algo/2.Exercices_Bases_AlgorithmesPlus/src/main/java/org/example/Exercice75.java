package org.example;

import java.util.Scanner;

public class Exercice75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un caractère");
        char c = scanner.next().charAt(0);
        if (Character.isLetter(c)) {
            System.out.println(c + " est une lettre de l'alphabet");
        }else if (Character.isDigit(c)){
            System.out.println(c + " est un nombre");
        }else{
            System.out.println(c + " est un caractère spécial");
        }

    }
}
