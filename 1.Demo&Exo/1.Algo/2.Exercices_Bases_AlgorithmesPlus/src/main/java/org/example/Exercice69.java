package org.example;

import java.util.Scanner;

public class Exercice69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre");
        int nombre = scanner.nextInt();
        if ((nombre%2)==0){
            System.out.println("Le nombre saisi est pair");
        }else{
            System.out.println("Le nombre saisi est impair");
        }


    }
}
