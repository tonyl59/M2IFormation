package org.example.exercices;


import java.util.Scanner;
public class Exercice11 {
    public static void main(String[] args) {

        double c, t;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir capital de départ :");
        c = scanner.nextDouble();
        System.out.println("Saisir le taux en % :");
        t = scanner.nextDouble()/100;
        System.out.println("Saisir le nombre d'années :");
        n = 0;

        double cn = c*Math.pow((1+t),n);
        while (cn < 2*c){
            n++;
            cn = c*Math.pow((1+t),n); //
            System.out.println("le capital au bout de " + n + "année(s) est de " + Math.round(cn*100)/100.0d + " €");

        }
        //double calcul = c*Math.pow((1+t),n);
        System.out.println("Pour un montant de " + Math.round(c*100)/100.0d + " avec un taux de " + t + " Le capital final est doublé au bout de " + n + " année(s)");


    }
}
