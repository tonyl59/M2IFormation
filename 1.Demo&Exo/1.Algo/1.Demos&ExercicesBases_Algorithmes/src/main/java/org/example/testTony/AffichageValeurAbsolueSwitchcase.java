package org.example.testTony;

import java.util.Scanner;

public class AffichageValeurAbsolueSwitchcase {
    public static void main(String[] args) {

        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer un nombre entier"); // Info pour l'utilisateur
        x = scanner.nextInt();

        /*
        // A savoir que le switch case ne supporte pas les greater/inferior ni les bools... donc ici la syntaxe est fausse, donc preferable de revenir au if else. Code pas fonctionnel.
        switch(x){
            case <0 -> System.out.println("La valeur absolue de "+x+"est: "+-x);break;
            default -> System.out.println("La valeur absolue de "+x+"est: "+x);break;
        }
        */

    }
}
