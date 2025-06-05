package org.example;

import java.util.Scanner;

public class Exercice57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir la longueur d'un côté");
        int cote = scanner.nextInt();
        int perimetre = cote*4;
        int aire_care = (int)Math.pow(cote,2);
        System.out.println("Le périmètre du carré est de : "+ perimetre +"cm");
        System.out.println("L'aire du carré est de : "+aire_care+"cm carré");
    }

}
