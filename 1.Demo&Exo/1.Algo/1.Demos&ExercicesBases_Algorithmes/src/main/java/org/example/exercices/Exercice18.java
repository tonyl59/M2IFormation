package org.example.exercices;


import java.util.Scanner;

public class Exercice18 {
    public static void main(String[] args) {
        int test = plus_grand_nombre(7,18);
        System.out.println("le plus grand nombre est "+test);

        int test2 = plus_grand_nombre(14,3);
        System.out.println("le plus grand nombre est "+test2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir le premier entier : ");
        int nb1 = scanner.nextInt();
        System.out.println("Saisir le deuxième entier : ");
        int nb2 = scanner.nextInt();
        int test3 = plus_grand_nombre(nb1, nb2);
        System.out.println("Votre plus grand nombre est : "+test3);
    }
    public static int plus_grand_nombre(int nb1, int nb2){ // l'equivalent de ça est Math.max(nbr1, nbr2)
        int pgnb; // = Plus Grand NomBre
        if (nb1>nb2){
            pgnb = nb1;
            }else{
            pgnb = nb2;
        }
        return pgnb;
    }

    public static int plusgrandV2(int nbr1, int nbr2){ // simplifié
        if(nbr1>nbr2){ //if avec une seule ligne, pas besoin de laisser les accolades mais c'est preferable de le faire
            return nbr1;
        }
        return nbr2;
    }
}
