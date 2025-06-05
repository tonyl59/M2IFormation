package org.example;

import java.util.Scanner;

public class Exercice71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un caractère");
        char l = scanner.next().charAt(0);
        if (l == 'a' || l == 'e' || l =='u'|| l =='i' || l =='o'){
            System.out.println("Le caractère saisi est une voyelle");
        }else if(Character.isLetter(l)){
            System.out.println("Le caractère saisi est une consonne");
        }else {
            System.out.println("Le caractère saisi n'est pas une lettre donc ne peut être ni une voyelle ou une consonne");
        } // j'ai rajouté la dernière phrase dans le cas où on n'utilise pas une lettre même si c'était précisé pas dans la consigne
    }
}
