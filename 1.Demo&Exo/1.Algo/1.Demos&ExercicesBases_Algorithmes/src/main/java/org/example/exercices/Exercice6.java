package org.example.exercices;

import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        /*double calcul = 10000*Math.pow(1+0.04,5);
        double calcul2 = Math.round(calcul*100)/100.0d;
        System.out.println(calcul);
        System.out.println(calcul2); */

        double c, t, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir capital de départ :");
        c = scanner.nextDouble();
        System.out.println("Saisir le taux en % :");
        t = scanner.nextDouble()/100;
        System.out.println("Saisir le nombre d'années :");
        n = scanner.nextDouble();

        double calcul = c*Math.pow((1+t),n);
        double calcul2 = Math.round(calcul*100)/100.0d;
        System.out.println("Pour un montant de " + c + " avec un taux de " + t + " au bout de " + n + " années, Le capital final est " +calcul2);


    }
}
