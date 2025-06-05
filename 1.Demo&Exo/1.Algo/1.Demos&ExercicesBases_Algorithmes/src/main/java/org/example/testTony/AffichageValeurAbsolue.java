package org.example.testTony;

import java.util.Scanner;

public class AffichageValeurAbsolue {
    public static void main(String[] args) {

        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer un nombre entier"); // Info pour l'utilisateur
        x = scanner.nextInt();
        ;

        if (x < 0) {
            System.out.println("La valeur absolue de " + x + " est: " + -x);
        } else
            System.out.println("La valeur absolue de " + x + " est: " + x);


        /*switch(x){
            case x<0 -> System.out.println("La valeur absolue de "+x+"est: "+-x);
            default -> System.out.println("La valeur absolue de "+x+"est: "+x);
        }*/                                          // A savoir que le switch case ne supporte pas les greater/inferior ni les bools... donc ici la syntaxe est fausse, donc preferable de revenir au if else.


    }
}
