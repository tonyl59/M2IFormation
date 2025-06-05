package org.example;


public class Exercice96 {
    public static void main(String[] args) {
        int[] tableau = new int[6]; // on peut aussi faire int[] tableau = {23,150,12,28,59,2} ; pas besoin de remplir chaque ligne et de mettre le nom d'elements d'abord.
        tableau[0] = 23;
        tableau[1] = 150;
        tableau[2] = 12;
        tableau[3] = 28;
        tableau[4] = 59;
        tableau[5] = 2;

        int max = 0;
        int imax = 0;

        for ( int i= 0 ; i<tableau.length;i++){
            if (i==0){
                max = tableau[i];

            }else
            if (tableau[i] > max){
                max = tableau[i];
                imax = i;
            }

        }
        System.out.println("La valeur maximale est "+max+" à l'indice "+imax);
    }
}
