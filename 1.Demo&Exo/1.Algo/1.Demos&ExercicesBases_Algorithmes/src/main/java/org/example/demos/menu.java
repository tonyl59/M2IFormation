package org.example.demos;

import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        // exemple de menu console
        Scanner scanner = new Scanner(System.in);
        int choixMenu;

        do{
            System.out.println("### Menu Console ###");
            System.out.println("1- Dire Bonjour");
            System.out.println("2- Dire Aurevoir");
            System.out.println("3- Dire Bonne nuit");
            System.out.println("0- Quitter");
            System.out.println("Votre choix :");
            choixMenu = scanner.nextInt();
            if (choixMenu == 1){
                System.out.println("Bonjour !!!");
            } else if (choixMenu == 2) {
                System.out.println("Au revoir !!!");
            } else if (choixMenu == 3) {
                System.out.println("Bonne nuit !!!");
            } else if (choixMenu == 0) {
                System.out.println("Vous avez decider de quitter le programme");
            }else {
                System.out.println("Choix invalide !!!");
            }

        }while (choixMenu != 0);
    }
}
